package com.courses.apollo;

import com.courses.apollo.model.Plane;

import java.util.ArrayList;

/**
 * Created by User on 13.03.2017.
 */
public class TankAutomobilePlaneTestData {
    // Find biggest weight
    // Find fastest
    // Find most expensive
    public ArrayList<Plane> getPlanes() {
        Plane plane = new Plane(10000L, 1000000D, 850, 160);
        ArrayList<Plane> planes = new ArrayList<>();
        planes.add(plane);
        return planes;
    }

}
