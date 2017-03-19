package com.courses.apollo.util.math;

import com.courses.apollo.model.math.Polynomial;

/**
 * Class for RationalFraction logic.
 */
public class PolynomialUtils {

    /**
     * Find sum of Polynomial array. PolynomialFirst+...+PolynomialLast.
     *
     * @param polynomialArray input RationalFraction array.
     * @return calculated sum.
     */
    public double polynomialSum(Polynomial[] polynomialArray) {
        double result = 0;
        for (Polynomial polynomial : polynomialArray) {
            result += polynomial.getPolynomialResult();
        }
        return result;
    }
}