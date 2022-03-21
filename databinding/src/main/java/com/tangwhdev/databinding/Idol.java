package com.tangwhdev.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class Idol  {
    private String userName;
    private  int star;



    public Idol(String name, int star) {
        this.userName = name;
        this.star = star;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
