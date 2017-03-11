package com.courses.apollo.util;

import com.courses.apollo.LineUtilsTestData;
import com.courses.apollo.model.Fraction;
import com.courses.apollo.model.Line;
import com.courses.apollo.model.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chopenkod on 11.03.17.
 */
public class LineUtilsTest {
    LineUtils lineUtils = new LineUtils();
    Line[] testArray = LineUtilsTestData.getLineArray();

    @Test
    public void parallelFinderTest() {
        Line testLine = LineUtilsTestData.getLineA();
        Line[] parallelFinderTestArray = lineUtils.parallelFinder(testLine, testArray);
        Line[] expectedResult = LineUtilsTestData.expectedResultParallelFinder();
        for (int i = 0; i < parallelFinderTestArray.length; i++) {
            Assert.assertEquals(expectedResult[i].toString(), parallelFinderTestArray[i].toString());
        }
    }

    @Test
    public void axisCrossFinderTest() {
        Fraction[] axisCrossFinderTestArray = lineUtils.axisCrossFinder(testArray);
        Fraction[] expectedResult = LineUtilsTestData.expectedResultAxisCrossFinderTest();
        for (int i = 0; i < testArray.length; i++) {
            Assert.assertEquals(expectedResult[i].toString(), axisCrossFinderTestArray[i].toString());
        }
    }

    @Test
    public void crossPointFinderTest(){
        Point crossPointFinderTest = lineUtils.crossPointFinder(LineUtilsTestData.getLineA(),
                LineUtilsTestData.getLineB());
        Point expectedResult = LineUtilsTestData.expectedCrossPointFinder();
        Assert.assertEquals(expectedResult.toString(),crossPointFinderTest.toString());
    }
}
