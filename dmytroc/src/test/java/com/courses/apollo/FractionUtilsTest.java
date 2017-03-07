package com.courses.apollo;

import com.courses.apollo.model.Fraction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test fot Fraction.
 */
public class FractionUtilsTest {

    int testArrayLength = 5;
    int[] testNumerator = {12, 345, 1, 34, 25};
    int[] testDenominator = {1, 35, 17, 24, 12};
   FractionUtils testFractionUtils = new FractionUtils();

    Fraction[] expectedresultCreator = {new Fraction(12,1),
            new Fraction(345,35),
            new Fraction(1,17),
            new Fraction(34,24),
            new Fraction(25,12)};
    Fraction[] expectedresultAddOdd = {new Fraction(357,36),
            new Fraction(35,41),
            new Fraction(25,12)};

    /**
     * Fraction[] array creator.
     * @param arrayLength array length.
     * @param numerator input array of numerator values.
     * @param denominator input array of denominator values.
     * @return array of Fraction objects.
     */
    public Fraction[] fractionsArrayCreator(int arrayLength, int[] numerator, int[] denominator) {

        Fraction[] fractionArray = new Fraction[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            fractionArray[i] = new Fraction(numerator[i], denominator[i]);
        }
        return fractionArray;
    }

    @Test
    public void addOddIndexToEvenTest() {
        Fraction[] testArray = fractionsArrayCreator(testArrayLength, testNumerator, testDenominator);
        Fraction[] addedArray = testFractionUtils.addOddIndexToEven(testArray);
        for (int i = 0; i < addedArray.length; i++) {
            Assert.assertEquals(expectedresultAddOdd[i].toString(),addedArray[i].toString());
        }
        for (int i = 0; i < testArray.length; i++) {
            Assert.assertEquals(expectedresultCreator[i].toString(),testArray[i].toString());
        }
    }
}