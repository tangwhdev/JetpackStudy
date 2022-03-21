package com.tangwhdev.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class EventHandler {
    Context context;

    public EventHandler() {

    }

    public void onCLick(View view){
        Toast.makeText(view.getContext(), "喜欢了+1",Toast.LENGTH_LONG).show();
    }
}
