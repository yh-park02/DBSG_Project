package com.example.dbsgproject.loading;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.dbsgproject.main.MainActivity;
import com.example.dbsgproject.recipe.Main_recipe_Activity;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try {

            //Thread.sleep(3000);
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        //기본
        startActivity(new Intent(this,MainActivity.class));
        //테스트용
        //startActivity(new Intent(this, Main_recipe_Activity.class));
        finish();
    }
}
