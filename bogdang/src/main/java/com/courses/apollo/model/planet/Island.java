package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Is part of the Planet.
 */
public class Island extends Territory {

    public Island(String name, Double area) {
        super(name, area);
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
