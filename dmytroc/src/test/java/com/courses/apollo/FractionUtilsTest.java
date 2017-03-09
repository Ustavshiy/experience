package com.courses.apollo;

import com.courses.apollo.model.Fraction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test fot FractionUtils.
 */
public class FractionUtilsTest {

    Fraction[] testArray = {new Fraction(12,1),
            new Fraction(345,35),
            new Fraction(1,17),
            new Fraction(34,24),
            new Fraction(25,12)};
    Fraction[] expectedresultAddOdd = {new Fraction(357,36),
            new Fraction(35,41),
            new Fraction(25,12)};
    FractionUtils fractionUtils = new FractionUtils();

    @Test
    public void addOddIndexToEvenTest() {
        Fraction[] addedArray = fractionUtils.addOddIndexToEven(testArray);
        for (int i = 0; i < addedArray.length; i++) {
            Assert.assertEquals(expectedresultAddOdd[i].toString(),addedArray[i].toString());
        }

    }
}