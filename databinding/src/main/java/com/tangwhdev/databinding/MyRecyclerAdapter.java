package com.tangwhdev.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.tangwhdev.databinding.databinding.ItemRecyclerLayoutBinding;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {

    ArrayList<Idol> list;

    public MyRecyclerAdapter(ArrayList<Idol> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecyclerLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_recycler_layout,parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerAdapter.MyViewHolder holder, int position) {
            holder.binding.setIdol(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ItemRecyclerLayoutBinding binding;
        public MyViewHolder(@NonNull ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = (ItemRecyclerLayoutBinding) binding;
        }

        public ItemRecyclerLayoutBinding getBinding() {
            return binding;
        }
    }
}
