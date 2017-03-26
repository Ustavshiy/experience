package com.courses.apollo.servise;

import com.courses.apollo.service.FindFirstNumberVariousDigits;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by krama on 03.03.2017.
 */
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

