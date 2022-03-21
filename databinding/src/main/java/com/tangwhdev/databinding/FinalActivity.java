package com.tangwhdev.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.tangwhdev.databinding.databinding.ActivityFinalBinding;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFinalBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_final);
        ScoreViewModel scoreViewModel = new ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication())).get(ScoreViewModel.class);
        binding.setViewModel(scoreViewModel);
        binding.setLifecycleOwner(this);
    }
}