package com.example.asiantech.demoviewpagervideo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 16/02/2017.
 */
public class CurrentFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_view, container, false);
        return view;
    }
}
