package com.courses.apollo.service;

import com.courses.apollo.model.Plane;
import org.junit.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import static java.util.Arrays.asList;

/**
 * Created by User on 23.03.2017.
 */
public class IFlyTest {

    public IFly iFly;

    @Test
    public void testPlaneFly() {
        List<Plane> planes = new ArrayList<>();
        Plane plane = new Plane(10000L,100.00, 100, 100000);
        planes.add(plane);

        List<Plane> planeStack = new LinkedList<>(planes);
        iFly = new PlaneFlyServiceImpl(planeStack);
        iFly.fly();
        iFly.flyDefault();
    }

    @Test
    public void testRocketFly() {
        IFly verticalFly = new RocketFlyImpl();
        verticalFly.fly();
        verticalFly.flyDefault();
    }

}
