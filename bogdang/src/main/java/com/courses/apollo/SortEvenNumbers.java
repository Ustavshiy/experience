package com.courses.apollo;

/**
 * Created by User on 05.03.2017.
 */


public class SortEvenNumbers {

    private SortEvenNumbers(){

    }

    /**
     * This method sorts the array by comparing modules his elements.
     *
     * @param arr is input array.
     * @return sorted array.
     */
    static int[] sortEven(int[] arr) {
        int mod;
        int k =0;
        for (int i = 0; i <arr.length; i++) {
            mod = arr[i]%2;
                if (mod == 0) {
                    arr[k] = arr[i];
                    k++;
            }
        }
        int[] resultArr = new int[k];
        for (int i =0; i<resultArr.length; i++){
            resultArr[i]= arr[i];
        }
        return resultArr;
    }

    static int[] sortOddEven(int[] resultArr){

    }
}
