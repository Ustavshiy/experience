package com.courses.apollo.service.collections;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Class for testing fndResistncByLeastSqrs method.
 */
public class FndResistncByLeastSqrsTest {
    private final static FndResistncByLeastSqrs fndResistncByLeastSqrs = new FndResistncByLeastSqrs();
    private static Queue<Double> amperage;
    private static Queue<Double> voltage;
    private final static Double expectedResistance = 2.9851948051948054;

    @BeforeClass
    public static void addQueues() {
        amperage = new PriorityQueue<Double>() {{
            add(0.1);
            add(0.2);
            add(0.3);
            add(0.4);
            add(0.5);
            add(0.6);
            add(0.7);
            add(0.8);
            add(0.9);
            add(1.0);
        }};

        voltage = new PriorityQueue<Double>() {{
            add(0.27);
            add(0.56);
            add(0.9);
            add(1.18);
            add(1.49);
            add(1.79);
            add(2.05);
            add(2.42);
            add(2.68);
            add(3.01);
        }};
    }

    @Test
    public void findResistanceByLeastSquaresTest() {
        Assert.assertEquals(expectedResistance, fndResistncByLeastSqrs.fndResistncByLeastSqrs(amperage, voltage));
    }
}