package com.courses.apollo.util.math;

import com.courses.apollo.util.mathdata.FractionUtilsTestData;
import com.courses.apollo.model.math.RationalFraction;
import org.junit.Assert;
import org.junit.Test;

public class RationalFractionUtilsTest {
    private RationalFractionUtils fractionUtils = new RationalFractionUtils();

    @Test
    public void addOddIndexToEvenTest() {
        RationalFraction[] testArray = FractionUtilsTestData.getFractionsArray();
        RationalFraction[] expectedResult = FractionUtilsTestData.expectedResult();
        RationalFraction[] addedArray = fractionUtils.addOddIndexToEven(testArray);
        for (int i = 0; i < addedArray.length; i++) {
            Assert.assertEquals(expectedResult[i],
                    addedArray[i]);
        }
    }

    @Test
    public void rationalFractionCalculationTest() {
        RationalFraction[] testArray = FractionUtilsTestData.getFractionCalculationTestArray();
        Double[] expectedResult = FractionUtilsTestData.getFractionCalculationResultArray();
        for (int i = 0; i < testArray.length; i++) {
            Assert.assertEquals(expectedResult[i], fractionUtils.rationalFractionCalculation(testArray[i]), 0.1);
        }
    }
}