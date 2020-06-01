package com.example.dbsgproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class SearchActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private Fragment_Search_RecipeCategory fragment_search_recipeCategory;
    private Fragment_Search_RecipeList fragment_search_recipeList;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        fragmentManager = getSupportFragmentManager();

        fragment_search_recipeCategory = new Fragment_Search_RecipeCategory();
        fragment_search_recipeList = new Fragment_Search_RecipeList();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_contrainer, fragment_search_recipeCategory).commitAllowingStateLoss();

    }

    //back button
    public void closeNewActivity(View view){
        finish();

    }


}
