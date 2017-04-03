package com.courses.apollo.model.europe;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Objects;

/**
 * Created by Богдан on 03.04.2017.
 */
public class Europe {

    /**
     * Year in history.
     */
    private Integer year;

    /**
     * Countries of part of the world.
     */
    private List<Country> countries;


    public Europe(Integer year, List<Country> countries) {
        this.year = year;
        this.countries = countries;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountry(String country) {
        countries.add(new Country(country));
    }

    @Override
    public String toString() {
        return "Europe{" +
                "year=" + year +
                ", countries=" + countries +
                '}';
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public class Country {

        /**
         * Name of the country.
         */
        private String name;

        public Country (String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Country country = (Country) o;
            return Objects.equals(name, country.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
