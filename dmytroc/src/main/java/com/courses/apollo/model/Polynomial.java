package com.courses.apollo.model;

/**
 * Class Polynomial with Fraction coefficient.
 */
public class Polynomial {
    /**
     * Polynomial value.
     */
    private double polinomial;
    /**
     * Fraction coefficient object.
     */
    private Fraction fractionCoefficient;

    public Polynomial(double polimonial) {
        this.polinomial = polimonial;
    }

    public Polynomial(Fraction fractionCoefficient, double polinomial) {
        this.polinomial = polinomial;
        this.fractionCoefficient = fractionCoefficient;
    }

    public double getPolinomial() {
        return polinomial;
    }

    public void setPolinomial(double polimonial) {
        this.polinomial = polimonial;
    }

    public Fraction getFractionCoefficient() {
        return fractionCoefficient;
    }

    public void setFractionCoefficient(Fraction fractionCoefficient) {
        this.fractionCoefficient = fractionCoefficient;
    }
}