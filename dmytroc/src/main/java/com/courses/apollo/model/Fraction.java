package com.courses.apollo.model;

/**
 * Class Fraction include numerator, denominator and index for arrays.
 */
public class Fraction {
    /**
     * Index for Fraction[] array.
     */
    private int index;
    /**
     * Numerator value.
     */
    private int numerator;
    /**
     * Denominator value.
     */
    private int denominator;

    public Fraction(int index, int numerator, int denominator) {
        this.index = index;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Fraction " + index + ": " + numerator + " / " + denominator;
    }
}