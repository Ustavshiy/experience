package com.courses.apollo.util.mathdata;

import com.courses.apollo.model.math.RationalFraction;

public class FractionUtilsTestData {

    public static RationalFraction[] getFractionsArray() {
        return new RationalFraction[]{new RationalFraction(12, 1),
                new RationalFraction(345, 35),
                new RationalFraction(1, 17),
                new RationalFraction(34, 24),
                new RationalFraction(25, 12)};
    }

    public static RationalFraction[] expectedResult() {
        return new RationalFraction[]{new RationalFraction(357, 36),
                new RationalFraction(35, 41),
                new RationalFraction(25, 12)};
    }

    public static RationalFraction[] getFractionCalculationTestArray() {
        return new RationalFraction[]{new RationalFraction(12, 3),
                new RationalFraction(3, 0)};
    }

    public static Double[] getFractionCalculationResultArray() {
        return new Double[]{4D, Double.POSITIVE_INFINITY};
    }
}
