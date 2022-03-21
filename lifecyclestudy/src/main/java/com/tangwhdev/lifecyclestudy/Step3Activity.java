package com.tangwhdev.lifecyclestudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Step3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);
    }

    public void startLocation(View view) {
        Intent intent = new Intent(this,LocationService.class);
        startService(intent);
    }

    public void stopLocation(View view) {
        Intent intent = new Intent(this,LocationService.class);
        stopService(intent);
    }


}