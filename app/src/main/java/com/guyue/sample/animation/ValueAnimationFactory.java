package com.guyue.sample.animation;

import android.animation.ValueAnimator;

import androidx.annotation.NonNull;

public class ValueAnimationFactory {

   public static ValueAnimator  getFloatAnimator(){
      ValueAnimator animator = ValueAnimator.ofFloat(0, 1);
      animator.setDuration(300);
      animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
         @Override
         public void onAnimationUpdate(@NonNull ValueAnimator animation) {

         }
      });
      animator.start();
      return animator;
   }
}
