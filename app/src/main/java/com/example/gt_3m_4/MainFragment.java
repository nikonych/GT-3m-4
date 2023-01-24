package com.example.gt_3m_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gt_3m_4.databinding.FragmentMainBinding;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MainFragment extends Fragment implements OnItemClick {

    private FragmentMainBinding binding;
    private ArrayList<Continent> continents;
    private ContinentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continents, this);
        binding.rcContinents.setAdapter(adapter);


    }

    void loadData(){
        ArrayList<Country> countries = new ArrayList<>();


        continents = new ArrayList<>();
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Africa"));
        continents.add(new Continent("Europe"));
        continents.add(new Continent("North America"));
        continents.add(new Continent("Australia"));
        continents.add(new Continent("South America"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("CONTINENT", position);

        Fragment fragment = new CountryFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack(null).commit();

    }
}