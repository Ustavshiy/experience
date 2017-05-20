package com.courses.apollo.model;

/**
 * Created by User on 27.04.2017.
 */
public class Country {

    /**
     * Field city.
     */
    private City city;

    /**
     * Field name.
     */
    private String name;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
