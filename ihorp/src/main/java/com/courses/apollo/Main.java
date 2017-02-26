package com.courses.apollo;

/**
 * Created by Ihor on 26.02.2017.
 * Programm sort an array of integer and input ascending order and descending order
 */

public class Main {

    //Create an array
    static int[] array = {34, -56, 3456, 1, 0, 43, -2345, 84, -23, -1};

    // Int n tell us how many integers we have into array
    static int n = array.length;

    public static void main(String[] args) {
        //Print sort array UP
        System.out.println("Output array sorted up:");
        for (int v: Sort.SortUpArray(array, n)) {
            System.out.println(v);
        }
        // Print Sort array DOWN
        System.out.println("\n\nOutput array sorted down:");
        for (int v: Sort.SortDownArray(array, n)) {
            System.out.println(v);
        }
    }
}
