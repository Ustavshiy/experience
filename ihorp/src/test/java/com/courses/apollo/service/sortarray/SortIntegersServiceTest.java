package com.courses.apollo.service.sortarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ihor Pronko.
 */

public class SortIntegersServiceTest {

    /**
     * Create arrays for tests
     */
    private int[] testArray = {128, -1, -48, 798, 89, 0, -78};
    private int[] arrayUp = {-78, -48, -1, 0, 89, 128, 798};
    private int[] arrayDown = {798, 128, 89, 0, -1, -48, -78};
    SortIntegersService SortIntegersService = new SortIntegersService();

    @Test
    public void sortUpArrayTest() {
        Assert.assertArrayEquals (arrayUp, SortIntegersService.sortAscending(testArray));
    }

    @Test
    public void sortDownArrayTest() {
        Assert.assertArrayEquals(arrayDown, SortIntegersService.sortDescending(testArray));
    }

}
