package com.courses.apollo.service;

import com.courses.apollo.model.Car;
import com.courses.apollo.model.CarTestData;
import com.courses.apollo.service.CarService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CarServiceTest {

    private CarService carServiceTest = new CarService();
    private final static String GIVEN_CARS_BRAND = "Toyota";
    private final static String GIVEN_CARS_MODEL = "Freelander";
    private final static int GIVEN_CARS_AGE = 4;
    private final static int GIVEN_CARS_PRICE = 2000000;
    private final static int GIVEN_CARS_YEAR = 2016;

    ArrayList<Car> cars = CarTestData.getCarArrayList();

    @Test
    public void testPrintCarsOfGivenBrand() {
        ArrayList<Car> expectedCarsOfGivenBrand = CarTestData.expectedCarsOfGivenBrand();
        ArrayList<Car> resultCarsOfGivenBrand = carServiceTest.returnCarsOfGivenBrand(cars, GIVEN_CARS_BRAND);
        Car[] expected = expectedCarsOfGivenBrand.toArray(new Car[expectedCarsOfGivenBrand.size()]);
        Car[] result = resultCarsOfGivenBrand.toArray(new Car[resultCarsOfGivenBrand.size()]);
        Assert.assertArrayEquals(expected, result);
        for (int n = 0; n < resultCarsOfGivenBrand.size(); n++) {
            System.out.println(resultCarsOfGivenBrand.get(n));
        }
    }

    @Test
    public void testPrintCarsOfGivenModelOlderThan() {
        ArrayList<Car> expectedCarsOfGivenModelOlderThan = CarTestData.expectedCarsOfGivenModelOlderThan();
        ArrayList<Car> resultCarsOfGivenModelOlderThan =
                carServiceTest.returnCarsOfGivenModelOlderThan(cars, GIVEN_CARS_MODEL, GIVEN_CARS_AGE);
        Car[] expected = expectedCarsOfGivenModelOlderThan.toArray(new Car[expectedCarsOfGivenModelOlderThan.size()]);
        Car[] result = resultCarsOfGivenModelOlderThan.toArray(new Car[resultCarsOfGivenModelOlderThan.size()]);
        Assert.assertArrayEquals(expected, result);
        for (int k = 0; k < resultCarsOfGivenModelOlderThan.size(); k++) {
            System.out.println(resultCarsOfGivenModelOlderThan.get(k));
        }
    }

    @Test
    public void testPrintCarsOfGivenYearMoreExpensive() {
        ArrayList<Car> expectedCarsOfGivenYearMoreExpens = CarTestData.expectedCarsOfGivenYearMoreExpensiveThan();
        ArrayList<Car> resultCarsOfGivenYearMoreExpensive = carServiceTest.returnCarsOfGivenYearMoreExpensiveThan(cars,
                GIVEN_CARS_PRICE, GIVEN_CARS_YEAR);
        Car[] expected = expectedCarsOfGivenYearMoreExpens.toArray(new Car[expectedCarsOfGivenYearMoreExpens.size()]);
        Car[] result = resultCarsOfGivenYearMoreExpensive.toArray(new Car[resultCarsOfGivenYearMoreExpensive.size()]);
        Assert.assertArrayEquals(expected, result);
        for (int i = 0; i < resultCarsOfGivenYearMoreExpensive.size(); i++) {
            System.out.println(resultCarsOfGivenYearMoreExpensive.get(i));
        }
    }
}