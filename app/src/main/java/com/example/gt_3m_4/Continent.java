package com.example.gt_3m_4;

import java.io.Serializable;
import java.util.ArrayList;

public class Continent implements Serializable {
    String name;
    ArrayList<Country> countries;

    public Continent(String name, ArrayList<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }
}
