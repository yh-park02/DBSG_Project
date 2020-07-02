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

    F_Fragment_Search_RecipeListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  @Nullable ViewGroup containar,
                             @Nullable Bundle savedInstanceStanceState){

        View rootview = inflater.inflate(R.layout.fragment_search_recipe_list, containar, false);

        Button btn = (Button) rootview.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SearchActivity searchActivity = (SearchActivity)getActivity();
                searchActivity.changeFragment(0);
            }
        });

        Button btnCooking = (Button) rootview.findViewById(R.id.btnCooking);
        btnCooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent = new Intent(getActivity(), Recipe_Detail_Activity.class);
                startActivity(newintent);
            }
        });
//
//        // Adapter 생성 및 Adapter 지정.
//        adapter = new F_Fragment_Search_RecipeListAdapter() ;
//        setListAdapter(adapter) ;
//
//        RetrofitClient retrofitClient = new RetrofitClient();
//        Call<JsonObject> call = retrofitClient.apiService.getList();
//        call.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//
//                if(response.isSuccessful()){
//
//                    String data = response.body().toString() ;
//                    String data2 ="0";
//                    String data3 ="0";
//                    String data4 ="0";
//                    String data5 ="0";
//                    String data2_1 ="0";
//                    String data3_1 ="0";
//                    String data4_1 ="0";
//                    String data5_1 ="0";
//
//                    JsonParser Parser = new JsonParser();
//                    JsonObject jsonObj = (JsonObject) Parser.parse(data);
//                    JsonArray memberArray = (JsonArray) jsonObj.get("data");
//
//                    for(int i=0; i < memberArray.size(); i++){
//                        JsonObject object = (JsonObject) memberArray.get(i);
//                        System.out.println(memberArray.get(i));
//                        data2 = object.get("menu_name").toString();
//                        data3 = object.get("menu_reqMaterial").toString();
//                        data4 = object.get("menu_totalTime").toString();
//                        data2_1 = data2.substring(1, data2.length()-1 );
//                        data3_1 = data3.substring(1, data3.length()-1 );
//                        //data4_1 = data4.substring(1, data4.length()-1 );
//                        data4_1 = data4;
//
//                        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.testimg2),
//                                data2_1, data3_1,data4);
//                        System.out.println(data2.substring(1, data2.length()-1 ));
//                        System.out.println(data3.substring(1, data3.length()-1 ));
//                        System.out.println(data4_1);
//                    }
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

//        for(int i=0; i<30; i++) {
//            // 첫 번째 아이템 추가.
//            adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.testimg2),
//                    "석쇠닭발", "닭발, 고춧가루, 청양고추, 설탕");
//            // 두 번째 아이템 추가.
//            adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.testimg3),
//                    "새우구이", "새우, 굵은소금, 쿠킹호일");
//        }



        return super.onCreateView(inflater, containar, savedInstanceStanceState);
    }


    public void addItem(Drawable icon, String title, String desc, String menu_totalTime) {
        adapter.addItem(icon, title, desc,menu_totalTime) ;
    }



}
