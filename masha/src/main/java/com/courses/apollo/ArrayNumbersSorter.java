package com.courses.apollo;

/**
 * The class contains 2 methods.
 * 1. Counts the quantity of digits for an integer.
 * 2. Returns the sorted array according to its numbers' length.
 */
class ArrayNumbersSorter {

    /**
     * variable for counting digits - the basis of number system.
     */
    public static final int TEN = 10;

    /**
     * Counting the quantity of digits for an integer number.
     *
     * @param number of int, any proper length.
     * @return digitsQuantity, the quantity of digits in number.
     */
    public int numbersLength(int number) {
        int digitsQuantity = 1;
        int digitCounter = TEN;
        while ((double) Math.abs(number) / digitCounter > 1) {
            digitsQuantity++;
            digitCounter = digitCounter * TEN;
        }
        return digitsQuantity;
    }

    /**
     * Returns the sorted array according to its numbers' length.
     *
     * @param array of integers.
     * @return array sorted by the quantity of numbers digits. BubbleSort for digits not for numbers.
     */
    public int[] digitSort(int[] array) {
        int counter = array.length;
        while (counter >= 1) {
            for (int i = 1; i < counter; i++) {
                if (numbersLength(array[i - 1]) > numbersLength(array[i])) {
                    int tempVariable = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tempVariable;
                }
            }
            counter--;
        }
        return array;
    }
}
