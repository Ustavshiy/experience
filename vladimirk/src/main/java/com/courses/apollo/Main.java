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
        for (int num = 0; num < arr.length; num++) {
            boolean flagIsPrime = true;
            /**
             * Loop that defines primes, weed out negative numbers and zero, filters out even numbers (except 2).
             */
            if (arr[num] <= 1) {
                flagIsPrime = false;
            } else if ((arr[num] % 2 == 0) && arr[num] != 2) {
                flagIsPrime = false;
            } else {
                for (int divisor = 2; divisor <= Math.sqrt(arr[num]); divisor++) {
                    if (arr[num] % divisor == 0) {
                        flagIsPrime = false;
                        break;
                    }
                }
            }
            if (flagIsPrime) {
                System.out.println(arr[num]);
            }
        }
    }
}
