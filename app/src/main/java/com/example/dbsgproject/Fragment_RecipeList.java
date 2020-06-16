package com.example.dbsgproject;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

public class Fragment_RecipeList extends ListFragment {

    F_RecipeList_ListViewAdapter adapter ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Adapter 생성 및 Adapter 지정.
        adapter = new F_RecipeList_ListViewAdapter() ;
        setListAdapter(adapter) ;

        for(int i=0; i<30; i++) {
            // 첫 번째 아이템 추가.
            adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.testimg2),
                    "석쇠닭발", "닭발, 고춧가루, 청양고추, 설탕");
            // 두 번째 아이템 추가.
            adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.testimg3),
                    "새우구이", "새우, 굵은소금, 쿠킹호일");
        }

        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onListItemClick (ListView l, View v, int position, long id) {
        // get TextView's Text.
        F_RecipeList_ListViewItem item = (F_RecipeList_ListViewItem) l.getItemAtPosition(position);
        Toast.makeText(getActivity(), "클릭", Toast.LENGTH_SHORT).show();

        //String food_title = item.getFood_title() ;
        //String food_material = item.getFood_material() ;
        //Drawable food_img = item.getFood_img() ;




    }

    public void addItem(Drawable icon, String title, String desc) {
        adapter.addItem(icon, title, desc) ;
    }



}
