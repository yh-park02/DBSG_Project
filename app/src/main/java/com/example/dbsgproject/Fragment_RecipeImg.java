package com.example.dbsgproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_RecipeImg extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup containar,
                             @Nullable Bundle savedInstanceStanceState){
        return inflater.inflate(R.layout.fragment_recipeimg, containar, false);

    }
}
