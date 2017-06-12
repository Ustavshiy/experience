package com.courses.apollo.util;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This class created for modulo functions.
 */
public class ModuloUtils {

    /**
     * This static method "printModuloByTwoNumbers" returns Integers in array,
     * that can be divided by moduloOne and moduloTwo.
     *
     * @param arr       Integer array.
     * @param moduloOne first integer for module check.
     * @param moduloTwo second integer for module check.
     * @return return array of integers that contains approved numbers.
     */
    public Integer[] printModuloByTwoNumbers(int[] arr, int moduloOne, int moduloTwo) {
        Set<Integer> numberSet = new LinkedHashSet<>();
        Arrays.stream(arr)
                .filter(num -> num % moduloOne == 0 && num % moduloTwo == 0)
                .forEach(num -> numberSet.add(num));
        return numberSet.toArray(new Integer[0]);
    }
}