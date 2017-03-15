package com.courses.apollo.model;

import java.util.Objects;

/**
 * Created by vladimirk on 11.03.17.
 */
public class Car {

    /**
     * Variable to indicate id of the car.
     */
    private int carId;

    /**
     * Variable to indicate brand of the car.
     */
    private String carBrand;

    /**
     * Variable to indicate model of the car..
     */
    private String carModel;

    /**
     * Variable to indicate the year of manufacture of the car.
     */
    private int carYear;

    /**
     * Variable to indicate color of the car.
     */
    private String carColor;

    /**
     * Variable to indicate price of the car in cents.
     */
    private int carPrice;

    /**
     * Variable to indicate registration number of the car.
     */
    private String carRegNmbr;

    public Car(int carId,
               String carBrand,
               String carModel,
               int carYear,
               String carColor,
               int carPrice,
               String carRegNmbr) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carColor = carColor;
        this.carPrice = carPrice;
        this.carRegNmbr = carRegNmbr;
    }

    public Car(String carBrand,
               String carModel,
               int carYear,
               int carPrice) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carPrice = carPrice;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public int getCarPrice() {
        return carPrice;
    }

    @Override
    public String toString() {
        if (carId == 0) {
            return carBrand + " " + carModel + " " + carYear + " " + carPrice;
        } else {
            return carId + " " + carBrand + " " + carModel + " " + carYear + " " + carColor + " " + carPrice + " "
                    + carRegNmbr;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(carId, car.carId)
                && Objects.equals(carBrand, car.carBrand)
                && Objects.equals(carModel, car.carModel)
                && Objects.equals(carYear, car.carYear)
                && Objects.equals(carColor, car.carColor)
                && Objects.equals(carPrice, car.carPrice)
                && Objects.equals(carRegNmbr, car.carRegNmbr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, carBrand, carModel, carYear, carColor, carPrice, carRegNmbr);
    }
}