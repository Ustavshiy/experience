package com.courses.apollo;

import com.courses.apollo.model.Fraction;
import com.courses.apollo.model.Polynomial;

/**
 * Created by chopenkod on 10.03.17.
 */
public class PolynomialUtilsTestData {

    public static Polynomial[] getPolynomialArray() {
        return new Polynomial[]{new Polynomial(new Fraction(5, 1), 35),
                new Polynomial(new Fraction(1, 2), 67),
                new Polynomial(new Fraction(1, 3), 32),
                new Polynomial(new Fraction(1, 1), 83)};
    }

    public static double expextedReslt() {
        double expectedResult = 302.16666;
        return expectedResult;
    }
}
