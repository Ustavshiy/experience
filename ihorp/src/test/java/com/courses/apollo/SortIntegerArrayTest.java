package com.courses.apollo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ihor Pronko.
 */

public class SortIntegerArrayTest {

    /**
     * Create arrays for tests
     */
    private int[] testArray = {89, 128, -78, 0, 798, -1, -48};
    private int[] arrayUp = {-78, -48, -1, 0, 89, 128, 798};
    private int[] arrayDown = {798, 128, 89, 0, -1, -48, -78};
    SortIntegerArray SortIntegerArray = new SortIntegerArray();

    @Test
    public void sortUpArrayTest() {
        Assert.assertArrayEquals (arrayUp, SortIntegerArray.sortUpArray(testArray));
    }

    @Test
    public void sortDownArrayTest() {
        Assert.assertArrayEquals(arrayDown, SortIntegerArray.sortDownArray(testArray));
    }

}
