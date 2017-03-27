package com.courses.apollo.model.motorcyclist;

import java.util.Objects;

/**
 * Class Equipment for all motoequipment for all memory devices.
 */
public class Equipment {

    /**
     * @param price indicate price of equipment in cents.
     */
    private int price;

    /**
     * @param weight indicate weight of equipment in grams.
     */
    private int weight;

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    /**
     * Constructor for equipment.
     * @param price to indicate price of equipment in cents.
     * @param weight to indicate weight of equipment in grams.
     */
    public Equipment(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Equipment equipment = (Equipment) o;
        return price == equipment.price && weight == equipment.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight);
    }
}
