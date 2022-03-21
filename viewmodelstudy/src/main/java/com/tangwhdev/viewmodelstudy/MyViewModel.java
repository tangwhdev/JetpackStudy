package com.tangwhdev.viewmodelstudy;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    int number = 0;
    public String add(){
        number++;
        return number+"";
    }

    public String getNumber() {
        return number+"";
    }
}
