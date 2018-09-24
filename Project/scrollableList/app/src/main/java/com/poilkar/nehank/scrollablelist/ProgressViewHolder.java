package com.poilkar.nehank.scrollablelist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
public class ProgressViewHolder extends RecyclerView.ViewHolder{
    public ProgressBar progressBar;
    public ProgressViewHolder(View itemView) {
        super(itemView);
        progressBar = (ProgressBar)itemView.findViewById(R.id.progressBar);
    }
}