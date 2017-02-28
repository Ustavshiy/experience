package com.courses.apollo;

/**
 * Programm sort an array of integer and input ascending order and descending order
 * Created by Ihor on 26.02.2017.
 *
 */

public final class Main {

    private Main() {}

    /**
     * Create a array.
     */
    private static final int[] ARRAY = {34, -56, 3456, 1, 0, 43, -2345, 84, -23, -1};

    /**
     * Create a main method.
     * @param args NULL
     */
    public static void main(String[] args) {
        //Print sort array UP
        System.out.println("Output array sorted up:");
        for (int v: Sort.sortUpArray(ARRAY)) {
            System.out.println(v);
        }
        // Print Sort array DOWN
        System.out.println("\n\nOutput array sorted down:");
        for (int v: Sort.sortDownArray(ARRAY)) {
            System.out.println(v);
        }
    }
}