package com.guyue.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guyue.sample.animation.AnimationActivity;
import com.guyue.sample.viewtest.ViewProperyActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnAnimation;
    private Button mBtnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnAnimation = findViewById(R.id.btn_animitor);
        mBtnAnimation.setOnClickListener(this);
        mBtnView = findViewById(R.id.btn_view_propery);
        mBtnView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mBtnAnimation) {
            startActivity(new Intent(this, AnimationActivity.class));
        } else if (v == mBtnView) {
            startActivity(new Intent(this, ViewProperyActivity.class));
        }

    }
}