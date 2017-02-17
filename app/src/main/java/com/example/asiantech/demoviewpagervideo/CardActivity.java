package com.example.asiantech.demoviewpagervideo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.asiantech.demoviewpagervideo.adapter.CardAdapter;
import com.example.asiantech.demoviewpagervideo.util.ShadowTransformer;
import com.example.asiantech.demoviewpagervideo.views.CirclePageIndicator;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 16/02/2017.
 */
public class CardActivity extends AppCompatActivity implements View.OnClickListener {

    private CardAdapter mAdapter;
    private ViewPager mViewPager;
    private ShadowTransformer mShadowTransformer;
    private CirclePageIndicator mPageIndicator;
    private TextView mTvPre;
    private TextView mTvNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mTvNext = (TextView) findViewById(R.id.tvNextPager);
        mTvNext.setOnClickListener(this);
        mTvPre = (TextView) findViewById(R.id.tvPrePager);
        mTvPre.setOnClickListener(this);
        mPageIndicator = (CirclePageIndicator) findViewById(R.id.circleViewPager);
        mAdapter = new CardAdapter(getSupportFragmentManager(),
                dpToPixels(2, this));
        mShadowTransformer = new ShadowTransformer(mViewPager, mAdapter);
        mViewPager.setAdapter(mAdapter);
        mViewPager.setPageTransformer(true, mShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);
        mPageIndicator.setViewPager(mViewPager);
    }

    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }

    private int getItem() {
        return mViewPager.getCurrentItem();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvPrePager:
                int countPre = getItem() - 1;
                if (countPre >= 0) {
                    mViewPager.setCurrentItem(countPre, true);
                }
                break;
            case R.id.tvNextPager:
                int countNext = getItem() + 1;
                if (countNext < mAdapter.getCount()) {
                    mViewPager.setCurrentItem(countNext, true);
                }
                break;
            default:
                break;
        }
    }
}
