package com.courses.apollo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Богдан on 05
 */
public class SortEvenNumbersTest{

    @Test
    public void sortEvenTest(){
        final int[] arrayUnSorted = {10, 53,5678, 24, 43, 32};
        final int[] sortedArray = {10,5678, 24, 32,};
        final int[] afterMethodRun =  SortEvenNumbers.sortEven(arrayUnSorted);
        Assert.assertArrayEquals(sortedArray,afterMethodRun);

    }
}


