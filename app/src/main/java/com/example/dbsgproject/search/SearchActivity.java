package com.example.dbsgproject.search;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.dbsgproject.R;

public class SearchActivity extends AppCompatActivity implements Fragment_Search_RecipeCategory.Search_Value_Listener {

    private Fragment_Search_RecipeCategory fragment_search_recipeCategory;
    private Fragment_Search_RecipeList fragment_search_recipeList;

    String msearch_Value_test2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //액션바 안보이게
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        fragment_search_recipeCategory = new Fragment_Search_RecipeCategory();
        fragment_search_recipeList = new Fragment_Search_RecipeList();
        changeFragment(0);


    }

    public void changeFragment(int index){
        if(index == 0){


            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contrainer, fragment_search_recipeCategory).commit();


        }else if(index == 1){



            //태그 프래그먼트에서 받은 값 출력
            System.out.println("========================태그 프래그먼트에서 받은 값 출력1");
            System.out.println(msearch_Value_test2);
            System.out.println("========================태그 프래그먼트에서 받은 값 출력1");



            Bundle bundle = new Bundle(); //검색 액티비티에서 프래그먼트로 값 전달하기
            bundle.putString("tag_num2", msearch_Value_test2); // key , value

            fragment_search_recipeList.setArguments(bundle);



                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contrainer, fragment_search_recipeList).commit();

            }
        }


    //back button
    public void closeNewActivity(View view){
        finish();

    }



    @Override
    public void search_Value_Set(String search_Value_tag) {
        msearch_Value_test2 = search_Value_tag;
    }
}
