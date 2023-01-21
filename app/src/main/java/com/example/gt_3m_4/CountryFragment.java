package com.example.gt_3m_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gt_3m_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private CountryAdapter adapter;
    private ArrayList<Country> countries;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new CountryAdapter(countries);
        binding.rcCountry.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(view.getContext(), 2);
        binding.rcCountry.setLayoutManager(mLayoutManager);
    }

    private void loadData() {
        countries = (ArrayList<Country>) getArguments().getSerializable("CONTINENT");
    }
}