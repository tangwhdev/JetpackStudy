package com.tangwhdev.lifecyclestudy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleService;

import java.security.Provider;

public class LocationService extends LifecycleService {
   LocationObserver locationObserver;
   public LocationService(){
      locationObserver = new LocationObserver(this);
      getLifecycle().addObserver(locationObserver);
   }
}
