package com.coderobust.android.recyclerviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ToysRecyclerViewAdapter extends RecyclerView.Adapter<ToysRecyclerViewAdapter.ToysViewHolder> {

    ArrayList<Toy> toysList;
    Context context;

    public ToysRecyclerViewAdapter( Context context, ArrayList<Toy> toysList) {
        this.toysList = toysList;
        this.context = context;
    }

    @NonNull
    @Override
    public ToysRecyclerViewAdapter.ToysViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_toy,viewGroup,false);
        return new ToysViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToysRecyclerViewAdapter.ToysViewHolder holder, final int i) {
        final Toy toy=toysList.get(i);

        holder.toyName.setText(toy.getName());
        holder.toyPrice.setText(String.valueOf(toy.getPrice()));
        holder.toyImage.setImageResource(toy.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You clicked on item "+i+", "+toy.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return toysList.size();
    }

    public class ToysViewHolder extends RecyclerView.ViewHolder {
        TextView toyName;
        TextView toyPrice;
        ImageView toyImage;
        public ToysViewHolder(@NonNull View itemView) {
            super(itemView);

            toyImage=itemView.findViewById(R.id.item_toy_image);
            toyName=itemView.findViewById(R.id.item_toy_name);
            toyPrice=itemView.findViewById(R.id.item_toy_price);
        }
    }
}
