package com.example.asiantech.demoviewpagervideo;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.asiantech.demoviewpagervideo.adapter.ViewAdapter;
import com.example.asiantech.demoviewpagervideo.adapter.ViewPagerAdapter;
import com.example.asiantech.demoviewpagervideo.util.CustomViewPager;
import com.example.asiantech.demoviewpagervideo.views.CirclePageIndicator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCustom = (Button) findViewById(R.id.customPager);
        btnCustom.setOnClickListener(this);
        Button btnView = (Button) findViewById(R.id.viewPager);
        btnView.setOnClickListener(this);
        Button btnCardPager = (Button) findViewById(R.id.btnCardPager);
        btnCardPager.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.customPager:
                initActivity(CustomActivity.class);
                break;
            case R.id.viewPager:
                initActivity(ViewActivity.class);
                break;
            case R.id.btnCardPager:
                initActivity(CardActivity.class);
                break;
        }
    }

    private void initActivity(Class className) {
        Intent intent = new Intent(MainActivity.this, className);
        this.startActivity(intent);
    }

}
