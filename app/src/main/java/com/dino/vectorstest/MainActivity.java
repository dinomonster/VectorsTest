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
    AppCompatImageView imageView1;
    AppCompatImageView imageView2;
    AppCompatImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1  = (AppCompatImageView)findViewById(R.id.image1);
        imageView2  = (AppCompatImageView)findViewById(R.id.image2);
        imageView3  = (AppCompatImageView)findViewById(R.id.image3);
        animateImage();
    }

    private void animateImage() {
        Drawable animation1 = imageView1.getDrawable();
        if (animation1 instanceof Animatable) {
            ((Animatable) animation1).start();
        }

        Drawable animation2 = imageView2.getDrawable();
        if (animation2 instanceof Animatable) {
            ((Animatable) animation2).start();
        }

        Drawable animation3 = imageView3.getDrawable();
        if (animation3 instanceof Animatable) {
            ((Animatable) animation3).start();
        }
    }
}
