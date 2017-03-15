package com.courses.apollo.model;

import com.courses.apollo.model.Car;

import java.util.ArrayList;

/**
 * Include methods for using car data.
 * @see Car
 */
public class CarTestData {

    public static ArrayList<Car> getCarArrayList() {
        Car car = new Car(1,"Toyota","Auris",2009,"red",
                1200000,"АІ4853АК");
        Car secondCar = new Car(2,"Land Rover","Freelander",2011,"black",
                2200000,"AM2354АО");
        Car thirdCar = new Car(3,"Deawo","Lanos",2006,"grey",
                350000,"AH2345ВА");
        Car fourthCar = new Car(4,"Land Rover","Freelander",2014,"grey",
                2700000,"AX2394АВ");
        Car fifthCar = new Car(5,"Nissan","Almeria",2012,"white",
                1750000,"AВ2694АВ");
        Car sixthCar = new Car(6,"Citroen","C1",2013,"blue",
                1100000,"AК5694АД");
        Car seventhCar = new Car(7,"Fiat","Doblo",2002,"red",
                300000,"AС5555АА");
        Car eightCar = new Car(8,"Honda","Pilot",2017,"grey",
                3200000,"АР4985АТ");
        Car ninthCar = new Car(9,"Mitsubishi","Pajero",2016,"white",
                4700000,"АМ4945АП");
        Car tenthCar = new Car(10,"Toyota","Rav4",2017,"blue",
                2800000,"АА9597ИО");
        Car eleventhCar = new Car("Volvo", "CX90", 2016, 4500000);
        Car twelfthCar = new Car("Audi", "A100", 2016, 100000);
        Car thirteenthCar = new Car("Shkoda","Octavia", 2016, 2100000);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(secondCar);
        cars.add(thirdCar);
        cars.add(fourthCar);
        cars.add(fifthCar);
        cars.add(sixthCar);
        cars.add(seventhCar);
        cars.add(eightCar);
        cars.add(ninthCar);
        cars.add(tenthCar);
        cars.add(eleventhCar);
        cars.add(twelfthCar);
        cars.add(thirteenthCar);
        return cars;
    }

    public static ArrayList<Car> expectedCarsOfGivenBrand() {
        Car car = new Car(1,"Toyota","Auris",2009,"red",
                1200000,"АІ4853АК");
        Car tenthCar = new Car(10,"Toyota","Rav4",2017,"blue",
                2800000,"АА9597ИО");
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(tenthCar);
        return cars;
    }

    public static ArrayList<Car> expectedCarsOfGivenModelOlderThan() {
        Car secondCar = new Car(2,"Land Rover","Freelander",2011,"black",
                2200000,"AM2354АО");
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(secondCar);
        return cars;
    }

    public static ArrayList<Car> expectedCarsOfGivenYearMoreExpensiveThan() {
        Car ninthCar = new Car(9,"Mitsubishi","Pajero",2016,"white",
                4700000,"АМ4945АП");
        Car eleventhCar = new Car("Volvo", "CX90", 2016, 4500000);
        Car thirteenthCar = new Car("Shkoda","Octavia", 2016, 2100000);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(ninthCar);
        cars.add(eleventhCar);
        cars.add(thirteenthCar);
        return cars;
    }
}