package com.tangwhdev.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tangwhdev.databinding.databinding.ActivityObserverBinding;

public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObserverBinding activityObserverBinding =
                DataBindingUtil.setContentView(this,R.layout.activity_observer);
        NameObserver nameObserver = new NameObserver();
        UserViewModel userViewModel = new UserViewModel();
        activityObserverBinding.setNameVal(nameObserver);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameObserver.setName("newName");
            }
        });
    }


}