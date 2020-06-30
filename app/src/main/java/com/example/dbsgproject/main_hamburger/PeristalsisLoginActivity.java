package com.example.dbsgproject.main_hamburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dbsgproject.R;
import com.example.dbsgproject.main_hamburger.NicknameOverlapTestActivity;

public class PeristalsisLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peristalsis_login);

        Button google_btn = findViewById(R.id.button2);
        Button kakao_btn = findViewById(R.id.button3);
        Button naver_btn = findViewById(R.id.button4);

        google_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NicknameOverlapTestActivity.class);
                startActivity(intent);
            }
        });

        kakao_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NicknameOverlapTestActivity.class);
                startActivity(intent);
            }
        });

        naver_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NicknameOverlapTestActivity.class);
                startActivity(intent);
            }
        });
    }
}
