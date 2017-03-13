package com.courses.apollo.util;

import com.courses.apollo.FractionUtilsTestData;
import com.courses.apollo.model.Fraction;
import com.courses.apollo.util.FractionUtils;
import org.junit.Assert;
import org.junit.Test;

public class FractionUtilsTest {
    private FractionUtils fractionUtils = new FractionUtils();

    @Test
    public void addOddIndexToEvenTest() {
        Fraction[] testArray = FractionUtilsTestData.getFractionsArray();
        Fraction[] expectedResult = FractionUtilsTestData.expectedResult();
        Fraction[] addedArray = fractionUtils.addOddIndexToEven(testArray);
        for (int i = 0; i < addedArray.length; i++) {
            Assert.assertEquals(expectedResult[i].toString(),
                    addedArray[i].toString());
        }

    }
}