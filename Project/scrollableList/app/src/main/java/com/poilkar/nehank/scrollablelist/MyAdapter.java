package com.poilkar.nehank.scrollablelist;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Hit> moviesList;
    private OnItemClickListener mlistener;
    private OnLoadMoreListener onLoadMoreListener;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            genre = (TextView) view.findViewById(R.id.textViewLargeText);
            title = (TextView) view.findViewById(R.id.textViewSmallText);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mlistener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mlistener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        public void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mlistener = listener;
    }


    public MyAdapter(List<Hit> moviesList,Context context) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_itemss, parent, false);
        final MyAdapter.MyViewHolder mViewHolder = new MyAdapter.MyViewHolder(itemView);


        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Hit movie = moviesList.get(position);

//        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getSource().getDate());
//        holder.year.setText(movie.getYear());
        holder.title.setText(movie.getSource().getCaseNo());
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlistener.onItemClick(position);

            }
        });


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public void setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.onLoadMoreListener = onLoadMoreListener;
    }

    public interface OnLoadMoreListener {
        void onLoadMore();
    }
}