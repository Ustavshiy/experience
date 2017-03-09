package com.courses.apollo;

/**
 * The sentence with dot.
 * This class was created for solving the Array task:
 * I've got an Integer Array
 * 1. Find the length of any integer number
 * 2. Sort and return the sorted array according to its numbers' length
 */
class ArrayNumbersSorter {

    /**
     * variable for counting digits.
     */
    public static final int TEN = 10;

    /**
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
