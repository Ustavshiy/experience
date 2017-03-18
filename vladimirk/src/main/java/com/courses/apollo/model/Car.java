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
     * @param brand to indicate brand of the car.
     */
    private String brand;

    /**
     * @param model variable to indicate model of the car.
     */
    private String model;

    /**
     * @param year variable to indicate the year of manufacture of the car.
     */
    private int year;

    /**
     * @param color variable to indicate color of the car.
     */
    private String color;

    /**
     * @param price variable to indicate price of the car in cents.
     */
    private int price;

    /**
     * @param regNmbr variable to indicate registration number of the car.
     */
    private String regNmbr;

    /**
     * Constructor to create objects of Car class, with next fields.
     * @param carId to indicate id of the car.
     * @param brand to indicate brand of the car.
     * @param model to indicate model of the car.
     * @param year to indicate the year of manufacture of the car.
     * @param color to indicate color of the car in cents.
     * @param price to indicate price of the car in cents.
     * @param regNmbr to indicate registration number of the car.
     */
    public Car(int carId, String brand, String model, int year, String color, int price, String regNmbr) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNmbr = regNmbr;
    }

    /**
     * Another constructor to create objects of Car class, with next fields.
     * @param brand to indicate brand of the car.
     * @param model to indicate model of the car
     * @param year to indicate the year of manufacture of the car
     * @param price to indicate price of the car in cents
     */
    public Car(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {

        return price;
    }

    @Override
    public String toString() {
            return carId + " " + brand + " " + model + " " + year + " " + color + " " + price + " " + regNmbr;
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
                && Objects.equals(brand, car.brand)
                && Objects.equals(model, car.model)
                && Objects.equals(year, car.year)
                && Objects.equals(color, car.color)
                && Objects.equals(price, car.price)
                && Objects.equals(regNmbr, car.regNmbr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, brand, model, year, color, price, regNmbr);
    }
}