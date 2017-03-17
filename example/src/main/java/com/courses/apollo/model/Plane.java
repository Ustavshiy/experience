package com.courses.apollo.model;

/**
 * Plane model.
 */
public class Plane extends Vehicle {
    /**
     * Plane max altitude.
     */
    private Long altitude;

    public Long getAltitude() {
        return altitude;
    }

    public void setAltitude(Long altitude) {
        this.altitude = altitude;
    }

    public Plane(Long altitude, Double price, Integer speed, Integer weight) {
        super(price, speed, weight);
        this.altitude = altitude;
    }
}
