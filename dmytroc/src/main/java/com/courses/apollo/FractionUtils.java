package com.courses.apollo;

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
                resultArray[counter] = new Fraction(inputArray[i].getNumerator() + inputArray[i + 1].getNumerator(),
                        inputArray[i].getDenominator() + inputArray[i + 1].getDenominator());
                counter++;
            } else if (i == inputArray.length - 1) {
                resultArray[counter] = new Fraction(inputArray[i].getNumerator(),
                        inputArray[i].getDenominator());
                counter++;
            }
        }
        return resultArray;
    }
}
