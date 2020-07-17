package com.example.dbsgproject.recipe;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dbsgproject.R;
import com.example.dbsgproject.main.F_RecipeList_ListViewItem;

import java.util.ArrayList;


public class Simple_recipe_listViewAdapter extends BaseAdapter {

    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<Simple_recipe_listViewItem> Simple_recipe_listViewItem_List = new ArrayList<Simple_recipe_listViewItem>() ;

    // ListViewAdapter의 생성자
    public Simple_recipe_listViewAdapter() {

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return Simple_recipe_listViewItem_List.size() ;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item_List" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_recipe_action, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득

        TextView simple_recipe_no = (TextView) convertView.findViewById(R.id.simple_recipe_no) ;
        TextView simple_recipe_contents = (TextView) convertView.findViewById(R.id.simple_recipe_contents) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        Simple_recipe_listViewItem listViewItem_List = Simple_recipe_listViewItem_List.get(position);

        // 아이템 내 각 위젯에 데이터 반영

        simple_recipe_no.setText(listViewItem_List.getSimple_recipe_no());
        simple_recipe_contents.setText(listViewItem_List.getSimple_recipe_list());

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
        return Simple_recipe_listViewItem_List.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(String recipe_no, String recipe_list) {
        Simple_recipe_listViewItem item = new Simple_recipe_listViewItem();


        item.setSimple_recipe_no(recipe_no);
        item.setSimple_recipe_list(recipe_list);

        Simple_recipe_listViewItem_List.add(item);
    }

}
