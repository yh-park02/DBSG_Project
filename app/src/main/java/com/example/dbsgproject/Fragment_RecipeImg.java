package com.example.dbsgproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import me.relex.circleindicator.CircleIndicator;

public class Fragment_RecipeImg extends Fragment {

    ViewPager viewPager;
    private F_RecipImg_ChildFragment1 childFragment1;
    private F_RecipImg_ChildFragment2 childFragment2;
    private F_RecipImg_ChildFragment3 childFragment3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup containar,
                             @Nullable Bundle savedInstanceStanceState){
        View view = inflater.inflate(R.layout.fragment_recipeimg, containar, false);

        childFragment1 = new F_RecipImg_ChildFragment1();
        childFragment2 = new F_RecipImg_ChildFragment2();
        childFragment3 = new F_RecipImg_ChildFragment3();

        viewPager = (ViewPager)view.findViewById(R.id.viewPager);
        viewPager.setAdapter(new PagerAdapter(getChildFragmentManager()));
        viewPager.setCurrentItem(0);

        CircleIndicator indicator = (CircleIndicator)view.findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);

        return view;
    }

    private class PagerAdapter extends FragmentPagerAdapter {
        public PagerAdapter(FragmentManager fm) {
            super(fm);
            getItem(0);
        }

        public Fragment getItem(int position) {
            if (position == 0) {
                return childFragment1;
            } else if (position == 1) {
                return childFragment2;
            } else {
                return childFragment3;
            }
        }

        public int getCount() {
            return 3;
        }
    }

}
