package com.courses.apollo;

/**
 * This class created for modulo functions.
 */
final class ModuloUtils {

    /**
     * This static method "printModuloByTwoNumbers" returns Integers in array,
     * that can be divided by moduloOne and moduloTwo.
     *
     * @param arr       Integer array.
     * @param moduloOne first integer for module check.
     * @param moduloTwo second integer for module check.
     * @return return array of integers that contains approved numbers.
     */
    public int[] printModuloByTwoNumbers(int[] arr, int moduloOne, int moduloTwo) {

        int counter = 0;
        int[] transitionalArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % moduloOne == 0 && arr[i] % moduloTwo == 0) {
                transitionalArray[counter] = arr[i];
                counter++;
            }
        }
        int[] approvedNumbers = new int[counter];
        for (int i = 0; i < counter; i++) {
            approvedNumbers[i] = transitionalArray[i];
        }
        return approvedNumbers;
    }
}
