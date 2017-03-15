package com.courses.apollo.model.food;

import com.courses.apollo.model.food.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class Salad.
 * In include list of vegetables as aggregation, some species and fill-up.
 */
public class Salad {
    /**
     * list of vegetables in salad.
     */
    private ArrayList<Vegetable> vegetables;
    /**
     * Name of specie.
     */
    private String species;
    /**
     * Name of fill-up.
     */
    private String fillUp;

    public ArrayList<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(ArrayList<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFillUp() {
        return fillUp;
    }

    public void setFillUp(String fillUp) {
        this.fillUp = fillUp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Salad salad = (Salad) o;
        return Objects.equals(vegetables, salad.vegetables)
                && Objects.equals(species, salad.species)
                && Objects.equals(fillUp, salad.fillUp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vegetables, species, fillUp);
    }
}