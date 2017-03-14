package com.courses.apollo.util.state;

import com.courses.apollo.model.state.City;
import com.courses.apollo.model.state.Country;
import com.courses.apollo.model.state.Province;

import java.util.ArrayList;

/**
 * Class for country util.
 */
public class CountryUtil {

    /**
     * Sum of all provinces area in the country.
     *
     * @param country Input country.
     * @return Integer area value sq.km.
     */
    public Integer getCountryArea(Country country) {
        Integer countryArea = 0;
        ArrayList<Province> provinces = country.getProvinces();
        for (Province province : provinces) {
            countryArea += province.getProvinceArea();
        }
        return countryArea;
    }

    /**
     * Get province area.
     *
     * @param province input province.
     * @return Integer area value sq.km.
     */
    public Integer getProvinceArea(Province province) {
        return province.getProvinceArea();
    }

    /**
     * Count provinces in country.
     *
     * @param country input Country.
     * @return Integer value of Provinces.
     */
    public Integer provincesCounter(Country country) {
        Integer provincesCounter = country.getProvinces().size();
        return provincesCounter;
    }

    /**
     * Returns capital of the country.
     *
     * @param country input country.
     * @return capitalFinder City.
     */
    public City capitalFinder(Country country) {
        City capital = null;
        for (Province province : country.getProvinces()) {
            for (City city : province.getProvinceCities()) {
                if (city.isCapital()) {
                    capital = city;
                }
            }
        }
        return capital;
    }

    /**
     * Return province center.
     *
     * @param province input province.
     * @return province center City.
     */
    public City provinceCenterFinder(Province province) {
        City provinceCenter = null;
        for (City city : province.getProvinceCities()) {
            if (city.isProvinceCenter()) {
                provinceCenter = city;
            }
        }
        return provinceCenter;
    }
}