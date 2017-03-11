package com.courses.apollo.model;

/**
 * Class line. Defined by Fraction. Include slope coefficient parameter.
 */
public class Line {
    /**
     * Fraction for simple line definition.
     */
    private Fraction fraction;
    /**
     * Slope coefficient define angle away from the horizontal
     * zero - horizontal, Infinity - vertical.
     */
    private double slope;

    public Line(Fraction fraction) {
        this.fraction = fraction;

    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    public Fraction getFraction() {
        return fraction;
    }

    public void setFraction(Fraction fraction) {
        this.fraction = fraction;
    }

    public double getSlope() {
        return slope;
    }

    @Override
    public String toString() {
        return "fraction: "
                + "PointA = [" + fraction.getPointA().getCoordX() + " + " + fraction.getPointA().getCoordY() + "]"
                + ", PointB = [" + fraction.getPointB().getCoordX() + " + " + fraction.getPointB().getCoordY() + "]";
    }
}

