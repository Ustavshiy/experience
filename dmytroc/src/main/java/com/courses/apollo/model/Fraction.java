package com.courses.apollo.model;

/**
 * Class Fraction include numerator, denominator. Fraction expression Xa-Xb/Ya-Yb.
 */
public class Fraction {
    /**
     * Point A for line definition A(Xa,Ya).
     */
    private Point pointA;
    /**
     * Point B for line definition B(Xb,Yb).
     */
    private Point pointB;
    /**
     * Numerator value. Calculated Xa - Xb.
     */
    private double numerator;
    /**
     * Denominator value. Calculated Ya - Yb.
     */
    private double denominator;

    public Fraction() {
    }

    public Fraction(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;

        numerator = pointA.getCoordX() - pointB.getCoordX();
        denominator = pointA.getCoordY() - pointB.getCoordY();
    }

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
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

    @Override
    public String toString() {
        return numerator
                + " / " + denominator;
    }
}