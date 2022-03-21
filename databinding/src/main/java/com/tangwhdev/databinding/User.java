package com.tangwhdev.databinding;

import androidx.databinding.ObservableField;

public class User {
    private ObservableField<String> userName;
    private  int star;

    public User(ObservableField<String> userName, int star) {
        this.userName = userName;
        this.star = star;
    }

    public ObservableField<String> getUserName() {
        return userName;
    }

    public void setUserName(ObservableField<String> userName) {
        this.userName = userName;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
