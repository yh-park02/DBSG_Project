package com.example.dbsgproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Search_RecipeCategory extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup containar,
                             @Nullable Bundle savedInstanceStanceState){

        View rootview = inflater.inflate(R.layout.fragment_seaech_recipe_category, containar, false);

        Button btn = (Button) rootview.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                SearchActivity searchActivity = (SearchActivity)getActivity();
                searchActivity.changeFragment(1);
            }
        });
        return rootview;

      // return inflater.inflate(R.layout.fragment_seaech_recipe_category, containar, false);

    }



}
