package com.courses.apollo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Богдан on 05
 */
public class SortEvenNumbersTest {

    @Test
    public void sortEvenTest() {
        final int[] arrayUnSorted = {12, 53, 5678, 24, 43, 32};
        final int[] sortedArray = {12, 5678, 24, 32};
        final int[] afterMethodRun = SortEvenNumbers.sortEven(arrayUnSorted);
        Assert.assertArrayEquals(sortedArray, afterMethodRun);

    }

    @Test
    public void sortOddEvenTest() {
        final int[] arrayUnSorted = {5678};
        final int[] sortedArray = {5678};
        final int[] afterMethodRun = SortEvenNumbers.sortOddEven(arrayUnSorted);
        Assert.assertArrayEquals(sortedArray, afterMethodRun);

    }
}


