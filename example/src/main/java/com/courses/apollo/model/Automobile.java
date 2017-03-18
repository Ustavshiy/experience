package com.courses.apollo.model;

/**
 * Automobile model.
 */
public class Automobile extends Vehicle {
    /**
     * Automobile brand.
     */
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Automobile(String brand, Double price, Integer speed, Integer weight) {
        super(price, speed, weight);
        this.brand = brand;
    }
}
