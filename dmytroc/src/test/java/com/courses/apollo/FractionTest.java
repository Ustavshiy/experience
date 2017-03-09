package com.courses.apollo;

import com.courses.apollo.model.Fraction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test creates and initiates array, Checking result.
 */
public class FractionTest {


    int testArrayLength = 5;
    int[] testNumerator = {12, 345, 1, 34, 25};
    int[] testDenominator = {1, 35, 17, 24, 12};

    Fraction[] expectedresultCreator = {new Fraction(12,1),
            new Fraction(345,35),
            new Fraction(1,17),
            new Fraction(34,24),
            new Fraction(25,12)};

    /**
     * Fraction[] array creator.
     * @param arrayLength array length.
     * @param numerator input array of numerator values.
     * @param denominator input array of denominator values.
     * @return array of Fraction objects.
     */
    public static Fraction[] fractionsArrayCreator(int arrayLength, int[] numerator, int[] denominator) {

        Fraction[] fractionArray = new Fraction[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            fractionArray[i] = new Fraction(numerator[i], denominator[i]);
        }
        return fractionArray;
    }

    Fraction[] testArray = fractionsArrayCreator(testArrayLength, testNumerator, testDenominator);
    @Test
    public void FractionCreatorTest(){
        for (int i = 0; i < testArray.length; i++) {
            Assert.assertEquals(expectedresultCreator[i].toString(),testArray[i].toString());
        }
    }

}
