package com.courses.apollo.model;

/**
 * Class Fraction include numerator, denominator Xa-Xb/Ya-Yb.
 */
public class Fraction {
    /**
     * Coordinate X of point A.
     */
    private double coordXA;
    /**
     * Coordinate X of point B.
     */
    private double coordXB;
    /**
     * Coordinate Y of point A.
     */
    private double coordYA;
    /**
     * Coordinate Y of point B.
     */
    private double coordYB;
    /**
     * Numerator value.
     */
    private double numerator;
    /**
     * Denominator value.
     */
    private double denominator;

    public Fraction() {}

    public Fraction(double coordXA, double coordXB, double coordYA, double coordYB) {
        this.coordXA = coordXA;
        this.coordXB = coordXB;
        this.coordYA = coordYA;
        this.coordYB = coordYB;

        numerator = coordXA - coordXB;
        denominator = coordYA - coordYB;
    }

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public double getCoordXA() {
        return coordXA;
    }

    public void setCoordXA(double coordXA) {
        this.coordXA = coordXA;
    }

    public double getCoordXB() {
        return coordXB;
    }

    public void setCoordXB(double coordXB) {
        this.coordXB = coordXB;
    }

    public double getCoordYA() {
        return coordYA;
    }

    public void setCoordYA(double coordYA) {
        this.coordYA = coordYA;
    }

    public double getCoordYB() {
        return coordYB;
    }

    public void setCoordYB(double coordYB) {
        this.coordYB = coordYB;
    }

    @Override
    public String toString() {
        return coordXA + " + " + coordXB
                + " / " + coordYA + " + " + coordYB;
    }
}