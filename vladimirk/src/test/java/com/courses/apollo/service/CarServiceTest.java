package com.courses.apollo.service;

import com.courses.apollo.model.Car;
import com.courses.apollo.model.CarTestData;
import com.courses.apollo.service.CarService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        List<Car> expectedCarsOfGivenBrand = CarTestData.expectedCarsOfGivenBrand();
        List<Car> resultCarsOfGivenBrand = carServiceTest.returnCarsOfGivenBrand(cars, GIVEN_CARS_BRAND);
        Car[] expected = expectedCarsOfGivenBrand.toArray(new Car[expectedCarsOfGivenBrand.size()]);
        Car[] result = resultCarsOfGivenBrand.toArray(new Car[resultCarsOfGivenBrand.size()]);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testPrintCarsOfGivenModelOlderThan() {
        List<Car> expectedCarsOfGivenModelOlderThan = CarTestData.expectedCarsOfGivenModelOlderThan();
        List<Car> resultCarsOfGivenModelOlderThan =
                carServiceTest.returnCarsOfGivenModelOlderThan(cars, GIVEN_CARS_MODEL, GIVEN_CARS_AGE);
        Car[] expected = expectedCarsOfGivenModelOlderThan.toArray(new Car[expectedCarsOfGivenModelOlderThan.size()]);
        Car[] result = resultCarsOfGivenModelOlderThan.toArray(new Car[resultCarsOfGivenModelOlderThan.size()]);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testPrintCarsOfGivenYearMoreExpensive() {
        List<Car> expectedCarsOfGivenYearMoreExpens = CarTestData.expectedCarsOfGivenYearMoreExpensiveThan();
        List<Car> resultCarsOfGivenYearMoreExpensive = carServiceTest.returnCarsOfGivenYearMoreExpensiveThan(cars,
                GIVEN_CARS_PRICE, GIVEN_CARS_YEAR);
        Car[] expected = expectedCarsOfGivenYearMoreExpens.toArray(new Car[expectedCarsOfGivenYearMoreExpens.size()]);
        Car[] result = resultCarsOfGivenYearMoreExpensive.toArray(new Car[resultCarsOfGivenYearMoreExpensive.size()]);
        Assert.assertArrayEquals(expected, result);
    }
}