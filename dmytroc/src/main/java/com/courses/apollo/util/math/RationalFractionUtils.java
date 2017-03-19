package com.courses.apollo.util.math;

import com.courses.apollo.model.math.RationalFraction;

/**
 * This class for RationalFraction logic.
 */
public class RationalFractionUtils {

    /**
     * Method add values fo RationalFraction array with Odd indexes
     * to values of RationalFraction array with Even indexes.
     *
     * @param inputArray for RationalFraction[] array.
     * @return calculated RationalFraction array.
     */
    public RationalFraction[] addOddIndexToEven(RationalFraction[] inputArray) {
        int counter = 0;
        RationalFraction[] resultArray = new RationalFraction[(inputArray.length + 1) / 2];
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0 && i != inputArray.length - 1) {
                resultArray[counter] = new RationalFraction();
                resultArray[counter].setNumerator(inputArray[i].getNumerator()
                        + inputArray[i + 1].getNumerator());
                resultArray[counter].setDenominator(inputArray[i].getDenominator()
                        + inputArray[i + 1].getDenominator());
                counter++;
            } else if (i == inputArray.length - 1) {
                resultArray[counter] = new RationalFraction();
                resultArray[counter].setNumerator(inputArray[i].getNumerator());
                resultArray[counter].setDenominator(inputArray[i].getDenominator());
                counter++;
            }
        }
        return resultArray;
    }

    /**
     * Calculates fraction.returns numerator/denominator.
     * Example A = n/m.
     *
     * @param fraction input RationalFraction object.
     * @return result double.
     */
    public double rationalFractionCalculation(RationalFraction fraction) {
        return fraction.getNumerator() / fraction.getDenominator();
    }
}