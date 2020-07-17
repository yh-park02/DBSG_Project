package com.example.dbsgproject.search;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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


        final EditText editText2 = findViewById(R.id.editText);
        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                switch (actionId) {
                    case EditorInfo.IME_ACTION_SEARCH:
                        // 검색 동작

                        break;
                    default:
                        // 기본 엔터키 동작
//                        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
//                        imm.hideSoftInputFromWindow(editText2.getWindowToken(), 0);

                        changeFragment(1);
                        return false;
                }
                return true;
            }
        });



    }

    public void changeFragment(int index){
        if(index == 0){


            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contrainer, fragment_search_recipeCategory).commit();


        }else if(index == 1){





            //태그 프래그먼트에서 받은 값 출력
            System.out.println("========================태그 프래그먼트에서 받은 값 출력1");
            System.out.println(msearch_Value_test2);
            System.out.println("========================태그 프래그먼트에서 받은 값 출력1");

            final EditText editText2 = findViewById(R.id.editText);

            Bundle bundle = new Bundle(); //검색 액티비티에서 프래그먼트로 값 전달하기
            if(msearch_Value_test2 != null) {
                bundle.putString("tag_num2", msearch_Value_test2); // key , value
            }else if(editText2.getText().toString() != null) {
                bundle.putString("search_Value", editText2.getText().toString());//텍스트 검색 값 넘기기
            }
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


    public void search_value(){


    }



}
