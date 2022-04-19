package com.ps.petappfe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


;
import com.google.android.material.textfield.TextInputEditText;
import com.ps.petappfe.Util.ApiClient;
import com.ps.petappfe.Util.LoginRequest;
import com.ps.petappfe.Util.LoginResponse;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextInputEditText username, password;
    Button btnLogin;
Animation topAnim, bottomAnim;

ImageView image;
TextView logo;
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        setContentView(R.layout.activity_login);
        //textView = findViewById(R.id.text_view);
        // FULL SCREEN
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                , WindowManager.LayoutParams.FLAG_FULLSCREEN);


        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);



        image=  (ImageView) findViewById(R.id.logo);
        logo=  (TextView) findViewById(R.id.textView);




        username = findViewById(R.id.edUsername);
        password = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Username e password obbligatori!", Toast.LENGTH_LONG).show();
                } else {
                    login();
                }

            }
        });
    }

    public void login() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username.getText().toString());
        loginRequest.setPassword(password.getText().toString());

        Call<LoginResponse> loginResponseCall = ApiClient.getUserService().userLogin(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Accesso completato!", Toast.LENGTH_LONG).show();
                    LoginResponse loginResponse = response.body();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            startActivity(new Intent(MainActivity.this, DashboardActivity.class).putExtra("data", loginResponse.getUsername()));
                        }
                    }, 700);

                } else {
                    Toast.makeText(MainActivity.this, "Accesso non riuscito!", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Throwable " + t.getLocalizedMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }

 */

    }

