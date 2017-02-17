package com.example.asiantech.demoviewpagervideo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.asiantech.demoviewpagervideo.CurrentFragment;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 16/02/2017.
 */
public class ViewAdapter extends FragmentStatePagerAdapter {
    private int[] mArrays;
    private Context mContext;

    public ViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new CurrentFragment();
    }

    @Override
    public int getCount() {
        return 10;
    }

}
