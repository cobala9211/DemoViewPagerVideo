package com.example.asiantech.demoviewpagervideo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.asiantech.demoviewpagervideo.adapter.ViewAdapter;
import com.example.asiantech.demoviewpagervideo.views.CircleIndicatorView;
import com.example.asiantech.demoviewpagervideo.views.CirclePageIndicator;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 16/02/2017.
 */
public class ViewActivity extends AppCompatActivity implements View.OnClickListener {

    private CircleIndicatorView mCirclePageIndicator;
    private ViewAdapter mAdapter;
    private ViewPager mViewPager;
    private TextView mTvNext;
    private TextView mTvPre;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        mTvNext = (TextView) findViewById(R.id.tvNextPager);
        mTvNext.setOnClickListener(this);
        mTvPre = (TextView) findViewById(R.id.tvPrePager);
        mTvPre.setOnClickListener(this);
        mCirclePageIndicator = (CircleIndicatorView) findViewById(R.id.circleViewPager);
        mViewPager = (ViewPager) findViewById(R.id.viewPager1);
        mAdapter = new ViewAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mCirclePageIndicator.setViewPager(mViewPager);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvPrePager:
                int countPre = getCurrent() - 1;
                if (countPre >= 0) {
                    mViewPager.setCurrentItem(countPre, true);
                }
                break;
            case R.id.tvNextPager:
                int countNext = getCurrent() + 1;
                if (countNext < mAdapter.getCount()) {
                    mViewPager.setCurrentItem(countNext, true);
                }
                break;
            default:
                break;
        }
    }

    private int getCurrent() {
        return mViewPager.getCurrentItem();
    }
}
