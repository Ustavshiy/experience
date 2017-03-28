package com.courses.apollo;

import com.courses.apollo.model.state.City;
import com.courses.apollo.model.state.Country;
import com.courses.apollo.model.state.Province;

import java.util.ArrayList;
import java.util.List;

public class CountryUtilTestData {

    public static Country getState() {
        Country state = new Country("Liechtenstein", CountryUtilTestData.getProvinces());
        return state;
    }

    public static List<Province> getProvinces() {
        List<Province> provinces = new ArrayList<>();
        provinces.add(new Province("Oberland", 125478, CountryUtilTestData.getOberlandCities()));
        provinces.add(new Province("Unterland", 34996, CountryUtilTestData.getUnterlandCities()));
        return provinces;
    }

    public static List<City> getOberlandCities() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Balzers",12, true, false));
        cities.add(new City("Vaduz",12, true, true));
        cities.add(new City("Planken",12, false, false));
        cities.add(new City("Triesen",12, false, false));
        cities.add(new City("Triesenberg",12, false, false));
        cities.add(new City("Schaan",12, false, false));
        return cities;
    }

    public static List<City> getUnterlandCities() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Gamprin",12, false, false));
        cities.add(new City("Mauren",12, false, false));
        cities.add(new City("Ruggell",12, false, false));
        cities.add(new City("Schellenberg",12, false, true));
        cities.add(new City("Eschen",12, false, false));
        return cities;
    }
}