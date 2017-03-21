package com.courses.apollo.model.planet;

import org.hamcrest.core.Is;

import java.util.ArrayList;
import java.util.Objects;


public class Island extends Planet {

    public Island() {
    }

    public Island(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;


        Island island = (Island) o;
        return Objects.equals(getName(), island.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

}
