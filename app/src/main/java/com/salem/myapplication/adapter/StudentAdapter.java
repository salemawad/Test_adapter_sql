package com.salem.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.salem.myapplication.R;
import com.salem.myapplication.model.Student;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.myViewHolder> {

    ArrayList<Student> data;

    Context context ;
    public StudentAdapter (ArrayList<Student> data){
        this.data =data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.student_iteem ,null ,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.tvName.setText(data.get(position).getName());
        Glide.with(context).load(data.get(position).getImage()).into(holder.ivImage);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView ivImage;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImage = itemView.findViewById(R.id.ivImage);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
