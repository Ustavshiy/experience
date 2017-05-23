package com.courses.apollo.model.city;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * Created class city.
 */
public class City {

    /**
     * Avenue of City.
     */
    private List<Avenue> avenue;

    /**
     * Street of City.
     */
    private List<Street> street;

    /**
     * Square of City.
     */
    private List<Square> square;

    /**
     * Name of city.
     */
    private String name;

    public City(String name, List<Avenue> avenue, List<Street> street, List<Square> square) {
        this.name = name;
        this.avenue = avenue;
        this.street = street;
        this.square = square;
    }

    public List<Avenue> getAvenue() {
        return avenue;
    }

    public void setAvenue(List<Avenue> avenue) {
        this.avenue = avenue;
    }

    public List<Street> getStreet() {
        return street;
    }

    public void setStreet(List<Street> street) {
        this.street = street;
    }

    public List<Square> getSquare() {
        return square;
    }

    public void setSquare(List<Square> square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Add new avenue.
     *
     * @param name avenue.
     * @param yearBecoming when has been opened.
     */
    public void addAvenue(String name, Integer yearBecoming) {
        avenue.add(new Avenue(name, yearBecoming));
    }

    /**
     * Add new street.
     *
     * @param name street.
     * @param yearBecoming when has been opened.
     */
    public void addStreet(String name, Integer yearBecoming) {
        street.add(new Street(name, yearBecoming));
    }

    /**
     * Add new square.
     *
     * @param name square.
     * @param yearBecoming when has been opened.
     */
    public void addSquare(String name, Integer yearBecoming) {
        square.add(new Square(name, yearBecoming));
    }

    /**
     * Class for avenue in city.
     */
    private class Avenue {
        /**
         * Name of Avenue.
         */
        private String name;

        /**
         * When has been opened.
         */
        private LocalDate yearBecoming;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getYearBecoming() {
            return yearBecoming;
        }

        public void setYearBecoming(LocalDate yearBecoming) {
            this.yearBecoming = yearBecoming;
        }

        public Avenue(String name, Integer yearBecoming) {
            setName(name);
            this.setYearBecoming(LocalDate.of(yearBecoming, 01, 01));
        }

    }

    /**
     * Class for street in city.
     */
    private static class Street {

        /**
         * Name of street.
         */
        private String name;

        /**
         * When has been opened.
         */
        private LocalDate yearBecoming;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getYearBecoming() {
            return yearBecoming;
        }

        public void setYearBecoming(LocalDate yearBecoming) {
            this.yearBecoming = yearBecoming;
        }

        public Street(String name, Integer yearBecoming) {
            setName(name);
            setYearBecoming(LocalDate.of(yearBecoming, 01, 01));
        }
    }

    /**
     * Class for square in city.
     */
    private static class Square {

        /**
         * Name of square.
         */
        private String name;

        /**
         * When has been opened.
         */
        private LocalDate yearBecoming;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getYearBecoming() {
            return yearBecoming;
        }

        public void setYearBecoming(LocalDate yearBecoming) {
            this.yearBecoming = yearBecoming;
        }

        public Square(String name, Integer yearBecoming) {
            setName(name);
            setYearBecoming(LocalDate.of(yearBecoming, 01, 01));
        }
    }
}
