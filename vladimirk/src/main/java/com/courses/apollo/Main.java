package com.courses.apollo;

/**
 * Created by User on 20.02.2017.
 */
public final class Main {

    /** An array of input values "INARRAY" declared and initialized.*/
    private static final Integer[] INARRAY = {1, 32, -3, -345, 16, 132, 3, 7, 18, 9, 342, 13, 31, 34, 23};

    /**
     * Task: There is an array of integers, write method, that outputs to the console primes.
     * Solutions algorithm: I did not use specific tests for primality.
     * This decision is based on the properties of prime numbers.
     * (https://en.wikipedia.org/wiki/Prime_number)
     */
    private Main() {
    }

    /**
     * This is main method.
     *
     * @param args strings array
     */
    public static void main(String[] args) {

        Main main = new Main();
        main.findPrime();
    }

     /** Method of determining the prime numbers of the numbers from an array.*/
     public void findPrime() {

        /** Loop to iterate over the array of numbers. */
        for (int num = 0; num < INARRAY.length; num++) {

            boolean flagIsPrime = true;
            /** Sorting numbers loop that defines primes.
             * The first if statement created to weed out negative numbers and zero.
             * The second else if statement filters out even numbers except the deuce to speed up applications
             * (since they are complex numbers).
             * The third else if statement determine the primes by brute force potential dividers of numbers array. */
            if (INARRAY[num] <= 1) {
                flagIsPrime = false;
            } else if ((INARRAY[num] % 2 == 0) && INARRAY[num] != 2) {
                flagIsPrime = false;
            } else {
                /** Loop-busting potential dividers of numbers.
                 * The value of the divisor is limited to the square root of number. */
                for (int divisor = 2; divisor <= Math.sqrt(INARRAY[num]); divisor++) {
                    /** This loop cycle defining primes dividing the number of the array on its potential divide
                     * and stops checking on the first case, the division without a trace.
                     * (assigning the appropriate value of Boolean variable). */

                    if (INARRAY[num] % divisor == 0) {
                        flagIsPrime = false;
                        break;
                    }
                }
            }

            /** This loop print primes to the console.*/
            if (flagIsPrime) {
                System.out.println(INARRAY[num]);
            }
        }
    }
}
