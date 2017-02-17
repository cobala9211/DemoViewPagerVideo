package com.example.asiantech.demoviewpagervideo.views;

import android.support.v4.view.ViewPager;

/**
 * Copyright © 2016 AsianTech inc.
 * Created by HuongNV on 26/05/2016.
 */
public interface PageIndicator extends ViewPager.OnPageChangeListener {
    /**
     * Bind the indicator to a ViewPager.
     *
     * @param view is parent view
     */
    void setViewPager(ViewPager view);

    /**
     * Bind the indicator to a ViewPager.
     *
     * @param view            is parent view
     * @param initialPosition is parent position
     */
    void setViewPager(ViewPager view, int initialPosition);

    /**
     * <p>Set the current page of both the ViewPager and indicator.</p>
     * <p/>
     * <p>This <strong>must</strong> be used if you need to set the page before
     * the views are drawn on screen (e.g., default start page).</p>
     *
     * @param item initialPosition
     */
    void setCurrentItem(int item);

    /**
     * Set a page change listener which will receive forwarded events.
     *
     * @param listener is listener
     */
    void setOnPageChangeListener(ViewPager.OnPageChangeListener listener);

    /**
     * Notify the indicator that the fragment list has changed.
     */
    void notifyDataSetChanged();
}
