package com.ps.petappfe.Util;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.ps.petappfe.DetailsActivity;
import com.ps.petappfe.Model.Petsitter;
import com.ps.petappfe.R;

import java.util.List;


public class PetsitterAdapter extends RecyclerView.Adapter<PetsitterAdapter.PetsitterViewHolder> {

    Context context;
    List<Petsitter> petsitterList;



    public PetsitterAdapter(Context context, List<Petsitter> petsitterList) {
        this.context = context;
        this.petsitterList = petsitterList;
    }

    @NonNull
    @Override
    public PetsitterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.ps_row_item, parent, false);
        return new PetsitterViewHolder(view);
    }

    @Override
    public void onBindViewHolder( PetsitterViewHolder holder, int position) {

       holder.image.setImageResource(petsitterList.get(position).getImageUrl());
        holder.name.setText(petsitterList.get(position).getName());
        holder.price.setText(petsitterList.get(position).getPrice());
        holder.rating.setText(petsitterList.get(position).getRating());
        holder.name.setText(petsitterList.get(position).getPet());        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsActivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return petsitterList.size();
    }


    public static final class PetsitterViewHolder extends RecyclerView.ViewHolder{


        ImageView image;
        TextView price, name, rating, imageT;

        public PetsitterViewHolder(@NonNull View itemView ) {
            super(itemView);
            image = itemView.findViewById(R.id.image);

            name = itemView.findViewById(R.id.imageT);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);



        }
    }

}
