package com.pince.anim

import android.annotation.TargetApi
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity: AppCompatActivity(), View.OnFocusChangeListener {
    private lateinit var anim1: AnimatedVectorDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // 加载SVG
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            anim1 = resources.getDrawable(R.drawable.anim1) as AnimatedVectorDrawable
        }

        edit1.setOnFocusChangeListener(this);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onFocusChange(v: View, hasFocus: Boolean) {
        when(v.id) {
            R.id.edit1 -> {
                if (hasFocus) {
                    img1.setImageDrawable(anim1);
                    anim1.start();
                }
            }
        }
    }
}