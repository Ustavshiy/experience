package com.courses.apollo;

/**
 * Class added for FindPrimes function.
 */
final class FindPrimes {

    /**
     * Method of determining the prime numbers of the numbers from an array.
     *
     * @param arr is the array of input values
     */
    public int[] findPrimes(int[] arr) {
        int counter = 0;
        int[] tempArray = new int[arr.length];
        for (int num = 0; num < arr.length; num++) {
            boolean flagIsPrimes = true;

            /**
             * Loop that defines primes, weed out negative numbers and zero, filters out even numbers (except 2).
             */
            if (arr[num] <= 1) {
                flagIsPrimes = false;
            } else if (arr[num] % 2 == 0 && arr[num] != 2) {
                flagIsPrimes = false;
            } else {
                for (int divisor = 2; divisor <= Math.sqrt(arr[num]); divisor++) {
                    if (arr[num] % divisor == 0) {
                        flagIsPrimes = false;
                        break;
                    }
                }
            }
            if (flagIsPrimes) {
                tempArray[counter] = arr[num];
                counter++;
            }
        }
        int[] findedPrimes = new int[counter];
        for (int k = 0; k < counter; k++) {
            findedPrimes[k] = tempArray[k];
        }
        return findedPrimes;
    }
}