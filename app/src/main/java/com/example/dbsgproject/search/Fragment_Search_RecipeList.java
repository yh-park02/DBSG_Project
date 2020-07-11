package com.example.dbsgproject.search;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import com.example.dbsgproject.main.F_RecipeList_ListViewAdapter;
import com.example.dbsgproject.main.F_RecipeList_ListViewItem;
import com.example.dbsgproject.recipe.CookingActivity;
import com.example.dbsgproject.R;
import com.example.dbsgproject.recipe.Main_recipe_Activity;
import com.example.dbsgproject.recipe.Recipe_Detail_Activity;
import com.example.dbsgproject.retrofit.RetrofitClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_Search_RecipeList extends ListFragment {

   F_RecipeList_ListViewAdapter adapter;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  @Nullable ViewGroup containar,
                             @Nullable Bundle savedInstanceStanceState){

        System.out.println("tag_test ====================================");
        if(getArguments().getString("tag_num2") != null){
            String tag = getArguments().getString("tag_num2");
            System.out.println(tag);
            // 전달된 key 값


        }



        View rootview = inflater.inflate(R.layout.fragment_search_recipe_list, containar, false);


        // Adapter 생성 및 Adapter 지정.
        adapter = new F_RecipeList_ListViewAdapter() ;
        setListAdapter(adapter) ;


        RetrofitClient retrofitClient = new RetrofitClient();

        Call<JsonObject> call = retrofitClient.apiService.getList();

            if(getArguments().getString("tag_num2") != null){

                String tag = getArguments().getString("tag_num2");
                call = retrofitClient.apiService.gettag(tag);
            }else if (getArguments().getString("tag_num2") == null){
                call = retrofitClient.apiService.getList();
            }


    call.enqueue(new Callback<JsonObject>() {
     @Override
     public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

     if(response.isSuccessful()){


         adapter = new F_RecipeList_ListViewAdapter() ;
         setListAdapter(adapter) ;

         String data = response.body().toString();

         String menu_name ="0";
         String menu_reqMaterial ="0";
         String menu_totalTime ="0";
         String menu_no = "0";
         String data5 ="0";
         String menu_name_org ="0";
         String menu_reqMaterial_org ="0";
         String menu_totalTime_String ="0";
         String data5_1 ="0";

         JsonParser Parser = new JsonParser();
         JsonObject jsonObj = (JsonObject) Parser.parse(data);
         JsonArray memberArray = (JsonArray) jsonObj.get("data");




         for(int i=0; i < memberArray.size(); i++){
             JsonObject object = (JsonObject) memberArray.get(i);


             System.out.println("순서 : "+(i));
             System.out.println(memberArray.get(i));

             menu_name = object.get("menu_name").toString();
             menu_reqMaterial = object.get("menu_reqMaterial").toString();
             menu_totalTime = object.get("menu_totalTime").toString();
             menu_no = object.get("menu_no").toString();
             menu_name_org = menu_name.substring(1, menu_name.length()-1 );
             menu_reqMaterial_org = menu_reqMaterial.substring(1, menu_reqMaterial.length()-1 );

             menu_totalTime_String = menu_totalTime;


             adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.testimg2),
                     menu_name_org, menu_reqMaterial_org,menu_totalTime,menu_no);

             System.out.println(menu_name.substring(1, menu_name.length()-1));
             System.out.println(menu_reqMaterial.substring(1, menu_reqMaterial.length()-1 ));
             System.out.println(menu_totalTime_String);


             }

         }
     }


            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.e("***Error****",t.toString());
            }
        });


        return super.onCreateView(inflater, containar, savedInstanceStanceState);
    }


    //ListView 아이템 클릭이벤트를 처리
    @Override
    public void onListItemClick (ListView l, View v, int position, long id) {
        F_RecipeList_ListViewItem item = (F_RecipeList_ListViewItem) l.getItemAtPosition(position) ;

        String food_title = item.getFood_title() ;
        String food_material = item.getFood_material() ;
        String menu_totalTime =  item.getmenu_totalTime();
        String menu_no = item.getmenu_on();
        Drawable food_img = item.getFood_img() ;

        System.out.println("클릭 테스트 : "+food_title+food_material+menu_totalTime+food_img+" // 메뉴 넘버 :"+menu_no);

        Intent intent = new Intent(getActivity(), Main_recipe_Activity.class);
        intent.putExtra("food_title_String",food_title);
        intent.putExtra("food_material_String",food_material);
        intent.putExtra("menu_totalTime_String",menu_totalTime);
        intent.putExtra("menu_no",menu_no);
        System.out.println(menu_totalTime);

        startActivity(intent);
    }

    //ListFragment 외부(Activity)에서 아이템 추가를 위한 함수
    public void addItem(Drawable icon, String title, String desc, String menu_totalTime,String menu_no) {
        adapter.addItem(icon, title, desc,menu_totalTime,menu_no) ;
    }

}
