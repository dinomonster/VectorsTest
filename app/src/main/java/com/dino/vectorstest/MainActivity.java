package com.dino.vectorstest;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.AppCompatImageView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AppCompatImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView  = (AppCompatImageView)findViewById(R.id.aaaa);
        animateImage();
    }

    // 只支持5.0以上.
    private void animateImage() {
        Drawable animation = imageView.getDrawable();
        if (animation instanceof Animatable) {
            ((Animatable) animation).start();
        }
    }
}
