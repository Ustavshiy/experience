package com.courses.apollo.model.state;

import java.util.Objects;

/**
 * Class city in province. Include name and booleans capital and province center.
 */
public class City {
    /**
     * City name.
     */
    private String cityName;
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

    public City(String cityName, boolean isCapital, boolean isProvinceCenter) {
        this.cityName = cityName;
        this.isCapital = isCapital;
        this.isProvinceCenter = isProvinceCenter;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isProvinceCenter() {
        return isProvinceCenter;
    }

    public void setProvinceCenter(boolean provinceCenter) {
        isProvinceCenter = provinceCenter;
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
                && isCapital == city.isCapital
                && Objects.equals(cityName, city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, isProvinceCenter, isCapital);
    }

    @Override
    public String toString() {
        return "City{"
                + "cityName='" + cityName + '\''
                + ", isProvinceCenter=" + isProvinceCenter
                + ", isCapital=" + isCapital
                + '}';
    }
}
