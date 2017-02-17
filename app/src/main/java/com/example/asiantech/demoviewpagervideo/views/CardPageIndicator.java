package com.example.asiantech.demoviewpagervideo.views;

import android.support.v7.widget.CardView;
/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 16/02/2017.
 */
public interface CardPageIndicator {
    int MAX_ELEVATION_FACTOR = 8;
    float getBaseElevation();
    CardView getCardViewAt(int position);

    int getCount();
}
