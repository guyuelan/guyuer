package com.guyue.sample.viewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TestViewProperyView extends View {

    private static final String TAG = "TestViewProperyView";
    public TestViewProperyView(Context context) {
        super(context);
    }

    public TestViewProperyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TestViewProperyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TestViewProperyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "onAttac1hedToWindow: "+1);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "onDetachedF1romWindow: "+1);
    }

    @Override
    protected void onVisibilityChanged(@NonNull View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        Log.d(TAG, "onVisibilit1yChanged: "+1);
    }
}
