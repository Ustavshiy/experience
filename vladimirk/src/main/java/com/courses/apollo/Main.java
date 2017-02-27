package com.courses.apollo;

/**
 * Created by User on 20.02.2017.
 */
public final class Main {

    /**
     * An array of input values "INARRAY" declared and initialized.
     */
    private static final Integer[] INARRAY = {1, 32, -3, -345, 16, 132, 3, 7, 18, 9, 342, 13, 31, 34, 23};

    /**
     * Task: There is an array of integers, write method, that outputs to the console primes.
     */
    private Main() {
    }

    /**
     * This is main method.
     *
     * @param args strings array
     */
    public static void main(String[] args) {

        findPrime(INARRAY);
    }

    /**
     * Method of determining the prime numbers of the numbers from an array.
     *
     * @param arr is the array of input values
     */
    public static void findPrime(Integer[] arr) {

        /** Loop to iterate over the array of numbers. */
        for (int num = 0; num < arr.length; num++) {

            boolean flagIsPrime = true;

            /** Loop that defines primes:
             * 1st if statement weed out negative numbers and zero.
             * 2nd else if statement filters out even numbers except the 2.
             * 3rd else if statement determine the primes by brute force potential dividers. */
            if (arr[num] <= 1) {
                flagIsPrime = false;
            } else if ((arr[num] % 2 == 0) && arr[num] != 2) {
                flagIsPrime = false;
            } else {

                /** Loop-busting potential dividers of numbers.*/
                for (int divisor = 2; divisor <= Math.sqrt(arr[num]); divisor++) {

                    /** This loop cycle defining primes dividing the number of the array on its potential divide*/
                    if (arr[num] % divisor == 0) {
                        flagIsPrime = false;
                        break;
                    }
                }
            }

            /** This loop print primes to the console.*/
            if (flagIsPrime) {
                System.out.println(arr[num]);
            }
        }
    }
}
