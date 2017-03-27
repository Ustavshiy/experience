package com.courses.apollo.model.food.vegetable;

import java.util.Objects;

/**
 * Class Vegetables is superclass for all sort of vegetables.
 * Include Integer weight and class Vegetable characteristics as composition.
 */
public class Vegetable {

    /**
     * Integer value of weight of component in grams.
     */
    private Integer weight;

    /**
     * Class contains information about vegetables.
     */
    private FoodInfo characteristics;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public FoodInfo getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(FoodInfo characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vegetable vegetable = (Vegetable) o;
        return Objects.equals(characteristics, vegetable.characteristics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characteristics);
    }

    @Override
    public String toString() {
        return "Vegetable is "
                + this.getClass().getSimpleName() + " its weight is"
                + weight + " grams"
                + characteristics.getCalories() + " calories";
    }
}