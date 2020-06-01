package com.example.dbsgproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);


        final Button Readybtn = findViewById(R.id.button11);
        final Button Trimbtn = findViewById(R.id.button12);
        final Button Cookingbtn = findViewById(R.id.button13);
        final Button completebtn = findViewById(R.id.button14);


        Readybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Trimbtn.setTextColor("#aaaaaa"));
            }
        });

        Trimbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


         Cookingbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });


        completebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
