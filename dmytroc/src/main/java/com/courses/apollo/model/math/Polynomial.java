package com.courses.apollo.model.math;

import java.util.List;

/**
 * Class Polynomial.
 * It is a sum of monomials.
 */
public class Polynomial {
    /**
     * Polynomial value.
     */
    private double polynomialResult;
    /**
     * List of monomials.
     */
    private List<Monomial> monomials;

    public Polynomial() {
    }

    public Polynomial(double polynomialResult) {
        this.polynomialResult = polynomialResult;
    }

    public Polynomial(List<Monomial> monomials) {
        this.polynomialResult = monomials.stream().mapToDouble(m -> m.getMonomialResult())
                .reduce((a, b) -> a + b).getAsDouble();
    }

    public double getPolynomialResult() {
        return polynomialResult;
    }

    public void setPolynomialResult(double polynomialResult) {
        this.polynomialResult = polynomialResult;
    }

    public List<Monomial> getMonomials() {
        return monomials;
    }

    public void setMonomials(List<Monomial> monomials) {
        this.monomials = monomials;
    }
}