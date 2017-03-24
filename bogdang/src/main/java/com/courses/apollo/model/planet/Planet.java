package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Creation of the planet.
 */
public class Planet extends Territory {

    /**
     * Ordinal number of the planet in the system.
     */
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Planet(String name, Integer number) {
        super(name);
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Planet planet = (Planet) o;
        return Objects.equals(getName(), planet.getName())
            && Objects.equals(getNumber(), planet.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }
}


