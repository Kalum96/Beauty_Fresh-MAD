package com.example.beauty_fresh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        getSupportActionBar().setTitle("User Profile ");
    }
}
