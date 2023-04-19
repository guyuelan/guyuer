package com.guyue.sample.viewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.guyue.sample.R;

public class ViewProperyActivity extends AppCompatActivity {

    private LinearLayout bottomLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_propery);
        bottomLayout = findViewById(R.id.bottom_layout_1);
        initBottomLayout();
    }

    private void initBottomLayout() {
        TestViewProperyView testViewProperyView = new TestViewProperyView(this);
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        testViewProperyView.setLayoutParams(lp);
        bottomLayout.addView(testViewProperyView);
    }
}