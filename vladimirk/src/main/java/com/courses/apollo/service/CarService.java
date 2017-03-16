package com.courses.apollo.service;

import com.courses.apollo.model.Car;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Include methods for using car data.
 * @see Car
 */
public class CarService {

    /**
     * Method that return list of cars of the given Brand.
     * @param cars input collections of objects
     * @param givenBrand seted for compare car brand
     * @return carsOfGivenBrand output collection of objects with  result
     */
    public ArrayList<Car> returnCarsOfGivenBrand(ArrayList<Car> cars, String givenBrand) {
        ArrayList<Car> carsOfGivenBrand = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarBrand().equals(givenBrand)) {
                carsOfGivenBrand.add(cars.get(i));
            }
        }
        return carsOfGivenBrand;
    }

    /**
     * Method that return list of cars of given Model older than n years.
     * @param cars input collections of objects
     * @param givenModel seted for compare car model
     * @param givenAge seted for compare age of the car
     * @return carsOfGivenModelOlderThan output collection of objects with  result
     */
    public ArrayList<Car> returnCarsOfGivenModelOlderThan(ArrayList<Car> cars, String givenModel, int givenAge) {
        ArrayList<Car> carsOfGivenModelOlderThan = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            GregorianCalendar gcalendar = new GregorianCalendar();
            int year = gcalendar.get(Calendar.YEAR);
            int carAge = year - (cars.get(i).getCarYear());
            if (carAge > givenAge && cars.get(i).getCarModel().equals(givenModel)) {
                carsOfGivenModelOlderThan.add(cars.get(i));
            }
        }
        return carsOfGivenModelOlderThan;
    }

    /**
     * Method that return list of cars of the given Year and more expencive than given Price.
     * @param cars input collections of objects
     * @param givenPrice seted for compare car price
     * @return carsOfGivenYearMoreExpensiveThan output collection of objects with  result
     */
    public ArrayList<Car> returnCarsOfGivenYearMoreExpensiveThan(ArrayList<Car> cars, int givenPrice, int givenYear) {
        ArrayList<Car> carsOfGivenYearMoreExpensiveThan = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarYear() == givenYear && cars.get(i).getCarPrice() > givenPrice) {
                carsOfGivenYearMoreExpensiveThan.add(cars.get(i));
            }
        }
        return carsOfGivenYearMoreExpensiveThan;
    }
}