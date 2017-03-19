package com.courses.apollo.model.planet;

import java.util.Objects;

/**
 * Created by Богдан on 19.03.2017.
 */
public class Continent extends Planet {

    /**
     * The area of the Continent.
     */
    private Integer area;


    public Continent(String name, Integer area){
        super(name);
        this.area = area;
    }


    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Continent continent = (Continent) o;
        return Objects.equals(name, continent.name)
                && Objects.equals(area, continent.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area);
    }

}
