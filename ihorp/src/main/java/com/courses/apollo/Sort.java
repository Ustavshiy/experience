package com.courses.apollo;

/**
 * Created by User on 26.02.2017.
 * This method sorts the array in ascending and descending order
 */
public final class Sort {

    /**
     *Method return sort array in ascending order.
     * @param array array
     * @return array
     */
    public int[] sortUpArray(int[] array) {
        // int i is a counter permutations in a bubble sort.
        int i;
        do {
            i = 0;
            for (int a = 1; a < array.length; a++) {
                if (array[a - 1] > array[a]) {
                    int b = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = b;
                    i++;
                }
            }
        }
        while (i > 0);
        return array;
    }

    /**
     * Method return sort array in descending order.
     * @param array array
     * @return array
     */
    public int[] sortDownArray(int[] array) {
        // int i is a counter permutations in a bubble sort.
        int i;
        do {
            i = 0;
            for (int a = 1; a < array.length; a++) {
                if (array[a - 1] < array[a]) {
                    int b = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = b;
                    i++;
                }
            }
        }
        while (i > 0);
        return array;
    }
}
