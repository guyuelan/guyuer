package com.guyue.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class AnimationActivity extends AppCompatActivity {

    private LinearLayout bottomLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        bottomLayout = findViewById(R.id.bottom_layout);
        initBottomLayout();
    }

    private void initBottomLayout() {
        View view = LayoutInflater.from(this).inflate(R.layout.menu_layout, null, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 163);
        bottomLayout.addView(view, 0, layoutParams);


        View view1 = LayoutInflater.from(this).inflate(R.layout.menu_layout, null, false);
        FrameLayout.LayoutParams layoutParams1 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 163);
        bottomLayout.addView(view1, 0, layoutParams1);
    }
}