package com.courses.apollo.util.math;

import com.courses.apollo.model.math.Polynomial;

import java.util.Arrays;

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
        return Arrays.stream(polynomialArray).mapToDouble(p -> p.getPolynomialResult()).sum();
    }
}