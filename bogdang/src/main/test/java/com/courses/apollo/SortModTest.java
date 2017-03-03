package com.courses.apollo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Богдан on 03.03.2017.
 */
public class SortModTest {

    @Test
    public void sortTest(){
        final int[] arrayUnSorted = {1, 3, 56, -11, 0, 7, -8, 4};
        final int[] sortedArray = {56, -11, -8, 7, 4, 3, 1, 0};
        final int[] afterMethodRun = SortMod.sort(arrayUnSorted);
        Assert.assertArrayEquals(sortedArray,afterMethodRun);





    }
}
