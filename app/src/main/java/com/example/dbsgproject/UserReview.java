package com.example.dbsgproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserReview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_review);
        final Button Starbtn1 = findViewById(R.id.button6);
        final Button Starbtn2 = findViewById(R.id.button7);
        final Button Starbtn3 = findViewById(R.id.button8);
        final Button Starbtn4 = findViewById(R.id.button9);
        final Button Starbtn5 = findViewById(R.id.button10);


        Starbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Starbtn1.setBackgroundResource(R.drawable.yellowstar);
            }
        });
        Starbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Starbtn2.setBackgroundResource(R.drawable.yellowstar);
            }
        });
        Starbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Starbtn3.setBackgroundResource(R.drawable.yellowstar);
            }
        });
        Starbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Starbtn4.setBackgroundResource(R.drawable.yellowstar);
            }
        });
        Starbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Starbtn5.setBackgroundResource(R.drawable.yellowstar);
            }
        });
    }
}
