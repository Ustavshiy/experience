package com.courses.apollo;

/**
 * Created by Ihor Pronko.
 */

public final class PalindromeNumber {

    /**
    *Method find a palindrome number in array and return second palindrome,
    *if in array have more then one palindrome number, method return second palindrome number.
    * @param array array
    * @return palindrome
    */
    public int palindromeNumberFinder(int[] array) {

        // Variable for palindrome
        int palindrome = 0;

        // Palindromes counter
        int numberOfPalindromeInArray = 0;

        // The cycle for each digit of the array
        for (int cycle = 0; cycle < array.length; cycle++) {

            // convert integer into an array of characters
            Integer arrayCycle = array[cycle];
            String arrayString = arrayCycle.toString();
            char[] arrayChar = arrayString.toCharArray();

            // Variable for determining the palindrome
            boolean palindromeOrNot = true;

            // cycle that changes the value 'palindromeOrNot' if it is a palindrome
            for (int cycleTwo = 0; cycleTwo < arrayChar.length; cycleTwo++) {
                if (arrayChar[cycleTwo] != arrayChar[arrayChar.length - 1 - cycleTwo]) {
                    palindromeOrNot = false;
                }
            }

            // if the cycle does not change the value of that number - a palindrome
            if (palindromeOrNot) {
                palindrome = arrayCycle;
                numberOfPalindromeInArray += 1;
            }

            // Check what the account number of a palindrome. If the second - completing the cycle
            if (numberOfPalindromeInArray == 2) {
                break;
            }
        }
        return palindrome;
    }

}
