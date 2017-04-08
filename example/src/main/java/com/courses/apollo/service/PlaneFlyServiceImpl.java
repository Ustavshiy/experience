package com.courses.apollo.service;

import com.courses.apollo.model.Plane;

import java.io.Serializable;
import java.util.List;

/**
 * Created by User on 23.03.2017.
 */
public class PlaneFlyServiceImpl implements IFly, Serializable, Cloneable {
    /**
     * Maximum weight of plane.
     */
    private final int weightMax = 10000;
    /**
     * max weight of small plane.
     */
    private final int lowWeight = 1000;
    /**
     * list of planes.
     */
    private List<Plane> planes;

    public PlaneFlyServiceImpl(List<Plane> planes) {
        this.planes = planes;
    }

    @Override
    public void fly() {
        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i).getWeight() > weightMax) {
                new RocketFlyImpl().fly();
            } else if (planes.get(i).getWeight() < lowWeight) {
                new SmallPlane().fly();
            }
        }
    }

    /**
     * Inner class.
     */
    private class SmallPlane implements IFly {

        @Override
        public void fly() {
            for (int i = 0; i < planes.size(); i++) {

            }
        }
    }
}