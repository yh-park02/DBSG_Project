package com.example.dbsgproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NicknameOverlapTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname_overlap_test);

        Button confirmation_btn = findViewById(R.id.button5);
        final TextView testResults_tv = findViewById(R.id.textView3);
        final EditText NicknameOverlapTest_et = findViewById(R.id.editText);


        confirmation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        testResults_tv.setText(NicknameOverlapTest_et.getText());
            }
        });
    }
}
