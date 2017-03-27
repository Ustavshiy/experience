package com.courses.apollo.service;

import com.courses.apollo.model.Automobile;
import com.courses.apollo.model.Plane;
import com.courses.apollo.model.Tank;
import com.courses.apollo.model.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by User on 16.03.2017.
 */
public class VehicleServiceTest {

    private VehicleService service = new VehicleService();

    @Test
    public void testFindMostExpensiveVehicle() {
        Tank[] tanksArray = new Tank[3];
        tanksArray[0] = new Tank(1000.00, 10, 1000);
        tanksArray[1] = new Tank(900.00, 10, 1000);
        tanksArray[2] = new Tank(10000.00, 10, 1000);
        Vehicle vehicleMax = service.findMostExpensiveVehicle(getTestVehicles());
        Vehicle vehicle = service.findMostExpensiveVehicle(tanksArray);
        Assert.assertEquals(10000.00, vehicleMax.getPrice(), 0.1);
        Assert.assertTrue(10000.00 == vehicle.getPrice());
    }

    private ArrayList<Vehicle> getTestVehicles() {
        ArrayList<Vehicle> tanks = new ArrayList<>();
        tanks.add(new Tank(1000.00, 10, 1000));
        tanks.add(new Automobile("Test", 10000.00, 10, 1000));
        tanks.add(new Plane(8000L, 1000.00, 10, 1000));
        return tanks;
    }

    @Test
    public void substitutionPrinciple() {
        Tank tank = new Tank(100.00, 100, 100);
        System.out.println(tank.getPrice());
        System.out.println(tank.getCanon());

        Vehicle vehicle = new Tank(100.00, 100, 100);
        System.out.println(vehicle.getPrice());

        vehicle = new Automobile("Test",100.00,300, 1000 );
        System.out.println(vehicle.getPrice());
    }
}
