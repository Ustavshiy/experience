package com.courses.apollo.old;

/**
 * Choose from an array of even number equal to the number of even and odd digits.
 */
public class SortEvenNumbers {

    /**
     * Sorts and selects the even number.
     *
     * @param arr is input array.
     * @return result array.
     */
    public int[] sortEven(int[] arr) {
        int numberOfSuitable = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[numberOfSuitable] = arr[i];
                numberOfSuitable++;
            }
        }
        int[] result = new int[numberOfSuitable];
        System.arraycopy(arr, 0, result, 0, numberOfSuitable);
        return result;
    }

    /**
     * Returns numbers with an equal number of even and odd digits.
     *
     * @param result in input.
     * @return massOddEven array.
     */
    public int[] sortOddEven(int[] result) {
        int odd = 0;
        int even = 0;
        int  numberOfSuitable = 0;
        final int ten = 10;
        for (int i = 0; i < result.length; i++) {
            int number = result[i];
            while (number > 0) {
                int num = number % ten;
                number = number / ten;
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (even == odd) {
                result[numberOfSuitable] = result[i];
                numberOfSuitable++;
            }
            odd = 0;
            even = 0;
        }
        int[] massOddEven = new int[numberOfSuitable];
        System.arraycopy(result, 0, massOddEven, 0, numberOfSuitable);
        return massOddEven;
    }

}

