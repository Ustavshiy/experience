package com.courses.apollo.service;

import com.courses.apollo.model.city.City;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Богдан on 04.04.2017.
 */
public class CityService {

    public List<City.InfoCity> getAvenueCity(String name, List<City> cityList) {
        List<City.InfoCity> result = new ArrayList<>();
        for ( City city : cityList) {
            result = city.getAvenue();
        }
        return result;
    }

    public List<City.InfoCity> getStreetCity(String name, List<City> cityList) {
        List<City.InfoCity> result = new ArrayList<>();
        for ( City city : cityList) {
            result = city.getStreet();
        }
        return result;
    }

    public List<City.InfoCity> getSquareCity(String name, List<City> cityList) {
        List<City.InfoCity> result = new ArrayList<>();
        for ( City city : cityList) {
            result = city.getSquare();
        }
        return result;
    }
}
