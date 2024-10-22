package com.example.myrecyclervew;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyVewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView nameView, emailView;
    public MyVewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imagevew);
        nameView=itemView.findViewById(R.id.name);
        emailView=itemView.findViewById(R.id.email);
    }
}
