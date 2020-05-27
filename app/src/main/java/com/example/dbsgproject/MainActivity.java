package com.example.dbsgproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    //영희ㅋㅋㅋㅋㅋㅋㅋㅋㅋ

    DrawerLayout drawer;
    ActionBarDrawerToggle toggle; //DrawerLayout을 제어할 수 있는 toggle
    boolean isDrawerOpend; //현재 열려있는지 안열려있는지 판단

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        drawer = findViewById(R.id.main_drawer);
        toggle = new ActionBarDrawerToggle(this, drawer, R.string.drawer_open, R.string.drawer_close);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.main_drawer_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.menu_drawer_bookmark){
                    showToast("즐겨찾기");
                }else if(id==R.id.menu_drawer_profile){
                    showToast("프로필설정");
                }else if(id==R.id.menu_drawer_setting){
                    showToast("설정");
                }
                return false;
            }
        });
    }//onCreate

    //search 메뉴
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_optionmenu, menu);
        return true;
    }

    //이벤트 처리
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return false;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showToast(String message){
        Toast toast=Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

    //로그인 화면으로
    public void goLogin(View view){
        Intent newintent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(newintent);
    }

}
