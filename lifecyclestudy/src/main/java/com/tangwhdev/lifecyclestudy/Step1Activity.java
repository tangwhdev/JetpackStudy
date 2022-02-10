package com.tangwhdev.lifecyclestudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Step1Activity extends AppCompatActivity {
    MyChronometer mychronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);
        mychronometer = findViewById(R.id.mychronometer);
        getLifecycle().addObserver(mychronometer);
    }
}