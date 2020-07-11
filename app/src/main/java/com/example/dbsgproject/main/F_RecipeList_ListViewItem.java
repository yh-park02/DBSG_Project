package com.example.dbsgproject.main;

import android.graphics.drawable.Drawable;

public class F_RecipeList_ListViewItem {

    private Drawable food_img ;
    private String food_title ;
    private String food_material ;
    private String menu_totalTime;
    private String getmenu_on;

    public Drawable getFood_img() {
        return food_img;
    }

    public void setFood_img(Drawable food_img) {
        this.food_img = food_img;
    }

    public String getFood_title() {
        return food_title;
    }

    public void setFood_title(String food_title) {
        this.food_title = food_title;
    }

    public String getmenu_totalTime() {
        return menu_totalTime;
    }

    public void setmenu_totalTime(String menu_totalTime) {
        this.menu_totalTime = menu_totalTime;
    }

    public String getFood_material() {
        return food_material;
    }

    public void setFood_material(String food_material) {
        this.food_material = food_material;
    }


    public void setmenu_on(String getmenu_on) {
        this.getmenu_on = getmenu_on;
    }
    public String getmenu_on() {
        return getmenu_on;
    }
}
