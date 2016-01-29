package com.test.kxy.mybill.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.test.kxy.mybill.R;
import com.test.kxy.mybill.adapter.ViewPageAdapter;
import java.util.ArrayList;


public class ViewPagerActivity extends Activity implements OnPageChangeListener, View.OnClickListener {

    private ViewPager mViewPager;
    private TextView mTv1,mTv2,mTv3;
    private Button btn_start;
    private  View view1,view2,view3;
    private ArrayList<View> views;
    private ViewPageAdapter vAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.viewpager);
        initViewPage();
        initData();


    }



    private void initTextView() {
        mTv1 = (TextView) findViewById(R.id.tv_point1);
        mTv2 = (TextView) findViewById(R.id.tv_point2);
        mTv3 = (TextView) findViewById(R.id.tv_point3);
    }

    private void initViewPage() {
        views = new ArrayList<View>();
        LayoutInflater mLy = LayoutInflater.from(this);
        view1 = mLy.inflate(R.layout.viewpager1,null);
        view2 = mLy.inflate(R.layout.viewpager2,null);
        view3 = mLy.inflate(R.layout.viewpager3,null);
        views.add(view1);
        views.add(view2);
        views.add(view3);
        mViewPager = (ViewPager) findViewById(R.id.vp_viewpager);
        vAdapter = new ViewPageAdapter(views);
        btn_start = (Button) view3.findViewById(R.id.btn_start);
        btn_start.setOnClickListener(this);
    }

    private void initData() {
        mViewPager.setOnPageChangeListener(this);
        mViewPager.setAdapter(vAdapter);

        initTextView();
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
    switch (position){
        case 0:
            mTv1.setTextColor(Color.WHITE);
            mTv2.setTextColor(Color.BLACK);
            mTv3.setTextColor(Color.BLACK);
            break;
        case 1:
            mTv1.setTextColor(Color.BLACK);
            mTv2.setTextColor(Color.WHITE);
            mTv3.setTextColor(Color.BLACK);
            break;
        case 2:
            mTv1.setTextColor(Color.BLACK);
            mTv2.setTextColor(Color.BLACK);
            mTv3.setTextColor(Color.WHITE);
            break;

    }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start :

                Intent intent = new Intent(ViewPagerActivity.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
