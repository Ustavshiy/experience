package com.courses.apollo;

import org.junit.Assert;
import org.junit.Test;

public class ArrayMinMaxFinderTest {
    private ArrayMinMaxFinder finder = new ArrayMinMaxFinder();

    @Test
    public void testMin() {
        int[] array = {1, 4, -2, 4, 2, 6};
        final int expected = -2;
        Assert.assertTrue(expected == finder.min(array));
    }

    @Test
    public void testMax() {
        int[] array = {1, 4, 2, 4, 2, 6};
        final int expected = 6;
        Assert.assertTrue(expected == finder.max(array));
    }
}
