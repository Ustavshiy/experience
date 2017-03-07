package com.courses.apollo;

import com.courses.apollo.model.Fraction;

/**
 * Class for Fraction logic.
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
                resultArray[counter] = new Fraction(counter,
                        inputArray[i].getNumerator() + inputArray[i + 1].getNumerator(),
                        inputArray[i].getDenominator() + inputArray[i + 1].getDenominator());
                counter++;
            } else if (i == inputArray.length - 1) {
                resultArray[counter] = new Fraction(counter,
                        inputArray[i].getNumerator(),
                        inputArray[i].getDenominator());
                counter++;
            }
        }
        return resultArray;
    }

    /**
     * Fraction[] array creator.
     * @param arrayLength array length.
     * @param numerator input array of numerator values.
     * @param denominator input array of denominator values.
     * @return array of Fraction objects.
     */
    public Fraction[] fractionsArrayCreator(int arrayLength, int[] numerator, int[] denominator) {

        Fraction[] fractionArray = new Fraction[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            fractionArray[i] = new Fraction(i, numerator[i], denominator[i]);
        }
        return fractionArray;
    }
}