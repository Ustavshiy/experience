package com.courses.apollo.service;

import com.courses.apollo.model.city.City;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Богдан on 04.04.2017.
 */
public class CityService {

    /**
     * Method return avenues of needed city.
     * @param name name of city.
     * @param cityList list city.
     * @return result.
     */
    public List<City.InfoCity> getAvenueCity(String name, List<City> cityList) {
        List<City.InfoCity> result = new ArrayList<>();
        for (City city : cityList) {
            if (name.equals(city.getName())) {
                result = city.getAvenue();
            }
        }
        return result;
    }

    /**
     * Method return streets of needed city.
     * @param name name of city.
     * @param cityList list city.
     * @return result.
     */
    public List<City.InfoCity> getStreetCity(String name, List<City> cityList) {
        List<City.InfoCity> result = new ArrayList<>();
        for (City city : cityList) {
            if (name.equals(city.getName())) {
                result = city.getStreet();
            }
        }
        return result;
    }

    /**
     * Method return squares of needed city.
     * @param name name of city.
     * @param cityList list city.
     * @return result.
     */
    public List<City.InfoCity> getSquareCity(String name, List<City> cityList) {
        List<City.InfoCity> result = new ArrayList<>();
        for (City city : cityList) {
            if (name.equals(city.getName())) {
                result = city.getSquare();
            }
        }
        return result;
    }
            }
