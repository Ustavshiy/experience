package com.courses.apollo.model.city;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * Created class city.
 */
public class City {

    /**
     * Avenue, street, square of City.
     */
    private List<InfoCity> avenue, street, square;

    /**
     * Name of city.
     */
    private String name;

    public City(String name, List<InfoCity> avenue, List<InfoCity> street, List<InfoCity> square) {
        this.name = name;
        this.avenue = avenue;
        this.street = street;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InfoCity> getAvenue() {
        return avenue;
    }

    public void setAvenue(List<InfoCity> avenue) {
        this.avenue = avenue;
    }

    public List<InfoCity> getStreet() {
        return street;
    }

    public void setStreet(List<InfoCity> street) {
        this.street = street;
    }

    public List<InfoCity> getSquare() {
        return square;
    }

    public void setSquare(List<InfoCity> square) {
        this.square = square;
    }

    /**
     * Add new avenue.
     * @param name avenue.
     * @param yearBecoming when has been opened.
     */
    public void addAvenue(String name, LocalDate yearBecoming) {
        avenue.add(new InfoCity(name, yearBecoming));
    }

    /**
     * Add new street.
     * @param name avenue.
     * @param yearBecoming when has been opened.
     */
    public void addStreet(String name, LocalDate yearBecoming) {
        street.add(new InfoCity(name, yearBecoming));
    }

    /**
     * Add new square.
     * @param name avenue.
     * @param yearBecoming when has been opened.
     */
    public void addSquare(String name, LocalDate yearBecoming) {
        square.add(new InfoCity(name, yearBecoming));
    }

    @Override
    public String toString() {
        return "City{" + "avenue=" + avenue + ", street=" + street + ", square=" + square + ", name='" + name + '\''
                + '}';
    }

    /**
     * Information about city.
     */
    public static class InfoCity {

        /**
         * Name of info city.
         */
        private String name;

        /**
         * When has been opened.
         */
        private LocalDate yearBecoming;

        public InfoCity(String name, LocalDate yearBecoming) {
            this.name = name;
            this.yearBecoming = yearBecoming;
        }

        @Override
        public String toString() {
            return "InfoCity{" + "name='" + name + '\'' + ", yearBecoming=" + yearBecoming + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            InfoCity infoCity = (InfoCity) o;
            return Objects.equals(name, infoCity.name)
                    && Objects.equals(yearBecoming, infoCity.yearBecoming);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, yearBecoming);
        }
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
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
