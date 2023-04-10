package com.guyue.sample.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public class AnimationFactory {

    public static Animation translateFromBottomShow(View view, int duration) {
        final TranslateAnimation animation = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_SELF, 0, TranslateAnimation.RELATIVE_TO_SELF, 0,
                TranslateAnimation.RELATIVE_TO_SELF, 1, TranslateAnimation.RELATIVE_TO_SELF, 0);
        animation.setDuration(duration);
        animation.setAnimationListener(new AnimationListener());
        view.setVisibility(View.VISIBLE);
        view.startAnimation(animation);
        return animation;
    }

    public static Animation translateFromBottomDismiss(View view, int duration) {
        final TranslateAnimation animation = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_SELF, 0, TranslateAnimation.RELATIVE_TO_SELF, 0,
                TranslateAnimation.RELATIVE_TO_SELF, 0, TranslateAnimation.RELATIVE_TO_SELF, 1);
        animation.setDuration(duration);
        animation.setAnimationListener(new AnimationListener());
        view.setVisibility(View.VISIBLE);
        view.startAnimation(animation);
        return animation;
    }

    public static Animation translateFromRightShow(View view, int duration) {
        final TranslateAnimation animation = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_SELF, 1, TranslateAnimation.RELATIVE_TO_SELF, 0,
                TranslateAnimation.RELATIVE_TO_SELF, 0, TranslateAnimation.RELATIVE_TO_SELF, 0);
        animation.setDuration(duration);
        animation.setAnimationListener(new AnimationListener());
        view.setVisibility(View.VISIBLE);
        view.startAnimation(animation);
        return animation;
    }


}
