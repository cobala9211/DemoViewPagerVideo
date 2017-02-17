package com.example.asiantech.demoviewpagervideo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.asiantech.demoviewpagervideo.adapter.ViewPagerAdapter;
import com.example.asiantech.demoviewpagervideo.util.CustomViewPager;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 16/02/2017.
 */
public class CustomActivity extends AppCompatActivity {
    private CustomViewPager mViewPager;
    private ViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        mViewPager = (CustomViewPager) findViewById(R.id.viewPager1);
        mAdapter = new ViewPagerAdapter(this, 10);
        mViewPager.setAdapter(mAdapter);
        mViewPager.enableCenterLockOfChilds();
        mViewPager.setCurrentItemInCenter(3);
        mViewPager.setmMatchChildHeightToViewPager(true);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setPageMargin(20);
    }
}
