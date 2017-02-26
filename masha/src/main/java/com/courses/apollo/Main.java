package com.courses.apollo;

/**
 * It's a test.
 */
public final class Main {

    private Main() {
    }

    /**
     * This is main method.
     *
     * @param args strings array
     */
    public static void main(String[] args) {
        int[] array = {2, 100, 50, 1, 7, -10};
        System.out.println(min(array));
        System.out.println(max(array));
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



