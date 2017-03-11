package com.courses.apollo.model;

/**
 * Class Polynomial with Fraction coefficient.
 */
public class Polynomial {
    /**
     * Polynomial value.
     */
    private double polynomial;
    /**
     * Fraction coefficient object.
     */
    private Fraction fractionCoefficient;

    public Polynomial(double polynomial) {
        this.polynomial = polynomial;
    }

    public Polynomial(Fraction fractionCoefficient, double polynomial) {
        this.polynomial = polynomial;
        this.fractionCoefficient = fractionCoefficient;
    }

    public double getPolynomial() {
        return polynomial;
    }

    public void setPolynomial(double polymonial) {
        this.polynomial = polymonial;
    }

    public Fraction getFractionCoefficient() {
        return fractionCoefficient;
    }

    public void setCoefficient(Fraction fractionCoefficient) {
        this.fractionCoefficient = fractionCoefficient;
    }
}