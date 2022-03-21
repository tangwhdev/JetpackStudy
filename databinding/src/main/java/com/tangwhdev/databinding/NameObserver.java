package com.tangwhdev.databinding;

import android.util.Log;
import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

public class NameObserver extends BaseObservable {
    String name;

    public void setName(String name) {
        if(name!=null&& !name.equals(this.name)){
            this.name = name;
            Log.d("tangwhDev",name);
            notifyPropertyChanged(BR.name);
        }
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void change(View view){
        setName("这是已经改变了的值");
    }
}
