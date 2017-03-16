package com.courses.apollo.model.state;

import java.util.List;
import java.util.Objects;

/**
 * Class province in country. Extends to AdministrativeUnit. Also include list of cities.
 */
public class Province extends AdministrativeUnit {
    /**
     * List of cities.
     */
    private List<City> provinceCities;
    /**
     * City of province center.
     */
    private City provinceCenter;

    public Province() {
    }

    public Province(String name, Integer area, List<City> provinceCities) {
        setName(name);
        setArea(area);
        setProvinceCities(provinceCities);
    }

    public City getProvinceCenter() {
        return provinceCenter;
    }

    /**
     * Get cities in province. Set province center city.
     * @param provinceCities input list of Cities.
     */
    public void setProvinceCities(List<City> provinceCities) {
        for (City city : provinceCities) {
            if (city.isProvinceCenter()) {
                provinceCenter = city;
                break;
            }
        }
        this.provinceCities = provinceCities;
    }

    public List<City> getProvinceCities() {
        return provinceCities;
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
        return Objects.equals(provinceCities, province.provinceCities)
                && Objects.equals(provinceCenter, province.provinceCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provinceCities, provinceCenter);
    }
}