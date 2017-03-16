package com.courses.apollo.model;

import java.util.Objects;

/**
 * Created by vladimirk on 11.03.17.
 */
public class Car {

    /**
     * @param carId variable to indicate id of the car.
     */
    private int carId;

    /**
     * @param carBrand to indicate brand of the car.
     */
    private String carBrand;

    /**
     * @param carModel variable to indicate model of the car.
     */
    private String carModel;

    /**
     * @param carYear variable to indicate the year of manufacture of the car.
     */
    private int carYear;

    /**
     * @param carColor variable to indicate color of the car.
     */
    private String carColor;

    /**
     * @param carPrice variable to indicate price of the car in cents.
     */
    private int carPrice;

    /**
     * @param carRegNmbr variable to indicate registration number of the car.
     */
    private String carRegNmbr;

    /**
     * @param carId to indicate id of the car.
     * @param carBrand to indicate brand of the car.
     * @param carModel to indicate model of the car.
     * @param carYear to indicate the year of manufacture of the car.
     * @param carColor to indicate color of the car in cents.
     * @param carPrice to indicate price of the car in cents.
     * @param carRegNmbr to indicate registration number of the car.
     */
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

    /**
     * 16.03.2017.
     * Constructor to create objects of Car class, with next fields.
     * @param carBrand to indicate brand of the car
     * @param carModel to indicate model of the car
     * @param carYear to indicate the year of manufacture of the car
     * @param carPrice to indicate price of the car in cents
     */
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
            return carId + " " + carBrand + " " + carModel + " " + carYear + " " + carColor + " " + carPrice + " "
                    + carRegNmbr;
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