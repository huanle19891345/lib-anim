package com.pince.anim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pince.anim.AnimatorBuilder.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testAnimatorUtil();
    }


    private fun testAnimatorUtil() {
        AnimatorBuilder.playFloat(tv_1, ANIMATOR_TYPE_TRANSLATION_X, 0f, 800f)
                .with(AnimatorBuilder.ofFloat(tv_2, ANIMATOR_TYPE_TRANSLATION_Y, 0f, 800f).setDuration(10000))
                .withFloat(tv_2, ANIMATOR_TYPE_SCALE_X, 1f, 1.5f, 1f)
                .then(AnimatorBuilder.playFloat(tv_1, ANIMATOR_TYPE_TRANSLATION_X, 800f, 0f)
                        .with(AnimatorBuilder.ofFloat(tv_2, ANIMATOR_TYPE_TRANSLATION_Y, 800f, 0f).setDuration(10000)))
                .thenFloat(tv_1, ANIMATOR_TYPE_TRANSLATION_X, 0f, 800f)
                .then(AnimatorBuilder.ofFloat(tv_2, ANIMATOR_TYPE_TRANSLATION_Y, 0f, 800f))
                .then(AnimatorBuilder.playFloat(tv_1, ANIMATOR_TYPE_TRANSLATION_X, 800f, 0f).setDuration(10000)
                        .with(AnimatorBuilder.ofFloat(tv_2, ANIMATOR_TYPE_TRANSLATION_Y, 800f, 0f).setDuration(10000)))
                .setDuration(5000)
                .start()

    }
}
