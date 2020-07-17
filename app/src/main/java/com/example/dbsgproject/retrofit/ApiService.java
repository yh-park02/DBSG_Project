package com.example.dbsgproject.retrofit;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {


    @GET("menu/search/{search}")
    Call<JsonObject> getSearch(@Path("search") String Search);

    @GET("recipe/{menu_no}")
    Call<JsonObject> getmenu_no(@Path("menu_no") String menu_no);


    @GET("menu/tag/{tag}")
    Call<JsonObject> gettag(@Path("tag") String tag);

    @GET("menu/list")
    Call<JsonObject> getList();


}
