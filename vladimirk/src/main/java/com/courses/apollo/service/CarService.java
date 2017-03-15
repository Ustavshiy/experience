package com.courses.apollo.service;

import com.courses.apollo.model.Car;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Include methods for using car data.
 * @see Car
 */
public class CarService {

    /**
     * Method that return list of cars of the given Brand.
     */
    public Car[] returnCarsOfGivenBrand(Car[] allCars, String givenBrand) {
        Car[] tempArray = new Car[allCars.length];
        int counter = 0;
        for (int i = 0; i < allCars.length; i++) {
            if (allCars[i].getCarBrand().equals(givenBrand)) {
                tempArray[counter] = allCars[i];
                counter++;
            }
        }
        Car[] carsOfGivenBrand = new Car[counter];
        for (int k = 0; k < counter; k++) {
            carsOfGivenBrand[k] = tempArray[k];
        }
        return carsOfGivenBrand;
    }

    /**
     * Method that return list of cars of given Model older than n years.
     */
    public Car[] returnCarsOfGivenModelOlderThan(Car[] allCars, String givenModel, int givenAge) {
        Car[] tempArray = new Car[allCars.length];
        int counter = 0;
        for (int i = 0; i < allCars.length; i++) {
            GregorianCalendar gcalendar = new GregorianCalendar();
            int year = gcalendar.get(Calendar.YEAR);
            int carAge = year - (allCars[i].getCarYear());
            if (carAge > givenAge && allCars[i].getCarModel().equals(givenModel)) {
                tempArray[counter] = allCars[i];
                counter++;
            }
        }
        Car[] carsOfGivenModelOlderThan = new Car[counter];
        for (int k = 0; k < counter; k++) {
            carsOfGivenModelOlderThan[k] = tempArray[k];
        }
        return carsOfGivenModelOlderThan;
    }

    /**
     * Method that return list of cars of the given Year and more expencive than given Price.
     */
    public Car[] returnCarsOfGivenYearMoreExpensiveThan(Car[] allCars, int givenPrice, int givenYear) {
        Car[] tempArray = new Car[allCars.length];
        int counter = 0;
        for (int i = 0; i < allCars.length; i++) {
            if (allCars[i].getCarYear() == givenYear && allCars[i].getCarPrice() > givenPrice) {
                tempArray[counter] = allCars[i];
                counter++;
            }
        }
        Car[] carsOfGivenYearMoreExpensiveThan = new Car[counter];
        for (int k = 0; k < counter; k++) {
            carsOfGivenYearMoreExpensiveThan[k] = tempArray[k];
        }
        return carsOfGivenYearMoreExpensiveThan;
    }
}