package com.courses.apollo.model;

/**
 * Automobile model.
 */
public class Automobile {
    /**
     * Automobile brand.
     */
    private String brand;
    /**
     * Total price.
     */
    private Double price;
    /**
     * Max speed.
     */
    private Integer speed;
    /**
     * Max weight.
     */
    private Integer weight;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Automobile(String brand, Double price, Integer speed, Integer weight) {
        this.brand = brand;
        this.price = price;
        this.speed = speed;
        this.weight = weight;
    }

    public Automobile() {
    }
}
