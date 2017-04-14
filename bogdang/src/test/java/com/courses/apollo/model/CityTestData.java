package com.courses.apollo.model;

import com.courses.apollo.model.city.City;

import java.util.ArrayList;
import java.util.List;

public class CityTestData {


    public static List<City> getCity() {
        List<City> cityList = new ArrayList<>();
        List<City.InfoCity.Avenue> avenue = new ArrayList<>();
        List<City.InfoCity.Street> street = new ArrayList<>();
        List<City.InfoCity.Square> square = new ArrayList<>();
        City city = new City("Kiev", avenue, street, square);
        city.addAvenue("Reunion", 1959);
        city.addAvenue("Victory", 1964);
        city.addStreet("Minska", 1955);
        city.addStreet("Kashtanova", 1983);
        city.addSquare("Ivana Franca", 1944);
        city.addSquare("Sofiyska", 1036);
        cityList.add(city);
        List<City.InfoCity.Avenue> avenueTwo = new ArrayList<>();
        List<City.InfoCity.Street> streetTwo = new ArrayList<>();
        List<City.InfoCity.Square> squareTwo = new ArrayList<>();
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

    public static List<City.InfoCity.Avenue> getKievAvenue() {
        List<City.InfoCity.Avenue> avenue = new ArrayList<>();
        avenue.add(new City.InfoCity.Avenue("Reunion", 1959));
        avenue.add(new City.InfoCity.Avenue("Victory", 1964));
        return avenue;
    }

    public static List<City.InfoCity.Street> getLvivStreet() {
        List<City.InfoCity.Street> street = new ArrayList<>();
        street.add(new City.InfoCity.Street("Galicka", 1382));
        street.add(new City.InfoCity.Street("Zelena", 1685));
        return street;
    }

    public static List<City.InfoCity.Square> getKievSquare() {
        List<City.InfoCity.Square> square = new ArrayList<>();
        square.add(new City.InfoCity.Square("Ivana Franca", 1944));
        square.add(new City.InfoCity.Square("Sofiyska", 1036));
        return square;
    }
}
