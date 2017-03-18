package com.courses.apollo.model;

/**
 * Vehicle general model.
 */
public class Vehicle {

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

    public Vehicle(Double price, Integer speed, Integer weight) {
        this.price = price;
        this.speed = speed;
        this.weight = weight;
    }
}
