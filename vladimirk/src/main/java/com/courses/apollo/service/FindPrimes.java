package com.courses.apollo.service;

/**
 * Class added for FindPrimes function.
 */
public final class FindPrimes {

    /**
     * Method of determining the prime numbers of the numbers from an array.
     *
     * @param arr is the array of input values
     */
    public int[] findPrimes(int[] arr) {
        int counter = 0;
        int[] tempArray = new int[arr.length];
        for (int num = 0; num < arr.length; num++) {
            int numberFromArr = arr[num];
            boolean isPrime = checkIsPrime(numberFromArr);
            if (isPrime) {
                tempArray[counter] = numberFromArr;
                counter++;
            }
        }
        int[] findedPrimes = new int[counter];
        for (int k = 0; k < counter; k++) {
            findedPrimes[k] = tempArray[k];
        }
        return findedPrimes;
    }

    /**
     * Method added to avoid new checkstyle rule about 25 lines - return boolean flagIsPrime.
     *
     * @param numberFromArr is the array of input values
     */
    private boolean checkIsPrime(int numberFromArr) {
        boolean flagIsPrimes = true;
        if (numberFromArr <= 1) {
            flagIsPrimes = false;
        } else if (numberFromArr % 2 == 0 && numberFromArr != 2) {
            flagIsPrimes = false;
        } else {
            for (int divisor = 2; divisor <= Math.sqrt(numberFromArr); divisor++) {
                if (numberFromArr % divisor == 0) {
                    flagIsPrimes = false;
                    break;
                }
            }
        }
        return flagIsPrimes;
    }
}