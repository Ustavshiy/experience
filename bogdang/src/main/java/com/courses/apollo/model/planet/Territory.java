package com.courses.apollo.model.planet;

/**
 * Parent class for creating a planet.
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
