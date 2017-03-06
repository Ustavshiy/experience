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
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Find maximum.
     *
     * @param array of ints
     * @return max number
     */
    public int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
