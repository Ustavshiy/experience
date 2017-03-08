package com.courses.apollo;

/**
 * Created by Ihor Pronko.
 */

public final class PalindromeNumberFinderInIntegerArray {

    /**
     * Method find palindrome in array and return it,
     * if in array have more then one palindrome number, method return second palindrome number.
     *
     * @param array array
     * @return palindrome
     */
    public int palindromeNumberFinder(int[] array) {

        int palindrome = 0;
        int numberOfPalindromeInArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (isIntegerIsPalindrome(array[i])) {
                numberOfPalindromeInArray += 1;
                palindrome = array[i];
            }
            if (numberOfPalindromeInArray == 2) {
                break;
            }
        }
        return palindrome;
    }

    /**
     * This method can identify is an integer is palindrome. Return boolean.
     *
     * @param arrayInt is integer
     * @return true or false
     */
    public boolean isIntegerIsPalindrome(int arrayInt) {

        Integer arrayCycle = arrayInt;
        String arrayString = arrayCycle.toString();
        char[] arrayChar = arrayString.toCharArray();

        boolean isPalindrome = true;
        for (int j = 0; j < arrayChar.length; j++) {
            if (arrayChar[j] != arrayChar[arrayChar.length - 1 - j]) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
