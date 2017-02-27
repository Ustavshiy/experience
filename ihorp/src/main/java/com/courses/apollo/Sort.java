package com.courses.apollo;

/**
 * Created by User on 26.02.2017.
 * This method sorts the array in ascending and descending order
 */
public final class Sort {

    private Sort() {
    }

    //Bubble sort UP
    static int[] sortUpArray(int[] array) {
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
        /* i = 0 and the loop is end when the loop is repeated "arrey.lenght" times
        and the condition in line 19 never return "TRUE"*/
        while (i > 0);
        return array;
    }

    //Bubble sort DOWN
    static int[] sortDownArray(int[] array) {
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
        /* i = 0 and the loop is end when the loop is repeated "arrey.lenght" times
        and the condition in line 19 never return "TRUE"*/
        while (i > 0);
        return array;
    }
}
