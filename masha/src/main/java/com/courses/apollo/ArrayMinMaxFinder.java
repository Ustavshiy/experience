package com.courses.apollo;

/**
 * Finder for min max in array.
 */
public class ArrayMinMaxFinder {

    /**
     * Find  minimum in array.
     *
     * @param array of ints
     * @return min number
     */
    public int min(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    /**
     * Find maximum.
     *
     * @param array of ints
     * @return max number
     */
    public int max(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
