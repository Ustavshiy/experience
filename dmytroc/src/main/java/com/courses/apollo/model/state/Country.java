package com.courses.apollo.model.state;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class Country. Include name of country and list of provinces.
 */
public class Country extends AdministrativeUnit {
    /**
     * List of provinces in country.
     */
    private ArrayList<Province> provinces;
    /**
     * The capital of the country.
     */
    private City capital;

    public Country() {
    }

    public Country(String name, ArrayList<Province> provinces) {
        setName(name);
        setProvinces(provinces);
    }

    /**
     * Get provinces in country. Set provinces, calculate area of country, set capital.
     * @param provinces input list of Provinces.
     */
    public void setProvinces(ArrayList<Province> provinces) {
        this.provinces = provinces;
        Integer countryArea = 0;
        for (Province province : provinces) {
            countryArea += province.getArea();
            if (province.getProvinceCenter().isCapital()) {
                capital = province.getProvinceCenter();
            }
        }
        setArea(countryArea);
    }

    public ArrayList<Province> getProvinces() {
        return provinces;
    }

    public City getCapital() {
        return capital;
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
        return Objects.equals(provinces, country.provinces)
                && Objects.equals(capital, country.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provinces, capital);
    }

    @Override
    public String toString() {
        return "Country{"
                + "name = " + getName()
                + ", area = " + getArea()
                + " sq. km, provinces = " + provinces
                + ", capital = " + capital + '}';
    }
}