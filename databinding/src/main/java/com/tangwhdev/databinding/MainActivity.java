package com.tangwhdev.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.tangwhdev.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setIdol(new Idol("李连杰",2));

        activityMainBinding.setEventHandler(new EventHandler());
//        activityMainBinding.setNetImageRes("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg5.51tietu.net%2Fpic%2F2019-083107%2Fr4r011raofer4r011raofe.jpg&refer=http%3A%2F%2Fimg5.51tietu.net&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1648733097&t=a2a07b36cd4b80c54187cda1c4b7316c");
        activityMainBinding.setLocalImage(R.drawable.ip);

    }
}