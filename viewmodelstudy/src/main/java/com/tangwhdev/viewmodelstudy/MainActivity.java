package com.tangwhdev.viewmodelstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tangwhdev.viewmodelstudy.R;

public class MainActivity extends AppCompatActivity {

    TextView tvNumber;
    Button btnAdd;
    MyViewModel myViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNumber = findViewById(R.id.tvNumber);
        btnAdd = findViewById(R.id.btnAdd);
        myViewModel = new ViewModelProvider(this,
                new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(MyViewModel.class);

        tvNumber.setText(myViewModel.getNumber());
    }

    public void add(View view) {
        tvNumber.setText(myViewModel.add());
    }
}