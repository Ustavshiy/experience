package com.courses.apollo;

/**
 * Created by User on 05.03.2017.
 */
final class SortEvenNumbers {

    private SortEvenNumbers() {

    }

    /**
     * This method sorts and selects the even number.
     *
     * @param arr is input array.
     * @return result array.
     */
    static int[] sortEven(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        int[] result = new int[k];
        System.arraycopy(arr, 0, result, 0, k);
        return result;
    }

    static int[] sortOddEven(int[] result) {
        int odd = 0;
        int even = 0;
        int k = 0;
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
                result[k] = result[i];
                k++;
            }
            odd = 0;
            even = 0;
        }
        int[] massOddEven = new int[k];
        System.arraycopy(result, 0, massOddEven, 0, k);
        return massOddEven;
    }

}

