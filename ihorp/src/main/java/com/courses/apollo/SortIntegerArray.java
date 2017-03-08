package com.courses.apollo;

/**
 * Created by Ihor Pronko.
* This method sorts the array in ascending and descending order
*/
public final class SortIntegerArray {

    /**
     *Method return sort array in ascending order.
     * @param array array
     * @return array
     */
    public int[] sortUpArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean n = false;
            for (int a = 1; a < array.length; a++) {
                if (array[a - 1] > array[a]) {
                    int b = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = b;
                    n = true;
                }
            }
            if (!n) {
                break;
            }
        }
        return array;
    }

    /**
     * Method return sort array in descending order.
     * @param array array
     * @return array
     */
    public int[] sortDownArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean n = false;
            for (int a = 1; a < array.length; a++) {
                if (array[a - 1] < array[a]) {
                    int b = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = b;
                    n = true;
                }
            }
            if (!n) {
                break;
            }
        }
        return array;
    }
}
