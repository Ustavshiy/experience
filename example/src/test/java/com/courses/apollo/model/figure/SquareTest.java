package com.courses.apollo.model.figure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 20.03.2017.
 */
public class SquareTest {

    private AngleShape square;

    @Before
    public void before() {
        square = new Square();
        square.setSideA(10);
    }

    @Test
    public void testGetAreaForSquare() {
        Assert.assertTrue(square.getPerimeter() == 40);
    }
}
