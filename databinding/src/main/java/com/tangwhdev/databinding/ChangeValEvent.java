package com.tangwhdev.databinding;

import android.view.View;

public class ChangeValEvent {
    NameObserver nameObserver;

    public ChangeValEvent(NameObserver nameObserver) {
        this.nameObserver = nameObserver;
    }

    public void change(View view){
        nameObserver.setName("这是已经改变了的值");
    }
}
