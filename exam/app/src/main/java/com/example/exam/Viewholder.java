package com.example.exam;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Viewholder extends RecyclerView.ViewHolder {

    final TextView tvId, tvName;

    public Viewholder(@NonNull View itemView) {

        super(itemView);
        tvId = itemView.findViewById(R.id.textView3);
        tvName = itemView.findViewById(R.id.textView4);
    }
}
