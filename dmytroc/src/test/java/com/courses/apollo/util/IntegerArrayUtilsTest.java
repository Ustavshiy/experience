package com.courses.apollo.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chopenkod on 03.03.17.
 */
public class IntegerArrayUtilsTest {

    IntegerArrayUtils integerArrayUtils = new IntegerArrayUtils();
    final int[] testArray = {23432566, 23144, 456, 4544544, 326, 2345654};
    final int[] testNullArray = {};
    final int expectedResult = 4544544;
    final int expectedResultNull = 0;

    @Test
    public void minDifferentDIgitsFinderTest() {
        int receivedResult = integerArrayUtils.minDifferentDigitsFinder(testArray);
        int receivedResultNull = integerArrayUtils.minDifferentDigitsFinder(testNullArray);
        Assert.assertEquals(expectedResult, receivedResult);
        Assert.assertEquals(expectedResultNull, receivedResultNull);
    }
}
