package com.example.asiantech.demoviewpagervideo.adapter;

import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asiantech.demoviewpagervideo.R;

import java.util.Random;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 16/02/2017.
 */
public class ViewPagerAdapter extends CustomAdapter {
    private Activity mActivity;
    private int mPageCount;
    private int mPosition;
    private int[] mArrays = {R.mipmap.bg1, R.mipmap.bg2,
            R.mipmap.bg3, R.mipmap.bg1, R.mipmap.bg2,
            R.mipmap.bg3, R.mipmap.bg1, R.mipmap.bg2,
            R.mipmap.bg3, R.mipmap.bg1};

    public ViewPagerAdapter(Activity activity, int pageCount) {
        mActivity = activity;
        mPageCount = pageCount;
    }

    @Override
    public int getCount() {
        return mPageCount;
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return (view == (View) obj);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        ViewGroup viewGroup = (ViewGroup) mActivity.getLayoutInflater().inflate(
                R.layout.item_view, null);
        mPosition = position;
        viewGroup.setBackgroundColor(randomColor());
        ImageView imgBackground = (ImageView) viewGroup.findViewById(R.id.imgBackground);
        imgBackground.setImageResource(mArrays[position]);
        TextView button = (TextView) viewGroup.findViewById(R.id.tvTitle);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "Hey, Its clicked!!! at page " + (position + 1), Toast.LENGTH_LONG).show();
            }
        });
        container.addView(viewGroup);

        return viewGroup;
    }

    Random rnd = new Random();

    private int randomColor() {
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        //must be overridden else throws exception as not overridden.
        Log.d("Tag", collection.getChildCount() + "");
        collection.removeView((View) view);
    }

    @Override
    public float getPageWidth(int position) {
        return 0.7f;
    }

    public int getCurrentPosition() {
        return mPosition;
    }
}
