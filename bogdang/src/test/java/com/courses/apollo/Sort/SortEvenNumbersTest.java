package com.courses.apollo.Sort;

import com.courses.apollo.Sort.SortEvenNumbers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Verify the correctness of class SortEvenNumbers, methods sortEven, sortOddEven.
 */
public class SortEvenNumbersTest {

    @Test
    public void sortEvenTest() {
        final int[] arrayUnSorted = {12, 53, 5678, 24, 43, 32, 10};
        final int[] sortedArray = {12, 5678, 24, 32, 10};
        final int[] afterMethodRun = new SortEvenNumbers().sortEven(arrayUnSorted);
        Assert.assertArrayEquals(sortedArray, afterMethodRun);

    }

    @Test
    public void sortOddEvenTest() {
        final int[] arrayUnSorted = {12, 5678, 24, 32, 10};
        final int[] sortedArray = {12, 5678, 32, 10};
        final int[] afterMethodRun = new  SortEvenNumbers().sortOddEven(arrayUnSorted);
        Assert.assertArrayEquals(sortedArray, afterMethodRun);

    }
}


