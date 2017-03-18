package com.courses.apollo.service;

import com.courses.apollo.model.Vehicle;

import java.util.ArrayList;

/**
 * Created by User on 16.03.2017.
 */
public class VehicleService {

    /**
     * Find max Vehicle.
     *
     * @param vehicles array list
     * @return max vehicle
     */
    public Vehicle findMostExpensiveVehicle(ArrayList<Vehicle> vehicles) {
        Vehicle max = vehicles.get(0);
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPrice() > max.getPrice()) {
                max = vehicles.get(i);
            }
        }
        return max;
    }

    /**
     * Find max vehicle in array.
     *
     * @param vehicles array
     * @return max vehicle
     */
    public Vehicle findMostExpensiveVehicle(Vehicle[] vehicles) {
        Vehicle max = vehicles[0];
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getPrice() > max.getPrice()) {
                max = vehicles[i];
            }
        }
        return max;
    }
}
