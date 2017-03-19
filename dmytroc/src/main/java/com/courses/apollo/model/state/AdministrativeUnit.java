package com.courses.apollo.model.state;

import java.util.Objects;

/**
 * Created by Dell on 16.03.2017.
 */
public class AdministrativeUnit {
    /**
     * Name of Administrative unit.
     */
    private String name;
    /**
     * Area of Administrative unit.
     */
    private Integer area;

    public AdministrativeUnit() {
    }

    public AdministrativeUnit(String name, Integer area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdministrativeUnit that = (AdministrativeUnit) o;
        return Objects.equals(name, that.name)
                && Objects.equals(area, that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area);
    }
}
