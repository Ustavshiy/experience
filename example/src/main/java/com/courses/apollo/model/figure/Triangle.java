package com.courses.apollo.model.figure;

/**
 * Triangle representation.
 */
public final class Triangle extends AngleShape {

    public static int test;

    public double sideB;

    public double sideC;

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public Triangle() {
        System.out.println("In triangle constructor");
    }

    @Override
    public double getArea() {
        double perimeter = getPerimeter() / 2;
        return Math.sqrt(perimeter * ((perimeter - getSideA()) * (perimeter - sideB) * (perimeter - sideC)));
    }

    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

}
