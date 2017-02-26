package com.courses.apollo;

/**
 * Created by User on 20.02.2017.
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
        final int[] array = {12, 15, 28, 33, 49, 6};
        Main.printEvenAndOddNumbers(array);
    }

    /**
     * This method prints even and odd numbers in console.
     *
     * @param arr int array
     */
    static void printEvenAndOddNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " even");
            } else {
                System.out.println(arr[i] + " odd");
            }

        }

    }
}
