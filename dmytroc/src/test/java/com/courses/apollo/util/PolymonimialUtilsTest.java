package com.courses.apollo.util;

import com.courses.apollo.PolynomialUtilsTestData;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chopenkod on 10.03.17.
 */
public class PolymonimialUtilsTest {

    PolynomialUtils polynomialUtils = new PolynomialUtils();

    @Test
    public void polynomialsum() {
        double delta = 0.0001;
        double testResult = polynomialUtils.polynomialSum(PolynomialUtilsTestData.getPolynomialArray());
        double expectedResult = PolynomialUtilsTestData.expextedReslt();
        Assert.assertEquals(expectedResult, testResult, delta);
    }
}
