package com.ps.petappfe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {


    private  int SPLASH_DELAY = 3000;
    private ImageView imageView;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setBackgroundDrawable(null);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                , WindowManager.LayoutParams.FLAG_FULLSCREEN);

        initializeView();
        animateLogo();
        goToMainActivity();

    }

    private void initializeView() {

        imageView = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);


        imageView4 = findViewById(R.id.imageView4);

        imageView6 = findViewById(R.id.imageView6);





    }

    private void animateLogo() {

        Animation fadingAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadingAnimation.setDuration(SPLASH_DELAY);
        imageView.startAnimation(fadingAnimation);

        imageView3.startAnimation(fadingAnimation);
        imageView4.startAnimation(fadingAnimation);
        imageView6.startAnimation(fadingAnimation);




    }

    private void goToMainActivity() {
        new Handler().postDelayed(() -> {

            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            finish();
        }, SPLASH_DELAY);
    }

}
