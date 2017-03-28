package com.courses.apollo.util.mathdata;

import com.courses.apollo.model.math.Polynomial;

public class PolynomialUtilsTestData {

    public static Polynomial[] getPolynomialArray() {
        return new Polynomial[]{new Polynomial(18D),
                new Polynomial(13D),
                new Polynomial(43D),
                new Polynomial(24D)};
    }

    public static double expextedReslt() {
        double expectedResult = 98D;
        return expectedResult;
    }
}
