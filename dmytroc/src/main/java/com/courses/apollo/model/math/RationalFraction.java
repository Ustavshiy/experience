package com.courses.apollo.model.math;

import java.util.Objects;

/**
 * Class RationalFraction include numerator, denominator. RationalFraction expression Xa-Xb/Ya-Yb.
 */
public class RationalFraction {
    /**
     * Numerator value. Calculated input Polynomial.
     */
    private double numerator;
    /**
     * Denominator value. Calculated input Polynomial.
     */
    private double denominator;

    public RationalFraction() {
    }

    public RationalFraction(Polynomial numerator, Polynomial denominator) {
        this.numerator = numerator.getPolynomialResult();
        this.denominator = denominator.getPolynomialResult();
    }

    public RationalFraction(double numerator, double denominator) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RationalFraction that = (RationalFraction) o;
        return Double.compare(that.numerator, numerator) == 0
                && Double.compare(that.denominator, denominator) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}