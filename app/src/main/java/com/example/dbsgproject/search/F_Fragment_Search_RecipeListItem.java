package com.example.dbsgproject.search;

import android.graphics.drawable.Drawable;

class F_Fragment_Search_RecipeListItem {

    private Drawable Search_food_img ;
    private String Search_food_title ;
    private String Search_food_material ;
    private String Search_menu_totalTime;

    public Drawable getSearch_Food_img() {
        return Search_food_img;
    }

    public void setSearch_Food_img(Drawable Search_food_img) {
        this.Search_food_img = Search_food_img;
    }

    public String getSearch_Food_title() {
        return Search_food_title;
    }

    public void setSearch_Food_title(String food_title) {
        this.Search_food_title = food_title;
    }

    public String getSearch_menu_totalTime() {
        return Search_menu_totalTime;
    }
    public void setSearch_menu_totalTime(String Search_food_material) {
        this.Search_menu_totalTime = Search_food_material;
    }

    public String getSearch_Food_material() {
        return Search_food_material;
    }

    public void setSearch_Food_material(String Search_menu_totalTime) {
        this.Search_food_material = Search_menu_totalTime;
    }
}
