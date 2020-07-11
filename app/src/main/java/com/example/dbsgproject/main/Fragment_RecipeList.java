package com.example.dbsgproject.main;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.ListFragment;

import com.example.dbsgproject.R;
import com.example.dbsgproject.recipe.Main_recipe_Activity;
import com.example.dbsgproject.retrofit.RetrofitClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_RecipeList extends ListFragment {

    F_RecipeList_ListViewAdapter adapter ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Adapter 생성 및 Adapter 지정.
        adapter = new F_RecipeList_ListViewAdapter() ;
        setListAdapter(adapter) ;



        RetrofitClient retrofitClient = new RetrofitClient();
        Call<JsonObject> call = retrofitClient.apiService.getList();



        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

                if(response.isSuccessful()){



                    String data = response.body().toString();

                    String menu_name ="0";
                    String menu_reqMaterial ="0";
                    String menu_totalTime ="0";
                    String data5 ="0";
                    String menu_no ="0";
                    String menu_name_org ="0";
                    String menu_reqMaterial_org ="0";
                    String menu_totalTime_String ="0";
                    String data5_1 ="0";

                    JsonParser Parser = new JsonParser();
                    JsonObject jsonObj = (JsonObject) Parser.parse(data);
                    JsonArray memberArray = (JsonArray) jsonObj.get("data");




                    for(int i=0; i < memberArray.size(); i++){
                        JsonObject object = (JsonObject) memberArray.get(i);

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



        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onListItemClick (ListView l, View v, int position, long id) {
        // get TextView's Text.
        F_RecipeList_ListViewItem item = (F_RecipeList_ListViewItem) l.getItemAtPosition(position);

        String food_title = item.getFood_title() ;
        String food_material = item.getFood_material() ;
        String menu_totalTime =  item.getmenu_totalTime();
        String menu_no = item.getmenu_on();

        Drawable food_img = item.getFood_img() ;

        Toast.makeText(getActivity(), food_title+" : "+food_material+" : "+menu_totalTime, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getActivity(), Main_recipe_Activity.class);
        intent.putExtra("food_title_String",food_title);
        intent.putExtra("food_material_String",food_material);
        intent.putExtra("menu_totalTime_String",menu_totalTime);
        intent.putExtra("menu_no",menu_no);
        System.out.println(menu_totalTime);

        startActivity(intent);

    }

    public void addItem(Drawable icon, String title, String desc, String menu_totalTime,String menu_no) {
        adapter.addItem(icon, title, desc,menu_totalTime,menu_no) ;
    }



}
