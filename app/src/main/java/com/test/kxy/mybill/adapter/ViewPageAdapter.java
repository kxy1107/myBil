package com.test.kxy.mybill.adapter;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by zzx on 2016/1/29.
 */
public class ViewPageAdapter extends PagerAdapter {
    private ArrayList<View> views;
    public  ViewPageAdapter(ArrayList<View> views){
    this.views = views;
    }

    @Override
    public Object instantiateItem(View container, int position) {
        ((ViewPager)container).addView(views.get(position), 0);
        return views.get(position);
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager)container).removeView(views.get(position));
    }

    @Override
    public int getCount() {
        if(views != null) {
        return views.size();
        }

        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }
}
