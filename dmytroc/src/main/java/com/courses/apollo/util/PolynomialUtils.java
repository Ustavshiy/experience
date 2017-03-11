package com.courses.apollo.util;

import com.courses.apollo.model.Polynomial;

/**
 * Class for Fraction logic.
 */
public class PolynomialUtils {

    /**
     * Find sum of fraction array.
     * @param polynomialArray input Fraction array.
     * @return calculated sum.
     */
    public double polynomialSum(Polynomial[] polynomialArray) {
        double result = 0;
        FractionUtils fractionUtils = new FractionUtils();
        for (Polynomial polynomial : polynomialArray) {
            double calculatedFraction = fractionUtils.fractionCalculation(polynomial
                    .getFractionCoefficient());
            result += polynomial.getPolynomial() * calculatedFraction;
        }
        return result;
    }
}