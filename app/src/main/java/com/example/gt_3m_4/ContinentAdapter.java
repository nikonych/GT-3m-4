package com.example.gt_3m_4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gt_3m_4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {


    private ArrayList<Continent> continents;

    private OnItemClick onItemClick;

    public ContinentAdapter(ArrayList<Continent> continents, OnItemClick onItemClick) {
        this.continents = continents;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continents.get(position));

        holder.itemView.setOnClickListener(view -> {
            onItemClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }
}
