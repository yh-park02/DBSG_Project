package com.example.dbsgproject.retrofit;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("menu/list")
    Call<JsonArray> getretrofitdata();

    @GET("menu/search/{search}")
    Call<JsonObject> getSearch(@Path("search") String Search);


    @GET("menu/list")
    Call<JsonObject> getList();


}
