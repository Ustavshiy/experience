package com.courses.apollo.model.motorcyclist.motoequipment;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ALFA class of all of motorcyclist's equipment.
 */
public abstract class MotoEquipment {

    public MotoEquipment() {}

    /**
     * Field name of *. Inherited of other child classes.
     */
    protected String name;

    /**
     * Field price of *. Inherited of other child classes.
     */
    protected BigDecimal price;

    /**
     * Field weight of *. Inherited of other child classes.
     */
    protected double weight;

    public MotoEquipment(String name, String price, double weight) {
        this.name = name;
        this.price = new BigDecimal(price).setScale(2, BigDecimal.ROUND_HALF_UP);
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = new BigDecimal(price).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MotoEquipment)) {
            return false;
        }
        MotoEquipment that = (MotoEquipment) o;
        return Double.compare(that.weight, weight) == 0
                && Objects.equals(name, that.name)
                && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }
}
