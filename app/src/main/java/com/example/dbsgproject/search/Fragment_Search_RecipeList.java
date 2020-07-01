package com.example.dbsgproject.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dbsgproject.recipe.CookingActivity;
import com.example.dbsgproject.R;
import com.example.dbsgproject.recipe.Recipe_Detail_Activity;

public class Fragment_Search_RecipeList extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup containar,
                             @Nullable Bundle savedInstanceStanceState){

        View rootview = inflater.inflate(R.layout.fragment_search_recipe_list, containar, false);

        Button btn = (Button) rootview.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SearchActivity searchActivity = (SearchActivity)getActivity();
                searchActivity.changeFragment(0);
            }
        });

        Button btnCooking = (Button) rootview.findViewById(R.id.btnCooking);
        btnCooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent = new Intent(getActivity(), Recipe_Detail_Activity.class);
                startActivity(newintent);
            }
        });

        return rootview;
        //return inflater.inflate(R.layout.fragment_search_recipe_list, containar, false);
    }
}
