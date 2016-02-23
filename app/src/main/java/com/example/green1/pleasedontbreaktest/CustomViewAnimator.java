package com.example.green1.pleasedontbreaktest;

import android.content.Context;
import android.support.annotation.AnimRes;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ViewAnimator;

/**
 * Created by green1 on 12/4/15.
 */
public class CustomViewAnimator extends ViewAnimator {

    Animation onBackPressedAnimationIn;
    Animation onBackPressedAnimationOut;

    public void setOnBackPressedAnimation(Context context, @AnimRes int resourceID) {
        setOnBackPressedAnimationIn(AnimationUtils.loadAnimation(context, resourceID));
    }
    public void setOnBackPressedAnimationIn(Animation Anime) {
        onBackPressedAnimationIn = Anime;
    }

    /*void showOnlyBackPressed(int childIndex, boolean animate) {
        final int count = getChildCount();
        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
            if (i == childIndex) {
                if (animate && onBackPressedAnimationIn != null) {
                    child.startAnimation(onBackPressedAnimation);
                }
                child.setVisibility(View.VISIBLE);
            } else {
                if (animate && mOutAnimation != null && child.getVisibility() == View.VISIBLE) {
                    child.startAnimation(mOutAnimation);
                } else if (child.getAnimation() == mInAnimation)
                    child.clearAnimation();
                child.setVisibility(View.GONE);
            }
        }
    }*/

    public CustomViewAnimator(Context context) {
        super(context);
    }

    public CustomViewAnimator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
