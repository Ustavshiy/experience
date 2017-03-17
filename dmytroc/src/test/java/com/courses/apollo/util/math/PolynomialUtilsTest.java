package com.courses.apollo.util.math;

import com.courses.apollo.util.mathdata.PolynomialUtilsTestData;
import org.junit.Assert;
import org.junit.Test;

public class PolynomialUtilsTest {

    PolynomialUtils polynomialUtils = new PolynomialUtils();

    @Test
    public void polynomialsum() {
        double delta = 0.0001;
        double testResult = polynomialUtils.polynomialSum(PolynomialUtilsTestData.getPolynomialArray());
        double expectedResult = PolynomialUtilsTestData.expextedReslt();
        Assert.assertEquals(expectedResult, testResult, delta);
    }
}
