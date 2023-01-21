package com.example.gt_3m_4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gt_3m_4.databinding.ItemContinentBinding;

public class ContinentViewHolder extends RecyclerView.ViewHolder {

    private ItemContinentBinding binding;

    public ContinentViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bind(Continent continent){







        binding.tvContinent.setText(continent.getName());
    }
}
