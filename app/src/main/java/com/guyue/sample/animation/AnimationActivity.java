package com.guyue.sample.animation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.guyue.sample.R;
import com.guyue.sample.animation.AnimationFactory;
import com.guyue.sample.animation.ValueAnimationFactory;

public class AnimationActivity extends AppCompatActivity {

    private static final String TAG = "AnimationActivity";

    private LinearLayout bottomLayout;
    private Button btn_animator;

    private View animator_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        bottomLayout = findViewById(R.id.bottom_layout);
        btn_animator = findViewById(R.id.btn_animator);
        btn_animator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");
                //Translate animation
                startTranslate();
                //valueAnimator
                startValueAnimator();
            }
        });
        initBottomLayout();
    }

    private void startValueAnimator() {
        ValueAnimationFactory.getFloatAnimator().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(@NonNull ValueAnimator animation) {
                Log.d(TAG, "onAnimatio1nUpdate: "+animation.getAnimatedValue());
            }
        });
    }

    private void initBottomLayout() {
        View view = LayoutInflater.from(this).inflate(R.layout.menu_layout, null, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 163);
        bottomLayout.addView(view, 0, layoutParams);


        View view1 = LayoutInflater.from(this).inflate(R.layout.menu_layout, null, false);
        FrameLayout.LayoutParams layoutParams1 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 163);
        bottomLayout.addView(view1, 0, layoutParams1);

        animator_test = LayoutInflater.from(this).inflate(R.layout.menu_layout2, null, false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 163);
        bottomLayout.addView(animator_test, 0, layoutParams2);

    }

    private void startTranslate(){
        AnimationFactory.translateFromBottomShow(animator_test, 300);
    }
}