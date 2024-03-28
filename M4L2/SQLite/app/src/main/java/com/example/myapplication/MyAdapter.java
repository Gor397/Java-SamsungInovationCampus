package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList name, age;


    public MyAdapter(Context context, ArrayList name, ArrayList age) {
        this.context = context;
        this.name = name;
        this.age = age;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.userentry, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.nameId.setText(String.valueOf((name.get(position))));
        holder.ageId.setText(String.valueOf((age.get(position))));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nameId, ageId;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameId = itemView.findViewById(R.id.name);
            ageId = itemView.findViewById(R.id.age);
        }
    }
}