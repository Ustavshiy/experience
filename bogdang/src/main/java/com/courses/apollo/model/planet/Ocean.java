package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Is part of the Planet.
 */
public class Ocean extends Territory {

    /**
     * Depth of Ocean.
     */
    private Integer depth;

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Ocean(String name, Double area, Integer depth) {
        super(name, area);
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Ocean ocean = (Ocean) o;
        return Objects.equals(getName(), ocean.getName())
                && Objects.equals(getArea(), ocean.getArea())
                && Objects.equals(getDepth(), ocean.getDepth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getArea(), getDepth());
    }
}

