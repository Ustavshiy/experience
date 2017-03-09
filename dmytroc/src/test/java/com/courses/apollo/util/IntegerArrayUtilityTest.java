package com.courses.apollo.util;

import com.courses.apollo.util.IntegerArrayUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chopenkod on 03.03.17.
 */
public class IntegerArrayUtilityTest {

    IntegerArrayUtility integerArrayUtility = new IntegerArrayUtility();
    final int[] testArray = {23432566, 23144, 456, 4544544, 326, 2345654};
    final int[] testNullArray = {};
    final int expectedResult = 4544544;
    final int expectedResultNull = 0;

    @Test
    public void minDifferentDIgitsFinderTest() {
        int receivedResult = integerArrayUtility.minDifferentDigitsFinder(testArray);
        int receivedResultNull = integerArrayUtility.minDifferentDigitsFinder(testNullArray);
        Assert.assertEquals(expectedResult, receivedResult);
        Assert.assertEquals(expectedResultNull, receivedResultNull);
    }
}
