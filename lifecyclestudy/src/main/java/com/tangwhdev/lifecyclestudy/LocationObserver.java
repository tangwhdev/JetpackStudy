package com.tangwhdev.lifecyclestudy;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.OnLifecycleEvent;
//修改定位的命令：
//adb -s emulator-5554 emu geo fix 121.4961236714487 31.24010934431376

public class LocationObserver implements LifecycleObserver {

    Context context;

    public LocationObserver(Context context) {
        this.context = context;
    }
    LocationManager locationManager;
    MyLocationListener myLocationListener;
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void startLocation() {
        locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        myLocationListener = new MyLocationListener();
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            Log.d("tangwh","没权限");
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 1, myLocationListener);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void stopLocation(){
        Log.d("tangwh","stopLocation");
        locationManager.removeUpdates(myLocationListener);
    }

    static class MyLocationListener implements LocationListener{

        @Override
        public void onLocationChanged(@NonNull Location location) {
            Log.d("tangwh","lat = "+location.getLatitude()+";lon = "+location.getLongitude());
        }
    }
}
