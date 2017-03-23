package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Is part of the Planet.
 */
public class Island extends Territory {

    /**
     * Area of the island.
     */
    private Double area;

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Island(String name, Double area) {
        super(name);
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Island island = (Island) o;
        return Objects.equals(getName(), island.getName())
            && Objects.equals(getArea(), island.getArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getArea());
    }
}
