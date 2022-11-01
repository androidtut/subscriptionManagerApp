package com.example.subscriptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView nextbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextbtn = findViewById(R.id.nextbtn);

        nextbtn.setOnClickListener(v->{
            startActivity(new Intent(this,DashboardActivity.class));
        });

    }
}