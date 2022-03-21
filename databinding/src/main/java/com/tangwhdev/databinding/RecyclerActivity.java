package com.tangwhdev.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.tangwhdev.databinding.databinding.ActivityRecyclerBinding;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        ActivityRecyclerBinding activityRecyclerBinding =  DataBindingUtil.setContentView(this,R.layout.activity_recycler);
        activityRecyclerBinding.recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));

        activityRecyclerBinding.recyclerView.setAdapter(new MyRecyclerAdapter(getList()));
    }

    private ArrayList<Idol> getList() {
        ArrayList<Idol> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Idol idol = new Idol("Jack"+i,i);
            list.add(idol);
        }
        return list;
    }
}