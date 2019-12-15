package com.example.exam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adpater extends RecyclerView.Adapter<Viewholder> {

    private LayoutInflater inflater;

    Adpater(Context context) {this.inflater=LayoutInflater.from(context);}

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    View view  = inflater.inflate(R.layout.viewholder,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        Info info = Details.getInstance().information.get(position);
        holder.tvId.setText(String.valueOf(info.name));
        holder.tvName.setText(String.valueOf(info.passwords));

    }

    @Override
    public int getItemCount() {

        return Details.getInstance().information.size();
    }
}
