package com.courses.apollo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chopenkod on 28.02.17.
 */
public class ModuloUtilsTest {

    @Test
    public void printModuloBySevenAndFiveWithBothTrueTest() {
        final int[] TestArray = {140, 3, 35, 14, 35, 87, 70, 57, 105, 106, 10};
        final int moduloOne = 5;
        final int moduloTwo = 7;
        int[] receivedResult = ModuloUtils.printModuloByTwoNumbers(TestArray, moduloOne, moduloTwo);
        final int[] expectedResult = {140, 35, 35, 70, 105};
        Assert.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void printModuloBySevenAndFiveWithBothFalseTest() {
        final int[] TestArray = {12, 3, 14, 22, 87, 71, 57, 106, 109};
        final int moduloOne = 5;
        final int moduloTwo = 7;
        int[] receivedResult = ModuloUtils.printModuloByTwoNumbers(TestArray, moduloOne, moduloTwo);
        final int[] expectedResult = {};
        Assert.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void printModuloBySevenAndFiveWithOnlyFiveIsTrueTest() {
        final int[] TestArray = {12, 3, 15, 22, 87, 75, 57, 106, 109};
        final int moduloOne = 5;
        final int moduloTwo = 7;
        int[] receivedResult = ModuloUtils.printModuloByTwoNumbers(TestArray, moduloOne, moduloTwo);
        final int[] expectedResult = {};
        Assert.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void printModuloBySevenAndFiveWithOnlySevenIsTrueTest() {
        final int[] TestArray = {12, 3, 14, 22, 21, 75, 57, 49, 109};
        final int moduloOne = 5;
        final int moduloTwo = 7;
        int[] receivedResult = ModuloUtils.printModuloByTwoNumbers(TestArray, moduloOne, moduloTwo);
        final int[] expectedResult = {};
        Assert.assertArrayEquals(expectedResult, receivedResult);
    }
}
