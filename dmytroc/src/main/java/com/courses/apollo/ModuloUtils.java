package com.courses.apollo;

import java.util.HashSet;
import java.util.Set;

/**
 * This class created for modulo functions.
 */
final class ModuloUtils {

    private ModuloUtils() {

}
    /**
     * This static method "printModuloByTwoNumbers" returns Integers in array,
     * that can be divided by moduloOne and moduloTwo.
     *
     * @param arr Integer array.
     * @param moduloOne first integer for module check.
     * @param moduloTwo second integer for module check.
     * @return return Set of Integers that contains approved numbers
     */
    static Set<Integer> printModuloByTwoNumbers(Integer[] arr, int moduloOne, int moduloTwo) {

        /**
         *Created a HashSet to collect all approved numbers.
         */
        Set<Integer> approvedNumbers = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % moduloOne == 0 && arr[i] % moduloTwo == 0) {
                approvedNumbers.add(arr[i]);
            }
        }
        return approvedNumbers;
    }
}
