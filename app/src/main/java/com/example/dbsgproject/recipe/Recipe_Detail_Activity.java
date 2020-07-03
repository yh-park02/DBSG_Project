package com.example.dbsgproject.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.dbsgproject.R;

import me.relex.circleindicator.CircleIndicator;

public class Recipe_Detail_Activity extends AppCompatActivity {

    Recipe_Detail_Adapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe__detail);

        viewPager = (ViewPager) findViewById(R.id.view);
        adapter = new Recipe_Detail_Adapter(this);
        viewPager.setAdapter(adapter);
        

        // CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
       // indicator.setViewPager(viewPager);
    }
}
