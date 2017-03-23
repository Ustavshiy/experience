package com.courses.apollo.model.planet;

/**
 * Created by Богдан on 21.03.2017.
 */
public class Territory {
    /**
     * Name of territory.
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Territory(String name) {
        this.name = name;
    }
}
