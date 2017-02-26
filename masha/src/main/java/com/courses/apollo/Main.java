package com.courses.apollo;

/**
 * It's a test.
 */

public final class Main {

    /**
     * ARRAY is a constant for testing.
     */
    private static final int[] ARRAY = {2, 100, 50, 1, 7, -10};

    private Main() {
    }

    /**
     * This is main method.
     *
     * @param args strings array
     */
    public static void main(String[] args) {

        System.out.println(min(ARRAY));
        System.out.println(max(ARRAY));
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }


}



