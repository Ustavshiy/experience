package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Is part of the Planet.
 */
public class Continent extends Territory {

    /**
     * Latitude on which there is continent.
     */
    private String latitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Continent(String name, String latitude) {
        super(name);
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Continent continent = (Continent) o;
        return Objects.equals(getName(), continent.getName())
                && Objects.equals(getLatitude(), continent.getLatitude());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLatitude());
    }
}

