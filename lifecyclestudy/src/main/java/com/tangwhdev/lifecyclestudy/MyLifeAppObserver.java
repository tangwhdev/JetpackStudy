package com.tangwhdev.lifecyclestudy;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;

public class MyLifeAppObserver implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
        Log.d("tangwhdev","onCreate");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(){
        Log.d("tangwhdev","onStart");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(){
        Log.d("tangwhdev","onResume");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(){
        Log.d("tangwhdev","onPause");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Log.d("tangwhdev","onStop");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(){
        Log.d("tangwhdev","onDestroy");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onAny(){
        Log.d("tangwhdev","onAny");
    }
}
