package com.example.dbsgproject.search;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.dbsgproject.R;

public class SearchActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private Fragment_Search_RecipeCategory fragment_search_recipeCategory;
    private Fragment_Search_RecipeList fragment_search_recipeList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        fragment_search_recipeCategory = new Fragment_Search_RecipeCategory();
        fragment_search_recipeList = new Fragment_Search_RecipeList();
        changeFragment(0);

        //액션바 안보이게
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

/*
        fragmentManager = getSupportFragmentManager();

        fragment_search_recipeCategory = new Fragment_Search_RecipeCategory();
        //fragment_search_recipeList = new Fragment_Search_RecipeList();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_contrainer, fragment_search_recipeCategory).commitAllowingStateLoss();

 */
    }

    public void changeFragment(int index){
        if(index == 0){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contrainer, fragment_search_recipeCategory).commit();
        }else if(index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contrainer, fragment_search_recipeList).commit();
        }
    }

    //back button
    public void closeNewActivity(View view){
        finish();

    }


}
