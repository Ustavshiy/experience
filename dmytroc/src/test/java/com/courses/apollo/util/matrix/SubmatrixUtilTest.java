package com.courses.apollo.util.matrix;

import com.courses.apollo.model.matrix.Matrix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * SubmatrixUtil Test.
 */
public class SubmatrixUtilTest {
    SubmatrixUtil submatrixUtil = new SubmatrixUtil();
    int[][] testMatrix = new int[][]{
            {1, 9, 9, 8, 1, 2, 2},
            {5, 5, 9, 1, 7, 1, 1},
            {5, 5, 3, 0, 3, 3, 1},
            {1, 1, 3, 3, 3, 3, 2},
            {1, 5, 3, 3, 3, 2, 1},
            {1, 1, 1, 3, 1, 1, 1},
    };
    Matrix expectedMatrix = new Matrix(2, 3, 3);

    @Before
    public void before() {
        expectedMatrix.setArea(6);
        expectedMatrix.setRightBorder(4);
        expectedMatrix.setBottomBorder(4);
    }

    @Test
    public void test() {
        Matrix resultMatrix = submatrixUtil.findBiggestSubmatrix(testMatrix);
        Assert.assertEquals(expectedMatrix, resultMatrix);
    }
}
