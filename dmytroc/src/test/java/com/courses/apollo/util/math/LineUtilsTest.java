package com.courses.apollo.util.math;

import com.courses.apollo.util.mathdata.LineUtilsTestData;
import com.courses.apollo.model.math.Line;
import com.courses.apollo.model.math.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LineUtilsTest {
    LineUtils lineUtils = new LineUtils();
    List<Line> testArray = LineUtilsTestData.getLineArray();

    @Test
    public void parallelFinderTest() {
        Line testLine = LineUtilsTestData.getLineA();
        List<Line> parallelFinderTestArray = lineUtils.parallelFinder(testLine, testArray);
        List<Line> expectedResult = LineUtilsTestData.expectedResultParallelFinder();
        Assert.assertEquals(expectedResult, parallelFinderTestArray);
    }

    @Test
    public void yCrossFinderTest() {
        Double[] expectedResultArray = LineUtilsTestData.yCrossFinder();
        for (int i = 0; i < expectedResultArray.length; i++) {
            Double axisYCross = lineUtils.yCrossFinder(testArray.get(i));
            Assert.assertEquals(expectedResultArray[i], axisYCross, 0.001);
        }
    }

    @Test
    public void xCrossFinderTest() {
        Double[] expectedResultArray = LineUtilsTestData.xCrossFinder();
        for (int i = 0; i < expectedResultArray.length; i++) {
            Double axisXCross = lineUtils.xCrossFinder(testArray.get(i));
            Assert.assertEquals(expectedResultArray[i], axisXCross, 0.001);
        }
    }

    @Test
    public void crossPointFinderTest() {
        Point crossPointFinderTest = lineUtils.crossPointFinder(LineUtilsTestData.getLineA(),
                LineUtilsTestData.getLineB());
        Point expectedResult = LineUtilsTestData.expectedCrossPointFinder();
        Assert.assertEquals(expectedResult.toString(), crossPointFinderTest.toString());
    }

    @Test
    public void crossPointFinderTestC() {
        Point crossPointFinderTest = lineUtils.crossPointFinder(LineUtilsTestData.getLineA(),
                LineUtilsTestData.getLineC());
        Point expectedResult = LineUtilsTestData.expectedCrossPointFinderC();
        Assert.assertEquals(expectedResult, crossPointFinderTest);
    }
}
