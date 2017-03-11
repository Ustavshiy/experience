package com.courses.apollo.util;

import com.courses.apollo.model.Fraction;

/**
 * This class for Fraction logic.
 */
public class FractionUtils {

    /**
     * Method add values fo Fraction array with Odd indexes
     * to values fo Fraction array with Even indexes.
     *
     * @param inputArray for Fraction[] array.
     * @return calculated Fraction array.
     */
    public Fraction[] addOddIndexToEven(Fraction[] inputArray) {
        int counter = 0;
        Fraction[] resultArray = new Fraction[(inputArray.length + 1) / 2];
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0 && i != inputArray.length - 1) {
                resultArray[counter] = new Fraction();
                resultArray[counter].setNumerator(inputArray[i].getNumerator()
                        + inputArray[i + 1].getNumerator());
                resultArray[counter].setDenominator(inputArray[i].getDenominator()
                        + inputArray[i + 1].getDenominator());
                counter++;
            } else if (i == inputArray.length - 1) {
                resultArray[counter] = new Fraction();
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
     * @param fraction input Fraction object.
     * @return result double.
     */
    public double fractionCalculation(Fraction fraction) {
        try {
            double fractionResult = fraction.getNumerator() / fraction.getDenominator();
            return fractionResult;
        } catch (IllegalArgumentException e) {
            return 0;
        }
    }
}
