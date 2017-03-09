package com.courses.apollo;
//import java.lang.Math;

/**
 * This class was created for solving the Array task:
 * I've got an Integer Array
 * 1. Find the length of any integer number
 * 2. Sort and return the sorted array according to its numbers' length
 * 2.1. In decrescent way
 * 2.2. In incresent way
 */
public class ArrayNumbersSorter {

    /**
     *
     * @param number of int, any proper length
     * @return digitsQuantity, the quantity of digits in number
     */

    public static int numbersLength(int number) {
        int digitsQuantity = 1;
        int digitCounter = 10;
        while ((double) Math.abs(number) / digitCounter > 1) {

            digitsQuantity++;
            digitCounter = digitCounter*10;
        }

        return digitsQuantity;
    }


    public static int[] digitSort (int[] array) {

            for (int i = array.length; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (numbersLength(array[j]) > numbersLength(array[j + 1])) {
                        int tempVariable = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tempVariable;
                    }
                }
            }
            return array;
        }



    }
