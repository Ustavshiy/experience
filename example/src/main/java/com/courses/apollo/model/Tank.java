package com.courses.apollo.model;

/**
 * Tank model.
 */
public class Tank {
    /**
     * Tank canon type.
     */
    private String canon;
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

    public String getCanon() {
        return canon;
    }

    public void setCanon(String canon) {
        this.canon = canon;
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

    public Tank() {
    }
}
