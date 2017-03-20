package com.courses.apollo.model.motorcyclist;

import java.math.BigDecimal;

/**
 * Created by Ihor on 20.03.2017.
 */
public class Motorcyclist {

    public Motorcyclist() {}

    /**
     *
     */
    protected String name;

    /**
     *
     */
    protected BigDecimal price;

    /**
     *
     */
    protected double weight;

    public Motorcyclist(String name, String price, double weight) {
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
}
