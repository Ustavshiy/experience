package com.courses.apollo.model.state;

import java.util.List;
import java.util.Objects;

/**
 * Class Country. Include name of country and list of provinces.
 */
public class Country extends AdministrativeUnit {
    /**
     * List of provinces in country.
     */
    private List<Province> provinces;
    /**
     * The capital of the country.
     */
    private City capital;

    public Country() {
    }

    public Country(String name, List<Province> provinces) {
        setName(name);
        setProvinces(provinces);
    }

    /**
     * Get provinces in country. Set provinces, calculate area of country, set capital.
     *
     * @param provinces input list of Provinces.
     */
    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
        capital = provinces.stream()
                .map(province -> province.getProvinceCenter()).filter(City::isCapital).findFirst().get();
        setArea(provinces.stream().mapToInt(province -> province.getArea()).sum());
    }

    public List<Province> getProvinces() {
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