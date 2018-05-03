package com.pince.anim;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

public class AnimFrameUtil {

    public static void startAnimFrame(ImageView imageView, int resId) {
        imageView.setImageResource(resId);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        if (null != animationDrawable && !animationDrawable.isRunning()) {
            animationDrawable.start();
        }
    }


}
