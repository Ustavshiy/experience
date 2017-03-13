package com.courses.apollo;


import com.courses.apollo.model.Fraction;

public class FractionUtilsTestData {

    public static Fraction[] getFractionsArray() {
        return new Fraction[]{new Fraction(12,1),
                new Fraction(345,35),
                new Fraction(1,17),
                new Fraction(34,24),
                new Fraction(25,12)};
    }

    public static Fraction[] expectedResult() {
        return new Fraction[] {new Fraction(357,36),
                new Fraction(35,41),
                new Fraction(25,12)};
    }
}
