package com.courses.apollo.model.figure;

/**
 * Round Shape represent ellipse and circle.
 */
public abstract class RoundShape extends Shape {

    private double sideA;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
}
