package com.courses.apollo.util;

import org.junit.Assert;
import org.junit.Test;

public class IntegerArrayUtilsTest {

    IntegerArrayUtils integerArrayUtils = new IntegerArrayUtils();
    final Integer[] testArray = {23432566, 23144, 456, 4544544, 326, 2345654};
    final Integer[] testNullArray = {};
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
