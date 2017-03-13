package com.courses.apollo.service;

import com.courses.apollo.service.FindPrimes;
import org.junit.Assert;
import org.junit.Test;

public class FindPrimesTest {

    private int[] InArrayToFindPrimes = {1, 32, -3, -345, 16, 132, 3, 7, 18, 9, 342, 13, 31, 34, 23};

    private int[] expectedResultFromFindPrimes = {3, 7, 13, 31, 23};

    FindPrimes findPrimes = new FindPrimes();

    @Test
    public void findPrimesInArrayTest() {
        Assert.assertArrayEquals(expectedResultFromFindPrimes, findPrimes.findPrimes(InArrayToFindPrimes));
    }
}