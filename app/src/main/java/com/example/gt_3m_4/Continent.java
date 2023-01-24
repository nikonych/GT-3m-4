package com.example.gt_3m_4;

import java.io.Serializable;
import java.util.ArrayList;

public class Continent implements Serializable {
    String name;

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
