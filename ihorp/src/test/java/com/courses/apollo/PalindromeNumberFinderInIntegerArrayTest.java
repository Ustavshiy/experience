package com.courses.apollo;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Ihor Pronko
 */
public class PalindromeNumberFinderInIntegerArrayTest {
    int[] arrayOnePalindrome = {-12, 65, 5, 784, 58, 123454320};
    int arrayOnePalindromeAnswer = 5;

    int[] arrayThreePalindromes = {267, -7, 897, 7771777, 5174, 123321, 6776};
    int arrayThreePalindromesAnswer = 123321;

    PalindromeNumberFinderInIntegerArray PalindromeNumberFinderInIntegerArray = new PalindromeNumberFinderInIntegerArray();

    @Test
    public void palindromeNumberTest1() {
        Assert.assertEquals(arrayOnePalindromeAnswer, PalindromeNumberFinderInIntegerArray.findPalindrome(arrayOnePalindrome));
    }

    @Test
    public void palindromeNumberTest2() {
        Assert.assertEquals(arrayThreePalindromesAnswer, PalindromeNumberFinderInIntegerArray.findPalindrome(arrayThreePalindromes));
    }
}
