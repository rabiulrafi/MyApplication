package com.example.dell.myapplication;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<LauncherActivity.ListItem>listItems;
    private Context context;

    public MyAdapter(List<LauncherActivity.ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        LauncherActivity.ListItem listItem=listItems.get(position);
    }
    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewHead= (TextView)itemView.findViewById(R.id.textHead);
            textViewDesc= (TextView) itemView.findViewById(R.id.textdesc);
        }
    }


}
