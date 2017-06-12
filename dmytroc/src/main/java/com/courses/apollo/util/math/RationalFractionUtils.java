package com.courses.apollo.util.math;

import com.courses.apollo.model.math.RationalFraction;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

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
        AtomicInteger counter = new AtomicInteger(0);
        RationalFraction[] resultArray = new RationalFraction[(inputArray.length + 1) / 2];
        IntStream.range(0, inputArray.length).filter(i -> {
            if (i == inputArray.length - 1) {
                resultArray[counter.get()] = new RationalFraction();
                resultArray[counter.get()].setNumerator(inputArray[i].getNumerator());
                resultArray[counter.getAndIncrement()].setDenominator(inputArray[i].getDenominator());
                return false;
            } else {
                return true;
            }
        }).filter(i -> i % 2 == 0).forEach(val -> {
            resultArray[counter.get()] = new RationalFraction();
            resultArray[counter.get()].setNumerator(inputArray[val].getNumerator()
                    + inputArray[val + 1].getNumerator());
            resultArray[counter.getAndIncrement()].setDenominator(inputArray[val].getDenominator()
                    + inputArray[val + 1].getDenominator());
        });
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