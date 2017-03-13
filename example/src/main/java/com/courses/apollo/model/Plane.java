package com.courses.apollo.model;

/**
 * Created by User on 13.03.2017.
 */
public class Plane {
    private Long altitude;
    private Double price;
    private Integer speed;
    private Integer weight;

    public Long getAltitude() {
        return altitude;
    }

    public void setAltitude(Long altitude) {
        this.altitude = altitude;
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

    public Plane() {
    }

    public Plane(Long altitude, Double price, Integer speed, Integer weight) {
        this.altitude = altitude;
        this.price = price;
        this.speed = speed;
        this.weight = weight;
    }
}
