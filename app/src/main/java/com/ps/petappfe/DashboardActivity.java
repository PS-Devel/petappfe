package com.ps.petappfe;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        username = findViewById(R.id.username);

        Intent intent = getIntent();

        if(intent.getExtras() != null){
            String passedUsername = intent.getStringExtra("data");
            username.setText("Bentornato "+passedUsername);
        }
    }
}

