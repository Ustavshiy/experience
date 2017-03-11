package com.courses.apollo.util;

import com.courses.apollo.StraightUtilsTestData;
import com.courses.apollo.model.Fraction;
import com.courses.apollo.model.LineModel;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chopenkod on 11.03.17.
 */
public class StraightUtilsTest {
    LineUtils straightUtils = new LineUtils();
    LineModel[] testArray = StraightUtilsTestData.getStraightModelArray();

    @Test
    public void parllelFinderTest() {
        LineModel testStrightModel = StraightUtilsTestData.getStraightModel();
        LineModel[] parallelFinderTestArray = straightUtils.parllelFinder(testStrightModel, testArray);
        LineModel[] expecterResult = StraightUtilsTestData.expextedResltParallelFinder();
        for (int i = 0; i < parallelFinderTestArray.length; i++) {
            Assert.assertEquals(expecterResult[i].toString(), parallelFinderTestArray[i].toString());
        }
    }

    @Test
    public void coordinatsCrossingFinderTest() {
        Fraction[] coordinatsCrossingFinderTestArray = straightUtils.coordinatsCrossingFinder(testArray);
        Fraction[] expectedResult = StraightUtilsTestData.expextedResltcoordinatsCrossingFinderTest();
        for (int i = 0; i < testArray.length; i++) {
            Assert.assertEquals(expectedResult[i].toString(), coordinatsCrossingFinderTestArray[i].toString());
        }
    }
}
