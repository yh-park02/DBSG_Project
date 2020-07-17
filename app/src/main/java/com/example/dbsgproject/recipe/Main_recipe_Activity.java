package com.example.dbsgproject.recipe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dbsgproject.R;
import com.example.dbsgproject.main.F_RecipeList_ListViewAdapter;
import com.example.dbsgproject.retrofit.RetrofitClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import androidx.fragment.app.ListFragment;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class Main_recipe_Activity extends AppCompatActivity {
    TextView TV_food_title,TV_totalTime,TV_food_material;

    ListView simple_recipe_listView_RecyclerView;



    Simple_recipe_listViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recipe_);


        //adapter 생성
        adapter = new Simple_recipe_listViewAdapter();

        //리사이클러뷰 생성 및 adapter 연결
        simple_recipe_listView_RecyclerView = (ListView) findViewById(R.id.simple_recipe_listView_RecyclerView);
        simple_recipe_listView_RecyclerView.setAdapter(adapter);



        //액션바 안보이게
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TV_food_title = findViewById(R.id.textView);
        TV_food_material = findViewById(R.id.textView5);
        TV_totalTime= findViewById(R.id.textView4);


        Intent getintent = getIntent();
        System.out.println(getintent.getStringExtra("food_title_String")
                +getintent.getStringExtra("food_material_String")
                +getintent.getStringExtra("menu_totalTime_String")
                +"// 메뉴 넘버 : "
                +getintent.getStringExtra("menu_no")

        );


        //서버 오류 로 메뉴넘버로 받아오는 json 값 강제 기입 버전용
        String data = "{\"con\":\"success\",\"data\":{\"menuInfo\":{\"menu_no\":7,\"menu_name\":\"마늘 한 숟갈 라면\",\"menu_image\":\"\",\"menu_description\":\"한국라면에 한국 더하기\",\"menu_reqMaterial\":\"김치, 마늘\",\"menu_needlessMaterial\":\"오향장육,\",\"menu_star\":0.0,\"menu_tag\":\"4,5,6,7,10,21,30,41\",\"menu_totalTime\":600,\"menu_writer\":\"admin\",\"menu_preferCnt\":1,\"menu_readCnt\":3},\"recipe\":[{\"recipe_no\":3,\"menu_no\":7,\"recipe_processNo\":1,\"recipe_action\":\"라면 뜯기\",\"recipe_fire\":1,\"recipe_reqTime\":10,\"recipe_image\":\"\"},{\"recipe_no\":4,\"menu_no\":7,\"recipe_processNo\":2,\"recipe_action\":\"물 끓이기\",\"recipe_fire\":5,\"recipe_reqTime\":120,\"recipe_image\":\"\"},{\"recipe_no\":5,\"menu_no\":7,\"recipe_processNo\":3,\"recipe_action\":\"스프 면, 넣구 끓이기\",\"recipe_fire\":5,\"recipe_reqTime\":120,\"recipe_image\":\"\"},{\"recipe_no\":6,\"menu_no\":7,\"recipe_processNo\":4,\"recipe_action\":\"다 끓이고, 마지막에 마늘 한 숟갈 첨가\",\"recipe_fire\":1,\"recipe_reqTime\":10,\"recipe_image\":\"\"}]},\"size\":4,\"recipe\":\"success\",\"keyword\":7}";

        JsonParser Parser = new JsonParser();
        JsonObject jsonObj = (JsonObject) Parser.parse(data);
        //첫 size 가져오기
        int memberArray = Integer.parseInt(jsonObj.get("size").toString());

        //menuInfo,recipe 구분
        JsonObject memberArray2 = (JsonObject) jsonObj.get("data");
        JsonArray memberArray3 = (JsonArray) memberArray2.get("recipe");



        for(int i=0; i < memberArray3.size(); i++) {
            JsonObject object = (JsonObject) memberArray3.get(i);


            String menu_name = object.get("recipe_action").toString();
            String recipe_processNo = object.get("recipe_processNo").toString();
            adapter.addItem(recipe_processNo,menu_name);

            System.out.println(menu_name);

        }
//서버 오류 로 메뉴넘버로 받아오는 json 값 강제 기입 버전용 -끝


//        RetrofitClient retrofitClient = new RetrofitClient();
//        Call<JsonObject> call = retrofitClient.apiService.getmenu_no(getintent.getStringExtra("menu_no"));
//        call.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//
//                if(response.isSuccessful()){
//
//                    String data = response.body().toString();
//
//                    JsonParser Parser = new JsonParser();
//                    JsonObject jsonObj = (JsonObject) Parser.parse(data);
//                    //첫 size 가져오기
//                    int memberArray = Integer.parseInt(jsonObj.get("size").toString());
//
//                    //menuInfo,recipe 구분
//                    JsonObject memberArray2 = (JsonObject) jsonObj.get("data");
//                    JsonArray memberArray3 = (JsonArray) memberArray2.get("recipe");
//
//
//
//                    for(int i=0; i < memberArray3.size(); i++) {
//                        JsonObject object = (JsonObject) memberArray3.get(i);
//
//
//
//                        String menu_name = object.get("recipe_action").toString();
//                        System.out.println(menu_name);
//                    }
//
//
//                }
//            }
//
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                Log.e("***Error****",t.toString());
//            }
//        });


        TV_food_title.setText(getintent.getStringExtra("food_title_String"));
        TV_food_material.setText(getintent.getStringExtra("food_material_String"));
        TV_totalTime.setText(getintent.getStringExtra("menu_totalTime_String"));


    }
}
