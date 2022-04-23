package com.ps.petappfe;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;

public class DashboardActivity extends AppCompatActivity {
    TextView username;
    ImageButton backB;
    ImageButton logOutB;
    ImageButton profileB;
    ImageButton editProfileB;
    CardView contributeCard;
    CardView learnCard;
    CardView interestsCard;
    CardView helpCard;
    CardView settingsCard;
    CardView practiceCard;

    CardView todoB;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        username = findViewById(R.id.username);


        //bottomNavigationView.setOnNavigationItemSelectedListener(this);
        //bottomNavigationView.setSelectedItemId(R.id.person);
        Intent intent = getIntent();

        if (intent.getExtras() != null) {
            String passedUsername = intent.getStringExtra("data");
            username.setText("Bentornato: " + passedUsername);

        }
        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();
        ThirdFragment thirdFragment = new ThirdFragment();

    }

}