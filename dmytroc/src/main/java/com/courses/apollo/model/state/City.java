package com.courses.apollo.model.state;

import java.util.Objects;

/**
 * Class city in province.Extends to AdministrativeUnit. Also include booleans capital and province center.
 */
public class City extends AdministrativeUnit {
    /**
     * True if province center.
     */
    private boolean isProvinceCenter;
    /**
     * true if capital.
     */
    private boolean isCapital;

    public City() {
    }

    public City(String cityName, Integer area, boolean isCapital, boolean isProvinceCenter) {
        setArea(area);
        setName(cityName);
        this.isCapital = isCapital;
        this.isProvinceCenter = isProvinceCenter;
    }

    public boolean isProvinceCenter() {
        return isProvinceCenter;
    }

    public void setProvinceCenter(boolean provinceCenter) {
        isProvinceCenter = provinceCenter;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City city = (City) o;
        return isProvinceCenter == city.isProvinceCenter
                && isCapital == city.isCapital;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isProvinceCenter, isCapital);
    }

    @Override
    public String toString() {
        return "City{"
                + "name = " + getName()
                + ", area = " + getArea()
                + " sq. km , isProvinceCenter = " + isProvinceCenter
                + ", isCapital = " + isCapital + '}';
    }
}
