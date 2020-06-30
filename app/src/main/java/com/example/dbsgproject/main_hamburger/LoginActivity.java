package com.example.dbsgproject.main_hamburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dbsgproject.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        try {
//            Thread.sleep(3000);
//        }catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //기본
        startActivity(new Intent(this, PeristalsisLoginActivity.class));

        finish();
    }
}
