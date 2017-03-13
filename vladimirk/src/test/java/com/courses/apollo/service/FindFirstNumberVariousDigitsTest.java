package com.courses.apollo.service;

import com.courses.apollo.service.FindFirstNumberVariousDigits;
import org.junit.Assert;
import org.junit.Test;

public class FindFirstNumberVariousDigitsTest {
    FindFirstNumberVariousDigits findFirstNumberVariousDigits = new FindFirstNumberVariousDigits();
    final String[] InArray = {"sdf", "32dssd", "3333", "124", "16"};
    final int expectedResultFromFindPFirstNumberVariousDigits = 124;

    @Test
    public void findFirstNumberVariousDigitsTest() {
        int Result = findFirstNumberVariousDigits.findFirstNumberVariousDigits(InArray);
        Assert.assertEquals(expectedResultFromFindPFirstNumberVariousDigits, Result);
    }
}

