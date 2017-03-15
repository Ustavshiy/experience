package com.courses.apollo;

import com.courses.apollo.model.state.City;
import com.courses.apollo.model.state.Country;
import com.courses.apollo.model.state.Province;

import java.util.ArrayList;

public class CountryUtilTestData {

    public static Country getState() {
        Country state = new Country("Liechtenstein", CountryUtilTestData.getProvinces());
        return state;
    }

    public static ArrayList<Province> getProvinces() {
        ArrayList<Province> provinces = new ArrayList<>();
        provinces.add(new Province("Oberland", CountryUtilTestData.getOberlandCities(), 125478));
        provinces.add(new Province("Unterland", CountryUtilTestData.getUnterlandCities(), 34996));
        return provinces;
    }

    public static ArrayList<City> getOberlandCities() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Balzers", true, false));
        cities.add(new City("Vaduz", true, true));
        cities.add(new City("Planken", false, false));
        cities.add(new City("Triesen", false, false));
        cities.add(new City("Triesenberg", false, false));
        cities.add(new City("Schaan", false, false));
        return cities;
    }

    public static ArrayList<City> getUnterlandCities() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Gamprin", false, false));
        cities.add(new City("Mauren", false, false));
        cities.add(new City("Ruggell", false, false));
        cities.add(new City("Schellenberg", false, true));
        cities.add(new City("Eschen", false, false));
        return cities;
    }
}