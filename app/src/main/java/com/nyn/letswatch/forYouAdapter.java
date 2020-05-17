package com.nyn.letswatch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class forYouAdapter extends RecyclerView.Adapter<forYouAdapter.forYouViewHolder> {
    ArrayList<RecyclerView> innerRecyclerView = new ArrayList<>();
    Context context;

    public forYouAdapter(ArrayList<RecyclerView> innerRecyclerView, Context context) {
        this.innerRecyclerView = innerRecyclerView;
        this.context = context;
    }

    public forYouAdapter() {
    }

    @NonNull
    @Override
    public forYouViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.outerrv,parent,false);
        return new forYouViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull forYouViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return innerRecyclerView.size();
    }

    public class forYouViewHolder extends  RecyclerView.ViewHolder{
        public forYouViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
