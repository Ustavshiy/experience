package com.courses.apollo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ihor Pronko.
 */

public class SortTest {

    /**
     * Create arrays for tests
     */
    private int[] testArray = {89, 128, -78, 0, 798, -1, -48};
    private int[] arrayUp = {-78, -48, -1, 0, 89, 128, 798};
    private int[] arrayDown = {798, 128, 89, 0, -1, -48, -78};
    Sort Sort = new Sort();

    @Test
    public void sortUpArrayTest() {
        Assert.assertArrayEquals (arrayUp, Sort.sortUpArray(testArray));
    }

    @Test
    public void sortDownArrayTest() {
        Assert.assertArrayEquals(arrayDown, Sort.sortDownArray(testArray));
    }

}
