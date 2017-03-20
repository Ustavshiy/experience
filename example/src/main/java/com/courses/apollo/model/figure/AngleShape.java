package com.courses.apollo.model.figure;

/**
 * Represent all shape that have sides and angles.
 */
public abstract class AngleShape extends Shape{

    private double sideA;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

}
