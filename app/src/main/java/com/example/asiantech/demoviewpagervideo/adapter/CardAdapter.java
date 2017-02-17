package com.example.asiantech.demoviewpagervideo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.CardView;
import android.view.ViewGroup;

import com.example.asiantech.demoviewpagervideo.CardFragment;
import com.example.asiantech.demoviewpagervideo.R;
import com.example.asiantech.demoviewpagervideo.views.CardPageIndicator;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 16/02/2017.
 */
public class CardAdapter extends FragmentStatePagerAdapter implements CardPageIndicator {
    private List<CardFragment> mListFragment = new ArrayList<>();
    private float mBaseElevation;
    public CardAdapter(FragmentManager fm, float baseElevation) {
        super(fm);
        mListFragment = new ArrayList<>();
        mBaseElevation = baseElevation;
        for (int i = 0; i < 5; i++) {
            addCardFragment(new CardFragment());
        }
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Object fragment = super.instantiateItem(container, position);
        mListFragment.set(position, (CardFragment) fragment);
        return fragment;
    }

    @Override
    public Fragment getItem(int position) {
        return mListFragment.get(position);
    }

    @Override
    public float getBaseElevation() {
        return mBaseElevation;
    }

    @Override
    public CardView getCardViewAt(int position) {
        return mListFragment.get(position).getCardView();
    }

    @Override
    public int getCount() {
        return mListFragment.size();
    }

    public void addCardFragment(CardFragment fragment) {
        mListFragment.add(fragment);
    }
}
