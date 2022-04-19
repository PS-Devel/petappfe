package com.ps.petappfe;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class IntroActivity extends AppCompatActivity {

    ImageView ivTop, ivHeart, ivBeat, ivBottom;
    TextView textView;
    CharSequence charSequence;
    int index;
    long delay = 200;
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);



        // FULL SCREEN
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                , WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // INIT  TOP ANIMATION
        Animation animation1 = AnimationUtils.loadAnimation(this,
                R.anim.top_animation);
        // INIT OBJ ANIMATOR
        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(
                ivHeart,
                PropertyValuesHolder.ofFloat("scaleX", 1.2f),
                PropertyValuesHolder.ofFloat("scaleY", 1.2f)
        );


        objectAnimator.setDuration(100);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        objectAnimator.start();

        Glide.with(this).load("https://cdn.dribbble.com/users/678744/screenshots/4354819/dogleapdribbble.gif")
                //  Glide.with(this).load("https://i.pinimg.com/originals/19/58/38/19583866f2c33d855fd2be99b47cddfe.gif")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(ivBeat);

        Animation animation2 = AnimationUtils.loadAnimation(this,
                R.anim.bottom_animation);

        new Handler().postDelayed(new Runnable() {
            // when runnable is run
            @Override
            public void run() {
                startActivity((new Intent(IntroActivity.this
                        , MainActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)));
                finish();
            }
        }, 2000);
    }


    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            textView.setText(charSequence.subSequence(0, index++));

            if (index <= charSequence.length()) {

                handler.postDelayed(runnable, delay);

            }
        }

    };

    public void animatText(CharSequence cs) {

        charSequence = cs;

        index = 0;
        textView.setText("");
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, delay);


    }
}