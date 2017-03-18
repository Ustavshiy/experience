package com.courses.apollo;

import com.courses.apollo.service.PalindromeService;
import org.junit.Test;
import org.junit.Assert;

public class PalindromeServiceTest {
    private PalindromeService underTest = new PalindromeService();

    @Test
    public void palindromeNumberTest1() {
        int[] testArray = {-12, 65, 5, 784, 58, 123454320};
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, underTest.findPalindrome(testArray));
    }

    @Test
    public void palindromeNumberTest2() {
        int[] testArray = {267, -7, 897, 7771777, 5174, 123321, 6776};
        int expectedResult = 123321;
        Assert.assertEquals(expectedResult, underTest.findPalindrome(testArray));
    }
}
