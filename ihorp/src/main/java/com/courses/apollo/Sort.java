package com.courses.apollo;

/**
 * Created by User on 26.02.2017.
 * This method sorts the array in ascending and descending order
 */
public final class Sort {

    private Sort() {
    }

    /*
     * Method return sort array in ascending order
     */
    static int[] sortUpArray(int[] array) {
        // int i is a counter permutations in a bubble sort.
        boolean i;
        do {
            i = true;
            for (int a = 1; a < array.length; a++) {
                if (array[a - 1] > array[a]) {
                    int b = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = b;
                    i = false;
                }
            }
        }
        /* i = 0 and the loop is end when the loop is repeated "arrey.lenght" times
        and the condition in line 19 never return "TRUE"*/
        while (!i);
        return array;
    }

    /*
     * Method return sort array in descending order
     */
    static int[] sortDownArray(int[] array) {
        // int i is a counter permutations in a bubble sort.
        boolean i;
        do {
            i = true;
            for (int a = 1; a < array.length; a++) {
                if (array[a - 1] < array[a]) {
                    int b = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = b;
                    i = false;
                }
            }
        }
        /* i = 0 and the loop is end when the loop is repeated "arrey.lenght" times
        and the condition in line 19 never return "TRUE"*/
        while (!i);
        return array;
    }
}
