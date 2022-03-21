package com.tangwhdev.databinding;

import android.util.Log;
import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

public class UserViewModel{
    ObservableField<Idol> idolObservableField;
    Idol idol;

    public ObservableField<Idol> getIdolObservableField() {
        return idolObservableField;
    }

    public UserViewModel() {
        idolObservableField = new ObservableField<>();
        idol = new Idol("jack",9);
        idolObservableField.set(idol);
//        setNewName("Jacknew");
//        idolObservableField.set(idol);
    }

    public void setNewName(String userName){

        idolObservableField.get().setUserName(userName);

        Log.d("tangwh",getNewName()+";idol.name = "+idol.getUserName());
    }


    public ObservableField<String> getNewName(){
       return new ObservableField<>(idolObservableField.get().getUserName());

    }

}
