package com.tangwhdev.lifecyclestudy;

import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;
import androidx.lifecycle.ProcessLifecycleOwner;

public class MyLifeApplication extends Application {
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new MyLifeAppObserver());
    }
}
