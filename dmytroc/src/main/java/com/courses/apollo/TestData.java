package com.courses.apollo;

import com.courses.apollo.model.Fraction;

/**
 * Class for test Fraction Data.
 */
final class TestData {

    /**
     * Fraction[] array creator.
     *
     * @param arrayLength array length.
     * @param numerator   input array of numerator values.
     * @param denominator input array of denominator values.
     * @return array of Fraction objects.
     */
    public Fraction[] fractionsArrayCreator(int arrayLength, int[] numerator, int[] denominator) {
        Fraction[] fractionArray = new Fraction[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            fractionArray[i] = new Fraction(numerator[i], denominator[i]);
        }
        return fractionArray;
    }
}