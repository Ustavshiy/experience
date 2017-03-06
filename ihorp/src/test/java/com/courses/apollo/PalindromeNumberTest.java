package com.courses.apollo;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Ihor Pronko
 */
public class PalindromeNumberTest {
    int[] arrayOnePalindrome = {-12, 65, 0, 784, 58, 123454320};
    int arrayOnePalindromeAnswer = 0;

    int[] arrayThreePalindromes = {267, -7, 897, 7771777, 5174, 123321};
    int arrayThreePalindromesAnswer = 123321;

    PalindromeNumber PalindromeNumber = new PalindromeNumber();

    @Test
    public void palindromeNumberTest1() {
        Assert.assertEquals(arrayOnePalindromeAnswer, PalindromeNumber.palindromeNumberFinder(arrayOnePalindrome));
    }

    @Test
    public void palindromeNumberTest2() {
        Assert.assertEquals(arrayThreePalindromesAnswer, PalindromeNumber.palindromeNumberFinder(arrayThreePalindromes));
    }
}
