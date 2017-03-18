package com.courses.apollo.model;

/**
 * Tank model.
 */
public class Tank extends Vehicle {
    /**
     * Tank canon type.
     */
    private String canon;

    public Tank(Double price, Integer speed, Integer weight) {
        super(price, speed, weight);
    }

    public String getCanon() {
        return canon;
    }

    public void setCanon(String canon) {
        this.canon = canon;
    }
}
