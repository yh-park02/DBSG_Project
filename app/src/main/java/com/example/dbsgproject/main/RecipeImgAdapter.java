package com.example.dbsgproject.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.PagerAdapter;

import com.example.dbsgproject.R;

public class RecipeImgAdapter extends PagerAdapter {

    private int[] images = {R.drawable.testimg,
            R.drawable.testimg1,
            R.drawable.testimg2};
    private LayoutInflater inflater;
    private Context context;

    public RecipeImgAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider_recipeimg, container, false);
        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);

        imageView.setImageResource(images[position]);

        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}
