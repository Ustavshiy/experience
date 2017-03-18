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
    private final static String GIVEN_BRAND = "Toyota";
    private final static String GIVEN_MODEL = "Freelander";
    private final static int GIVEN_AGE = 4;
    private final static int GIVEN_PRICE = 2000000;
    private final static int GIVEN_YEAR = 2016;

    ArrayList<Car> cars = CarTestData.getCarArrayList();

    @Test
    public void testFindCarsOfGivenBrand() {
        Assert.assertEquals(CarTestData.expectedCarsOfGivenBrand(), carServiceTest.returnCarsOfGivenBrand(cars, GIVEN_BRAND));
    }

    @Test
    public void testFindCarsOfGivenModelOlderThan() {
        Assert.assertEquals(CarTestData.expectedCarsOfGivenModelOlderThan(), carServiceTest.returnCarsOfGivenModelOlderThan(cars, GIVEN_MODEL, GIVEN_AGE));
    }

    @Test
    public void testFindCarsOfGivenYearMoreExpensive() {
        Assert.assertEquals(CarTestData.expectedCarsOfGivenYearMoreExpensiveThan(), carServiceTest.returnCarsOfGivenYearMoreExpensiveThan(cars, GIVEN_PRICE, GIVEN_YEAR));
    }
}