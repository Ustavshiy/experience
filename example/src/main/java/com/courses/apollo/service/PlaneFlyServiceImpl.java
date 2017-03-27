package com.courses.apollo.service;

import com.courses.apollo.model.Plane;

import java.io.Serializable;
import java.util.List;

/**
 * Created by User on 23.03.2017.
 */
public class PlaneFlyServiceImpl implements IFly, Serializable, Cloneable {

    public List<Plane> planes;

    public PlaneFlyServiceImpl(List<Plane> planes) {
        this.planes = planes;
    }

    @Override
    public void fly() {
        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i).getWeight() > 10000) {
                System.out.println("Probably you cannot fly!");
            } else if(planes.get(i).getWeight() < 1000) {
                new SmallPlane().fly();
            }
        }
    }

    private class SmallPlane implements IFly {

        @Override
        public void fly() {
            for (int i = 0; i < planes.size(); i++) {

            }
        }
    }

}
