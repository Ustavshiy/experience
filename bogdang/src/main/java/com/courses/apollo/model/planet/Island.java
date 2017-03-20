package com.courses.apollo.model.planet;

import org.hamcrest.core.Is;

import java.util.ArrayList;
import java.util.Objects;


public class Island {

    private String name;

    public Island() {

    }

    public Island(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Island island = (Island) o;
        return Objects.equals(name, island.name);
               }

    @Override
    public int hashCode() {
       return Objects.hash(name);
    }
}
