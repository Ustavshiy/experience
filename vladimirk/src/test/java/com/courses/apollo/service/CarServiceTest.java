package com.courses.apollo.service;

import com.courses.apollo.model.Car;
import com.courses.apollo.model.CarTestData;
import org.junit.Assert;
import org.junit.Test;

public class CarServiceTest {

   private CarService carServiceTest = new CarService();
   private final static String GIVEN_CARS_BRAND = "Toyota";
   private final static String GIVEN_CARS_MODEL = "Freelander";
   private final static int GIVEN_CARS_AGE = 4;
   private final static int GIVEN_CARS_PRICE = 2000000;
   private final static int GIVEN_CARS_YEAR = 2016;

   Car[] allCarsArray = CarTestData.getCars();

   @Test
    public void testPrintCarsOfGivenBrand() {
       Car[] expectedCarsOfGivenBrand = CarTestData.expectedCarsOfGivenBrand();
       Car[] resultCarsOfGivenBrand = carServiceTest.returnCarsOfGivenBrand(allCarsArray, GIVEN_CARS_BRAND);
       Assert.assertArrayEquals(expectedCarsOfGivenBrand, resultCarsOfGivenBrand);
       for (int i = 0; i < resultCarsOfGivenBrand.length; i++) {
           System.out.println(resultCarsOfGivenBrand[i]);
       }
   }

   @Test
    public void testPrintCarsOfGivenModelOlderThan() {
       Car[] expectedCarsOfGivenModelOlderThan = CarTestData.expectedCarsOfGivenModelOlderThan();
       Car[] resultCarsOfGivenModelOlderThan =
               carServiceTest.returnCarsOfGivenModelOlderThan(allCarsArray, GIVEN_CARS_MODEL, GIVEN_CARS_AGE);
       Assert.assertArrayEquals(expectedCarsOfGivenModelOlderThan, resultCarsOfGivenModelOlderThan);
       for (int i = 0; i < resultCarsOfGivenModelOlderThan.length; i++) {
           System.out.println(resultCarsOfGivenModelOlderThan[i]);
       }
   }

    @Test
    public void testPrintCarsOfGivenYearMoreExpensiveThan() {
        Car[] expectedCarsOfGivenYearMoreExpensiveThan = CarTestData.expectedCarsOfGivenYearMoreExpensiveThan();
        Car[] resultCarsOfGivenYearMoreExpensiveThan =
                carServiceTest.returnCarsOfGivenYearMoreExpensiveThan(allCarsArray, GIVEN_CARS_PRICE, GIVEN_CARS_YEAR);
        Assert.assertArrayEquals(expectedCarsOfGivenYearMoreExpensiveThan, resultCarsOfGivenYearMoreExpensiveThan);
        for (int i = 0; i < resultCarsOfGivenYearMoreExpensiveThan.length; i++) {
            System.out.println(resultCarsOfGivenYearMoreExpensiveThan[i]);
        }
    }
}