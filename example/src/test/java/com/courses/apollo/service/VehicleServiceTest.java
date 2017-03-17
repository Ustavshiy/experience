package com.courses.apollo.service;

import com.courses.apollo.model.Tank;
import com.courses.apollo.model.Vehicle;

import java.util.ArrayList;

/**
 * Created by User on 16.03.2017.
 */
public class VehicleServiceTest {

    private VehicleService service = new VehicleService();

    public void testFindMostExpensiveVehicle() {
        ArrayList<Vehicle> tanks = new ArrayList<>();
        Tank[] tanksArray = new Tank[10];
        service.findMostExpensiveVehicle(tanks);
        service.findMostExpensiveVehicle(tanksArray);
    }
}
