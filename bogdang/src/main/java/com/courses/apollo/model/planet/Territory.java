package com.courses.apollo.model.planet;

/**
 * Parent class for creating a planet.
 */
public abstract class Territory {
    /**
     * Name of territory.
     */
    private String name;

    /**
     * Area of the territory.
     */
    private Double area;

    public Territory(String name, Double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
