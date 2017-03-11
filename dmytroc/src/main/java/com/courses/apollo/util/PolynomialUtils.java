package com.courses.apollo.util;

import com.courses.apollo.model.Polynomial;

/**
 * Created by chopenkod on 10.03.17.
 */
public class PolynomialUtils {

    public double polynomialSum(Polynomial[] polynomialArray) {
        double result = 0;
        FractionUtils fractionUtils = new FractionUtils();
        for (Polynomial polynomial : polynomialArray) {
            double calculatedFraction = fractionUtils.fractionCalculatuion(polynomial
                    .getFractionCoefficient());
            result += (polynomial.getPolinomial() * calculatedFraction);
        }
        return result;
    }
}
