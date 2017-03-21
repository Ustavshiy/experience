package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Created by Богдан on 19.03.2017.
 */
public class Continent extends Planet {

    public Continent() {
    }

    public Continent(String name) {
        super(name);
    }

    public String toString() {
        return "Name of Continent: "+ getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;
        return Objects.equals(getName(), continent.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

