package com.courses.apollo.model.planet;

import org.hamcrest.core.Is;

import java.util.ArrayList;
import java.util.Objects;


public class Island extends Planet {

    private String name;

    private ArrayList<Integer> coordinates;

    public Island(){
    }

    public Island(String name, ArrayList<Integer> coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Integer> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Island island = (Island) o;
        return Objects.equals(name, island.name)
                && Objects.equals(coordinates, island.coordinates);
    }

    @Override
    public int hashCode() {
       return Objects.hash(name, coordinates);
    }
}
