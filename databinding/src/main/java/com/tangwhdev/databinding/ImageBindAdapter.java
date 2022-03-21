package com.tangwhdev.databinding;

import android.text.TextUtils;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

public class ImageBindAdapter {

    @BindingAdapter("netImage")
    public static void setImageRes(ImageView view,String url){
        Picasso.with(view.getContext()).load(url).into(view);
    }

    @BindingAdapter("localImage")
    public static void setLocalImageRes(ImageView view,int res){
        view.setImageResource(res);
    }

    @BindingAdapter(value = {"netImage","localImage"} ,requireAll = false)
    public static void setImageRes(ImageView view,String url,int res){
        if(TextUtils.isEmpty(url)){
            view.setImageResource(res);
        }else{
            Picasso.with(view.getContext()).load(url).into(view);
        }

    }
}
