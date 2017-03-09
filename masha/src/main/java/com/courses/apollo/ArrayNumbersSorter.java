package com.courses.apollo;
//import java.lang.Math;

/**
 * This class was created for solving the Array task:
 * I've got an Integer Array
 * 1. Find the length of any integer number
 * 2. Sort and return the sorted array according to its numbers' length
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

    /**
     *
     * @param array
     * @return array sorted by the quantity of numbers digits
     it's an ordinary BubbleSort method, but for digits not for numbrs
     */

   public static int[] digitSort (int[] array){

        int counter = array.length;

        while (counter >= 1){
            for (int i = 1; i < counter; i++) {
                if (numbersLength(array[i-1]) > numbersLength(array[i]))
                {
                    int tempVariable = array[i-1];
                    array[i-1] = array[i];
                    array[i] = tempVariable;
                }
            }
            counter --;

        }

        return array;
    }



    }
