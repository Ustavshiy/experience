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
    private List<InfoCity.Avenue> avenue;
    private List<InfoCity.Street> street;
    private List<InfoCity.Square> square;

    /**
     * Name of city.
     */
    private String name;

    public City(String name, List<InfoCity.Avenue> avenue, List<InfoCity.Street> street, List<InfoCity.Square> square) {
        this.name = name;
        this.avenue = avenue;
        this.street = street;
        this.square = square;
    }

    public List<InfoCity.Avenue> getAvenue() {
        return avenue;
    }

    public void setAvenue(List<InfoCity.Avenue> avenue) {
        this.avenue = avenue;
    }

    public List<InfoCity.Street> getStreet() {
        return street;
    }

    public void setStreet(List<InfoCity.Street> street) {
        this.street = street;
    }

    public List<InfoCity.Square> getSquare() {
        return square;
    }

    public void setSquare(List<InfoCity.Square> square) {
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
     * @param name avenue.
     * @param yearBecoming when has been opened.
     */
    public void addAvenue(String name, Integer yearBecoming) {
        avenue.add(new InfoCity.Avenue(name, yearBecoming));
    }

    /**
     * Add new street.
     * @param name avenue.
     * @param yearBecoming when has been opened.
     */
    public void addStreet(String name, Integer yearBecoming) {
        street.add(new InfoCity.Street(name, yearBecoming));
    }

    /**
     * Add new square.
     * @param name avenue.
     * @param yearBecoming when has been opened.
     */
    public void addSquare(String name, Integer yearBecoming) {
        square.add(new InfoCity.Square(name, yearBecoming));
    }

    @Override
    public String toString() {
        return "City{" +
                "avenue=" + avenue + ", street=" + street + ", square=" + square + ", name='" + name + '\'' + '}';
    }

    /**
     * Information about city.
     */
    public static  abstract class InfoCity {

        /**
         * Name of info city.
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

        public static class Avenue extends InfoCity {

                public Avenue(String name, Integer yearBecoming) {
                    setName(name);
                    this.setYearBecoming(LocalDate.of(yearBecoming, 01, 01));
                }

            }

        public static class Street extends InfoCity {

            public Street(String name, Integer yearBecoming) {
                setName(name);
                this.setYearBecoming(LocalDate.of(yearBecoming, 01, 01));
            }

        }
            public static class Square extends InfoCity {

                public Square(String name, Integer yearBecoming) {
                    setName(name);
                    this.setYearBecoming(LocalDate.of(yearBecoming, 01, 01));
                }


            }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            InfoCity infoCity = (InfoCity) o;
            return Objects.equals(name, infoCity.name) &&
                    Objects.equals(yearBecoming, infoCity.yearBecoming);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, yearBecoming);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(avenue, city.avenue) &&
                Objects.equals(street, city.street) &&
                Objects.equals(square, city.square) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avenue, street, square, name);
    }
}
