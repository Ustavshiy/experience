package com.courses.apollo.model.figure;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void before() {
        triangle = new Triangle(10.00, 10.00, 10.00);
    }

    @Test
    public void testTriangleGetPerimeter() {
        Assert.assertEquals(triangle.getPerimeter(), 30.0, 0.01);
    }
}
