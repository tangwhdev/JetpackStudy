package com.tangwhdev.viewmodelstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class LiveDataActivity extends AppCompatActivity {

    TextView tvNumber;
    Button btnAdd;


    MutableLiveData<Integer> time = new MutableLiveData<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
        tvNumber = findViewById(R.id.tvNumber);
        btnAdd = findViewById(R.id.btnAdd);
        time.setValue(1);
       time.observe(this, new Observer<Integer>() {
           @Override
           public void onChanged(Integer integer) {
               tvNumber.setText(integer+"");
           }
       });

    }

    public void add(View view) {

        new Timer().schedule(new TimerTask(){

            @Override
            public void run() {
                int newTime = time.getValue()+1;
                time.postValue(newTime);
                Log.d("tangwhDev","newTIme = "+newTime);
            }
        },1000,1000);
    }
}