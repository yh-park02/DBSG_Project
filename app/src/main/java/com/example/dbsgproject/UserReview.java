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

        final int[] x = {0};
        Starbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(x[0] ==0) {
                    Starbtn1.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn2.setBackgroundResource(R.drawable.whitestar);
                    Starbtn3.setBackgroundResource(R.drawable.whitestar);
                    Starbtn4.setBackgroundResource(R.drawable.whitestar);
                    Starbtn5.setBackgroundResource(R.drawable.whitestar);

                    x[0]=1;
                }else if(x[0] >=2) {
                    Starbtn1.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn2.setBackgroundResource(R.drawable.whitestar);
                    Starbtn3.setBackgroundResource(R.drawable.whitestar);
                    Starbtn4.setBackgroundResource(R.drawable.whitestar);
                    Starbtn5.setBackgroundResource(R.drawable.whitestar);

                    x[0]=1;
                }else  if(x[0] == 1) {
                    Starbtn1.setBackgroundResource(R.drawable.whitestar);
                    Starbtn2.setBackgroundResource(R.drawable.whitestar);
                    Starbtn3.setBackgroundResource(R.drawable.whitestar);
                    Starbtn4.setBackgroundResource(R.drawable.whitestar);
                    Starbtn5.setBackgroundResource(R.drawable.whitestar);
                    x[0] = 0;
                }

            }
        });
        Starbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(x[0] != 2) {
                    Starbtn1.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn2.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn3.setBackgroundResource(R.drawable.whitestar);
                    Starbtn4.setBackgroundResource(R.drawable.whitestar);
                    Starbtn5.setBackgroundResource(R.drawable.whitestar);
                    x[0]=2;
                }else  if(x[0] ==2) {
                    Starbtn1.setBackgroundResource(R.drawable.whitestar);
                    Starbtn2.setBackgroundResource(R.drawable.whitestar);
                    x[0] = 0;
                }


            }
        });
        Starbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(x[0] !=3) {
                    Starbtn1.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn2.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn3.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn4.setBackgroundResource(R.drawable.whitestar);
                    Starbtn5.setBackgroundResource(R.drawable.whitestar);
                    x[0] =3;
                }else  if(x[0] ==3) {
                    Starbtn1.setBackgroundResource(R.drawable.whitestar);
                    Starbtn2.setBackgroundResource(R.drawable.whitestar);
                    Starbtn3.setBackgroundResource(R.drawable.whitestar);
                    Starbtn4.setBackgroundResource(R.drawable.whitestar);
                    Starbtn5.setBackgroundResource(R.drawable.whitestar);
                    x[0] = 0;
                }

            }
        });
        Starbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(x[0] !=4) {
                    Starbtn1.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn2.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn3.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn4.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn5.setBackgroundResource(R.drawable.whitestar);
                    x[0]=4;
                }else  if(x[0] ==4) {
                    Starbtn1.setBackgroundResource(R.drawable.whitestar);
                    Starbtn2.setBackgroundResource(R.drawable.whitestar);
                    Starbtn3.setBackgroundResource(R.drawable.whitestar);
                    Starbtn4.setBackgroundResource(R.drawable.whitestar);
                    Starbtn5.setBackgroundResource(R.drawable.whitestar);
                    x[0] = 0;
                }

            }
        });
        Starbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x[0] !=5) {
                    Starbtn1.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn2.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn3.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn4.setBackgroundResource(R.drawable.yellowstar);
                    Starbtn5.setBackgroundResource(R.drawable.yellowstar);
                    x[0]=5;
                }else  if(x[0] ==5) {
                    Starbtn1.setBackgroundResource(R.drawable.whitestar);
                    Starbtn2.setBackgroundResource(R.drawable.whitestar);
                    Starbtn3.setBackgroundResource(R.drawable.whitestar);
                    Starbtn4.setBackgroundResource(R.drawable.whitestar);
                    Starbtn5.setBackgroundResource(R.drawable.whitestar);
                    x[0] = 0;
                }
            }
        });
    }
}
