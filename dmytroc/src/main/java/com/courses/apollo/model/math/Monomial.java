package com.courses.apollo.model.math;

import java.util.List;

/**
 * Class Monomial to complete Polynomial hierarchy.
 */
public class Monomial {
    /**
     * Multiplied variables.
     */
    private Double monomialResult;
    /**
     * List of variables.
     */
    private List<Double> variables;

    public Monomial() {
    }

    public Monomial(List<Double> variables) {
        Double variablesMultiply = 0D;
        for (Double variable : variables) {
            variablesMultiply *= variable;
        }
        this.monomialResult = variablesMultiply;
    }

    public Double getMonomialResult() {
        return monomialResult;
    }

    public void setMonomialResult(Double monomialResult) {
        this.monomialResult = monomialResult;
    }

    public List<Double> getVariables() {
        return variables;
    }

    public void setVariables(List<Double> variables) {
        this.variables = variables;
    }
}
