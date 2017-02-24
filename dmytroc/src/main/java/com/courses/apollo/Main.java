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

        /**
         * Test array "array" declared and initialized.
         */
        final int[] array = {3, 35, 14, 87, 70, 57, 105, 106, 10, 140};

        /**
         * Call method "moduleSevenAndFive" with test array "array".
         */

        Main.printModuloByTwoNumbers(array);
    }

    /**
     * This method "moduleSevenAndFive" print in console all integers in array,
     * that can be divided by 5 and 7.
     */
    static void printModuloByTwoNumbers(int[] arr) {
        final int moduloOne = 5;
        final int moduloTwo = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % moduloOne == 0 && arr[i] % moduloTwo == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
