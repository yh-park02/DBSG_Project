package com.example.dbsgproject.recipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.PagerAdapter;

import com.example.dbsgproject.R;

public class Recipe_Detail_Adapter extends PagerAdapter {

    private int[] images = {R.drawable.testimg3,
            R.drawable.testimg4, R.drawable.testimg2};
    private LayoutInflater inflater;
    private Context context;

    public Recipe_Detail_Adapter(Context context){
        this.context = context;
    }

    //뷰페이저의 전체 페이지 수를 결정
    @Override
    public int getCount() {
        return images.length;
    }

    //페이지뷰가 키 객체와 연관되어있는지 확인
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    //화면에 표시할 페이지뷰 생성
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.item_recipe_detail_slider, container, false);

        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        container.addView(v);
        return v;
    }

    //position 위치의 페이지 제거
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}
