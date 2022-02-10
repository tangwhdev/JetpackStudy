package com.tangwhdev.lifecyclestudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer;
    private long elapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.timeCount);

    }

    @Override
    protected void onResume() {
        super.onResume();
        chronometer.setBase(SystemClock.elapsedRealtime()-elapsedTime);
        chronometer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        elapsedTime = SystemClock.elapsedRealtime()-chronometer.getBase();
        chronometer.stop();

    }
}