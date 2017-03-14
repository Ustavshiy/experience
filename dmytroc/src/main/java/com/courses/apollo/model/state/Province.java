package com.courses.apollo.model.state;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class province in country. Include a province name, list of cities, area of province.
 */
public class Province {
    /**
     * Province name.
     */
    private String provinceName;
    /**
     * List of cities.
     */
    private ArrayList<City> provinceCities;
    /**
     * Province area sq. km.
     */
    private Integer provinceArea;

    public Province() {
    }

    public Province(String provinceName, ArrayList<City> provinceCities, Integer provinceArea) {
        this.provinceName = provinceName;
        this.provinceCities = provinceCities;
        this.provinceArea = provinceArea;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public ArrayList<City> getProvinceCities() {
        return provinceCities;
    }

    public void setProvinceCities(ArrayList<City> provinceCities) {
        this.provinceCities = provinceCities;
    }

    public Integer getProvinceArea() {
        return provinceArea;
    }

    public void setProvinceArea(Integer provinceArea) {
        this.provinceArea = provinceArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Province province = (Province) o;
        return Objects.equals(provinceName, province.provinceName)
                && Objects.equals(provinceCities, province.provinceCities)
                && Objects.equals(provinceArea, province.provinceArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provinceName, provinceCities, provinceArea);
    }

    @Override
    public String toString() {
        return "Province{"
                + "provinceName='" + provinceName + '\''
                + ", provinceCities=" + provinceCities
                + ", provinceArea=" + provinceArea + '}';
    }
}