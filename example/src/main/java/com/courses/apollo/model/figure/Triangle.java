package com.courses.apollo.model.figure;

/**
 * Triangle representation.
 */
public final class Triangle extends AngleShape {
    /**
     * Triangle sideB.
     */
    private double sideB;

    /**
     * Triangle sideC.
     */
    private double sideC;

    public Triangle(double sideA) {
        super(sideA);
    }

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA);
        this.sideB = sideB;
        this.sideC = sideC;
    }

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



    /**
     * Get Triangle area.
     * @return area
     */
    @Override
    public double getArea() {
        double perimeter = getPerimeter() / 2;
        return Math.sqrt(perimeter * ((perimeter - getSideA()) * (perimeter - sideB) * (perimeter - sideC)));
    }

    /**
     * Get Triangle perimeter.
     * @return perimeter.
     */
    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

}
