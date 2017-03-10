package com.courses.apollo.old;

import com.courses.apollo.old.SortMod;
import org.junit.Assert;
import org.junit.Test;

/**
 * Verify the correctness of class SortMod, method sort.
 */
public class SortModTest {

    @Test
    public void sortTest(){
        final int[] arrayUnSorted = {1, 3, 56, -11, 0, 7, -8, 4};
        final int[] sortedArray = {56, -11, -8, 7, 4, 3, 1, 0};
        final int[] afterMethodRun = new SortMod().sort(arrayUnSorted);
        Assert.assertArrayEquals(sortedArray,afterMethodRun);

    }
}
