package com.courses.apollo.model;

import com.courses.apollo.model.blackbox.BlackBox;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test of BlackBox model.
 */
public class BlackBoxTest {
    BlackBox blackBox = new BlackBox();
    Integer expectedResult = 45;

    @Before
    public void before() {
        blackBox.addElement(5);
        blackBox.addElement(67);
        blackBox.addElement(2);
        blackBox.addElement(45);
    }

    @Test
    public void test() {
        Assert.assertEquals(expectedResult, blackBox.getIndex(3));
    }
}
