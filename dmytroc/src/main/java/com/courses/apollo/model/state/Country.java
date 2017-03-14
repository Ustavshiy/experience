package com.courses.apollo.model.state;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class Country. Include name of country and list of provinces.
 */
public class Country {
    /**
     * Country name.
     */
    private String countryName;
    /**
     * List of provinces in country.
     */
    private ArrayList<Province> provinces;

    public Country() {
    }

    public Country(String countryName, ArrayList<Province> provinces) {
        this.countryName = countryName;
        this.provinces = provinces;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public ArrayList<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(ArrayList<Province> provinces) {
        this.provinces = provinces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName)
                && Objects.equals(provinces, country.provinces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, provinces);
    }

    @Override
    public String toString() {
        return "Country{"
                + "countryName='" + countryName + '\''
                + ", provinces=" + provinces + '}';
    }
}