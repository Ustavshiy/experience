package com.courses.apollo.model;

import com.courses.apollo.model.city.City;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Богдан on 04.04.2017.
 */
public class CityTestData {

    public static List<City> getCity() {
        List<City> cityList = new ArrayList<>();
        List<City.InfoCity> avenue = new ArrayList<>();
        List<City.InfoCity> street = new ArrayList<>();
        List<City.InfoCity> square = new ArrayList<>();
        City city = new City("Kiev", avenue, street, square);
        city.addAvenue("Reunion", 1959);
        city.addAvenue("Victory", 1964);
        city.addStreet("Minska", 1955);
        city.addStreet("Kashtanova", 1983);
        city.addSquare("Ivana Franca", 1944);
        city.addSquare("Sofiyska", 1036);
        cityList.add(city);
        List<City.InfoCity> avenueTwo = new ArrayList<>();
        List<City.InfoCity> streetTwo = new ArrayList<>();
        List<City.InfoCity> squareTwo = new ArrayList<>();
        City cityTwo = new City("Lviv", avenueTwo, streetTwo, squareTwo);
        cityTwo.addAvenue("Shevchenka", 1569);
        cityTwo.addAvenue("Svobody", 1855);
        cityTwo.addStreet("Galicka", 1382);
        cityTwo.addStreet("Zelena", 1685);
        cityTwo.addSquare("Soborna", 1650);
        cityTwo.addSquare("Yaworskogo", 1774);
        cityList.add(cityTwo);
        return cityList;
    }
}
