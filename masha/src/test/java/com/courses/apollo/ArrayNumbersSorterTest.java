package com.courses.apollo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayNumbersSorterTest {
    private ArrayNumbersSorter sorter = new ArrayNumbersSorter();


    @Test
    public void testNumbersLength() {
        int number = 12345;
        final int expected = 5;
        assertEquals(expected, sorter.numbersLength(number));
    }



    @Test
        public void testDigitSort() {
            int[] array = {1234, 4, -25, 5, 2, 1828};
            final int[] expectedArray = {4,5,2,-25,1234,1828};

        final int[] afterMethodRun = new ArrayNumbersSorter().digitSort(array);
        Assert.assertArrayEquals(expectedArray,afterMethodRun);


        }


    }


