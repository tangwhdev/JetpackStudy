package com.tangwhdev.room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RepAdapter extends RecyclerView.Adapter<RepAdapter.RepViewHolder> {

    List<Student> list;

    public RepAdapter(List<Student> list) {
        this.list = list;
    }

    public void setList(List<Student> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RepViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RepViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rep,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RepViewHolder holder, int position) {
        Student student = list.get(position);
        holder.tvId.setText(String.valueOf(student.id));

        holder.tvAge.setText(String.valueOf(student.age));
        holder.tvName.setText(student.name);
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    static class RepViewHolder extends RecyclerView.ViewHolder{

        TextView tvId;
        TextView tvAge;
        TextView tvName;
        public RepViewHolder(@NonNull View itemView) {
            super(itemView);
             tvId = itemView.findViewById(R.id.tvId);
             tvAge = itemView.findViewById(R.id.tvAge);
             tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
