package com.courses.apollo;

import com.courses.apollo.model.Fraction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test fot FractionUtils
 */
public class FractionUtilsTest {

    int testArrayLength = 5;
    int[] testNumerator = {12, 345, 1, 34, 25};
    int[] testDenominator = {1, 35, 17, 24, 12};
    FractionUtils testFractionArray = new FractionUtils();
    Fraction[] expectedresultCreator = {new Fraction(0,12,1),
            new Fraction(1,345,35),
            new Fraction(2,1,17),
            new Fraction(3,34,24),
            new Fraction(4,25,12)};
    Fraction[] expectedresultAddOdd = {new Fraction(0,357,36),
            new Fraction(1,35,41),
            new Fraction(2,25,12)};
    @Test
    public void addOddIndexToEvenTest() {
        Fraction[] testArray = testFractionArray.fractionsArrayCreator(testArrayLength, testNumerator, testDenominator);
        Fraction[] addedArray = testFractionArray.addOddIndexToEven(testArray);
        for (int i = 0; i < addedArray.length; i++) {
            Assert.assertEquals(expectedresultAddOdd[i].toString(),addedArray[i].toString());
        }
        for (int i = 0; i < testArray.length; i++) {
            Assert.assertEquals(expectedresultCreator[i].toString(),testArray[i].toString());
        }
    }
}