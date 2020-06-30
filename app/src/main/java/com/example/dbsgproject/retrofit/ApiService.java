package com.example.dbsgproject.retrofit;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("test")
    Call<JsonArray> localTest();

    @GET("menu/list")
    Call<JsonArray> getretrofitdata();

    @GET("menu/list")
    Call<JsonObject> getList();


    @GET("users/2")
    Call<JsonObject> getObj();

}
