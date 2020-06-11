package com.example.dbsgproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawer;
    ActionBarDrawerToggle toggle; //DrawerLayout을 제어할 수 있는 toggle
    boolean isDrawerOpend; //현재 열려있는지 안열려있는지 판단

    private FragmentManager fragmentManager;
    private Fragment_RecipeImg fragment_recipeImg;
    private Fragment_RecipeList fragment_recipeList;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*액션바
          getSupportActionBar().setDisplayShowTitleEnabled(false);
         */

        /*액션바 설정 - 아이콘표시
        ActionBar ab = getSupportActionBar();
                ab.setIcon(R.drawable.crown);
                ab.setDisplayUseLogoEnabled(true);
                ab.setDisplayShowHomeEnabled(true);
          */
        //Custom ActionBar
        ActionBar ab = getSupportActionBar();
            ab.setDisplayShowTitleEnabled(false); //기본타이틀 사용 안함
            ab.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); //커스텀 사용
            ab.setCustomView(R.layout.custom_title); //커스텀에 사용할 파일 위치




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
                    Toast.makeText(getApplicationContext(), "즐겨찾기", Toast.LENGTH_SHORT).show();
                }else if(id==R.id.menu_drawer_profile){
                    Toast.makeText(getApplicationContext(), "프로필관리", Toast.LENGTH_SHORT).show();
                }else if(id==R.id.menu_drawer_setting){
                    Toast.makeText(getApplicationContext(), "설정", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        //프래그먼트
        fragmentManager = getSupportFragmentManager();

        fragment_recipeImg = new Fragment_RecipeImg();
        fragment_recipeList = new Fragment_RecipeList();

        transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.FragmentArea1, fragment_recipeImg);
        transaction.replace(R.id.FragmentArea2, fragment_recipeList);

        transaction.commit();


    }//onCreate


    //search 옵션메뉴
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_search, menu);

        //getMenuInflater().inflate(R.menu.main_optionmenu, menu);

        return true;
    }
    //옵션메뉴들 이벤트
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (toggle.onOptionsItemSelected(item)) {
            return false;

        } else if (id == R.id.action_search) {
            Intent searchIntent = new Intent(this, SearchActivity.class);
            startActivity(searchIntent);
            //Toast.makeText(getApplicationContext(), "버튼을 눌렀다.", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    //로그인 화면으로 이동
    public void goLogin(View view){
        Intent newintent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(newintent);

    }




/*
    //검색 화면으로 이동
    public void goSearch(View view){
        Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
        startActivity(intent);
    }
*/
}
