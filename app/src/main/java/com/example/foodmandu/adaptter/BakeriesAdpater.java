package com.example.foodmandu.adaptter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodmandu.R;
import com.example.foodmandu.model.Bakeries;
import com.example.foodmandu.model.Categories;


import java.util.List;

public class BakeriesAdpater extends RecyclerView.Adapter<BakeriesAdpater.BakeriesHolder> {
    Context context;
    List<Bakeries> bakeriesList;

    public BakeriesAdpater(Context context, List<Bakeries> bakeriesList) {
        this.context = context;
        this.bakeriesList = bakeriesList;
    }

    @NonNull
    @Override
    public BakeriesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.categories,parent,false);
        return new BakeriesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BakeriesHolder holder, int position) {

         }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BakeriesHolder extends RecyclerView.ViewHolder{
        ImageView imageBakeries;
       public BakeriesHolder(@NonNull View itemView) {
           super(itemView);

           imageBakeries = itemView.findViewById(R.id.imageBakeries);


       }
   }
}
