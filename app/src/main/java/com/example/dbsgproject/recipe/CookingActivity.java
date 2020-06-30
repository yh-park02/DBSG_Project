package com.example.dbsgproject.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dbsgproject.R;
import com.example.dbsgproject.review.UserReview;

public class CookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);


        final Button Readybtn = findViewById(R.id.button11);
        final Button Trimbtn = findViewById(R.id.button12);
        final Button Cookingbtn = findViewById(R.id.button13);
        final Button completebtn = findViewById(R.id.button14);
        Button UserRevuewbtm = findViewById(R.id.button15);
        final TextView titleTV = findViewById(R.id.textView22);


        Readybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Readybtn.setTextColor(Color.BLACK);
                Trimbtn.setTextColor(Color.GRAY);
                Cookingbtn.setTextColor(Color.GRAY);
                completebtn.setTextColor(Color.GRAY);
                titleTV.setText(Readybtn.getText());


            }
        });

        Trimbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Trimbtn.setTextColor(Color.BLACK);
                Readybtn.setTextColor(Color.GRAY);
                Cookingbtn.setTextColor(Color.GRAY);
                completebtn.setTextColor(Color.GRAY);
                titleTV.setText(Trimbtn.getText());
            }
        });


         Cookingbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Cookingbtn.setTextColor(Color.BLACK);
                 Trimbtn.setTextColor(Color.GRAY);
                 Readybtn.setTextColor(Color.GRAY);
                 completebtn.setTextColor(Color.GRAY);
                 titleTV.setText(Cookingbtn.getText());
             }
         });


        completebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                completebtn.setTextColor(Color.BLACK);
                Trimbtn.setTextColor(Color.GRAY);
                Readybtn.setTextColor(Color.GRAY);
                Cookingbtn.setTextColor(Color.GRAY);
                titleTV.setText(completebtn.getText());

            }
        });


        UserRevuewbtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UserReview.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
