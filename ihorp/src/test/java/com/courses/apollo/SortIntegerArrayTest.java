package com.courses.apollo;

import com.courses.apollo.service.SortIntegerArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ihor Pronko.
 */

public class SortIntegerArrayTest {

    /**
     * Create arrays for tests
     */
    private int[] testArray = {128, -1, -48, 798, 89, 0, -78};
    private int[] arrayUp = {-78, -48, -1, 0, 89, 128, 798};
    private int[] arrayDown = {798, 128, 89, 0, -1, -48, -78};
    com.courses.apollo.service.SortIntegerArray SortIntegerArray = new SortIntegerArray();

    @Test
    public void sortUpArrayTest() {
        Assert.assertArrayEquals (arrayUp, SortIntegerArray.sortAscending(testArray));
    }

    @Test
    public void sortDownArrayTest() {
        Assert.assertArrayEquals(arrayDown, SortIntegerArray.sortDescending(testArray));
    }

}
