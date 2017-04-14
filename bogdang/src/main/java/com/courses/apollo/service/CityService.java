package com.courses.apollo.service;

import com.courses.apollo.model.city.City;

import java.util.ArrayList;
import java.util.List;

/**
 * Created service for city..
 */
public class CityService {

    /**
     * Method return avenues of needed city.
     *
     * @param name     name of city.
     * @param cityList list city.
     * @return result.
     */
    public List<City.InfoCity.Avenue> getAvenueCity(String name, List<City> cityList) {
        List<City.InfoCity.Avenue> result = new ArrayList<>();
        for (City city : cityList) {
            if (name.equals(city.getName())) {
                result = city.getAvenue();
            }
        }
        return result;
    }

    /**
     * Method return streets of needed city.
     *
     * @param name     name of city.
     * @param cityList list city.
     * @return result.
     */
    public List<City.InfoCity.Street> getStreetCity(String name, List<City> cityList) {
        List<City.InfoCity.Street> result = new ArrayList<>();
        for (City city : cityList) {
            if (name.equals(city.getName())) {
                result = city.getStreet();
            }
        }
        return result;
    }

    /**
     * Method return squares of needed city.
     *
     * @param name     name of city.
     * @param cityList list city.
     * @return result.
     */
    public List<City.InfoCity.Square> getSquareCity(String name, List<City> cityList) {
        List<City.InfoCity.Square> result = new ArrayList<>();
        for (City city : cityList) {
            if (name.equals(city.getName())) {
                result = city.getSquare();
            }
        }
        return result;
    }
}
