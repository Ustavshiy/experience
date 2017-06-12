package com.courses.apollo.util;

import java.util.stream.Stream;

/**
 * Class for Integer Array logic.
 */
public class IntegerArrayUtils {

    /**
     * Method find number with minimum different digits in Array logic.
     *
     * @param array input Array.
     * @return result integer.
     */
    public int minDifferentDigitsFinder(Integer[] array) {
        return Stream.of(array).reduce((numOne, numTwo) -> {
            if (numOne.toString().chars().distinct().count() > numTwo.toString().chars().distinct().count()) {
                return numTwo;
            }
            return numOne;
        }).orElse(0);
    }
}