package com.courses.apollo.model;

import java.util.Objects;

/**
 * Dish class.
 */
public class Dish {
    /**
     * Name of Dish.
     */
    private final String name;
    /**
     * Is dish vegetarian.
     */
    private final boolean vegetarian;
    /**
     * How much calories contains.
     */
    private final int calories;
    /**
     * Type of dish.
     */
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    /**
     * Enum of Dish Type.
     */
    public enum Type {
        /**
         * MEAT Type.
         */
        MEAT,
        /**
         * FISH Type.
         */
        FISH,
        /**
         * OTHER Type.
         */
        OTHER
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dish)) {
            return false;
        }
        Dish dish = (Dish) o;
        return vegetarian == dish.vegetarian
                && calories == dish.calories
                && Objects.equals(name, dish.name)
                && type == dish.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vegetarian, calories, type);
    }
}