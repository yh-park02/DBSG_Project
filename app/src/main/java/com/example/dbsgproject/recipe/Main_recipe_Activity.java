package com.example.dbsgproject.recipe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dbsgproject.R;

public class Main_recipe_Activity extends AppCompatActivity {
    TextView TV_food_title,TV_totalTime,TV_food_material;
    //String food_title,food_material,menu_totalTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recipe_);

        //액션바 안보이게
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TV_food_title = findViewById(R.id.textView);
        TV_food_material = findViewById(R.id.textView5);
        TV_totalTime= findViewById(R.id.textView4);


        Intent getintent = getIntent();
        System.out.println(getintent.getStringExtra("food_title_String")
                +getintent.getStringExtra("food_material_String")
                +getintent.getStringExtra("menu_totalTime_String")
                +"// 메뉴 넘버 : "
                +getintent.getStringExtra("menu_no")

        );

        TV_food_title.setText(getintent.getStringExtra("food_title_String"));
        TV_food_material.setText(getintent.getStringExtra("food_material_String"));
        TV_totalTime.setText(getintent.getStringExtra("menu_totalTime_String"));


    }
}
