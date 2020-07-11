package com.example.dbsgproject.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dbsgproject.R;

import java.util.ArrayList;

public class F_RecipeList_ListViewAdapter extends BaseAdapter {

    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<F_RecipeList_ListViewItem> listViewItemList = new ArrayList<F_RecipeList_ListViewItem>() ;

    // ListViewAdapter의 생성자
    public F_RecipeList_ListViewAdapter() {

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return listViewItemList.size() ;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_f_recipe_list_customlistview, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        ImageView Food_img = (ImageView) convertView.findViewById(R.id.food_img) ;
        TextView Food_title = (TextView) convertView.findViewById(R.id.food_title) ;
        TextView Food_material = (TextView) convertView.findViewById(R.id.food_material) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        F_RecipeList_ListViewItem listViewItem = listViewItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        Food_img.setImageDrawable(listViewItem.getFood_img());
        Food_title.setText(listViewItem.getFood_title());
        Food_material.setText(listViewItem.getFood_material());

        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(Drawable icon, String title, String desc, String menu_totalTime,String menu_no) {
        F_RecipeList_ListViewItem item = new F_RecipeList_ListViewItem();

        item.setFood_img(icon);
        item.setFood_title(title);
        item.setFood_material(desc);
        item.setmenu_totalTime(menu_totalTime);
        item.setmenu_on(menu_no);

        listViewItemList.add(item);
    }

}
