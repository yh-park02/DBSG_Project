package com.example.dbsgproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Total_RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total__recipe);
    }

    public void cooking(View view){
        Intent newintent = new Intent(getApplicationContext(), CookingActivity.class);
        startActivity(newintent);
    }
}
