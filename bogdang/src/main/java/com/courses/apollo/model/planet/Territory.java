package com.courses.apollo.model.planet;

/**
 * Created by Богдан on 21.03.2017.
 */
public abstract class Territory {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
