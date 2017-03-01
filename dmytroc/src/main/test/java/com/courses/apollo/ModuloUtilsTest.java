package com.courses.apollo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chopenkod on 28.02.17.
 */
public class ModuloUtilsTest {

    private int[] ArrayWithBothTrue = {140, 3, 35, 14, 35, 87, 70, 57, 105, 106, 10};
    private int[] ArrayWithBothFalse = {12, 3, 14, 22, 87, 71, 57, 106, 109};
    private int[] ArrayWithOnlyFiveIsTrue = {12, 3, 15, 22, 87, 75, 57, 106, 109};
    private int[] ArrayWithOnlySevenIsTrue = {12, 3, 14, 22, 21, 75, 57, 49, 109};

    private int[] expectedResultWithBothTrue = {140, 35, 35, 70, 105};
    private int[] expectedResultWithFalse = {};

    private int moduloOne = 5;
    private int moduloTwo = 7;

    @Test
    public void printModuloBySevenAndFiveTest() {
        Assert.assertArrayEquals(expectedResultWithBothTrue, ModuloUtils.printModuloByTwoNumbers(ArrayWithBothTrue, moduloOne, moduloTwo));
        Assert.assertArrayEquals(expectedResultWithFalse, ModuloUtils.printModuloByTwoNumbers(ArrayWithBothFalse, moduloOne, moduloTwo));
        Assert.assertArrayEquals(expectedResultWithFalse, ModuloUtils.printModuloByTwoNumbers(ArrayWithOnlyFiveIsTrue, moduloOne, moduloTwo));
        Assert.assertArrayEquals(expectedResultWithFalse, ModuloUtils.printModuloByTwoNumbers(ArrayWithOnlySevenIsTrue, moduloOne, moduloTwo));
    }
}