package com.courses.apollo;

/**
 * Created by Ihor Pronko.
* This method sorts the array in ascending and descending order
*/
public final class SortIntegerArray {

    /**
     *Method return sort array in ascending order.
     * @param array non sort array
     * @return array
     */
    public int[] sortAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int a = 1; a < array.length; a++) {
                if (array[a - 1] > array[a]) {
                    int tmp = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = tmp;
                }
            }
        }
        return array;
    }

    /**
     * Method return sort array in descending order.
     * @param array non sort array
     * @return array
     */
    public int[] sortDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int a = 1; a < array.length; a++) {
                if (array[a - 1] < array[a]) {
                    int tmp = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = tmp;
                }
            }
        }
        return array;
    }
}
