package com.courses.apollo.util.state;

import com.courses.apollo.model.state.City;
import com.courses.apollo.model.state.Country;
import com.courses.apollo.model.state.Province;

/**
 * Class for country util.
 */
public class CountryUtils {

    /**
     * Sum of all provinces area in the country.
     *
     * @param country Input country.
     * @return Integer area value sq.km.
     */
    public Integer getCountryArea(Country country) {
        return country.getArea();
    }

    /**
     * Get province area.
     *
     * @param province input province.
     * @return Integer area value sq.km.
     */
    public Integer getProvinceArea(Province province) {
        return province.getArea();
    }

    /**
     * Count provinces in country.
     *
     * @param country input Country.
     * @return Integer value of Provinces.
     */
    public Integer provincesCounter(Country country) {
        return country.getProvinces().size();
    }

    /**
     * Returns capital of the country.
     *
     * @param country input country.
     * @return capitalFinder City.
     */
    public City capitalFinder(Country country) {
        return country.getCapital();
    }

    /**
     * Return province center.
     *
     * @param province input province.
     * @return province center City.
     */
    public City provinceCenterFinder(Province province) {
        return province.getProvinceCenter();
    }
}