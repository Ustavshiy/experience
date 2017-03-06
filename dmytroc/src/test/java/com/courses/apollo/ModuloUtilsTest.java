package com.courses.apollo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmytro Chopenko
 */
public class ModuloUtilsTest {

    private int[] arrayWithBothTrue = {140, 3, 35, 14, 35, 87, 70, 57, 105, 106, 10};
    private int[] arrayWithBothFalse = {12, 3, 14, 22, 87, 71, 57, 106, 109};
    private int[] arrayWithOnlyFiveIsTrue = {12, 3, 15, 22, 87, 75, 57, 106, 109};
    private int[] arrayWithOnlySevenIsTrue = {12, 3, 14, 22, 21, 75, 57, 49, 109};

    private int[] expectedResultWithBothTrue = {140, 35, 35, 70, 105};
    private int[] expectedResultWithFalse = {};

    private int moduloOne = 5;
    private int moduloTwo = 7;
    ModuloUtils moduloUtils = new ModuloUtils();

    @Test
    public void printModuloBySevenAndFiveTest() {
        Assert.assertArrayEquals(expectedResultWithBothTrue, moduloUtils.printModuloByTwoNumbers(arrayWithBothTrue, moduloOne, moduloTwo));
        Assert.assertArrayEquals(expectedResultWithFalse, moduloUtils.printModuloByTwoNumbers(arrayWithBothFalse, moduloOne, moduloTwo));
        Assert.assertArrayEquals(expectedResultWithFalse, moduloUtils.printModuloByTwoNumbers(arrayWithOnlyFiveIsTrue, moduloOne, moduloTwo));
        Assert.assertArrayEquals(expectedResultWithFalse, moduloUtils.printModuloByTwoNumbers(arrayWithOnlySevenIsTrue, moduloOne, moduloTwo));
    }
}