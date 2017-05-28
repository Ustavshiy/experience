package com.courses.apollo.model.city;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created class city.
 */
public class City {

    /**
     * Avenue of City.
     */
    private List<Avenue> avenueList;

    /**
     * Street of City.
     */
    private List<Street> streetList;

    /**
     * Square of City.
     */
    private List<Square> squareList;

    /**
     * Name of city.
     */
    private String name;

    public City() {
        this.avenueList = new ArrayList<Avenue>();
        this.streetList = new ArrayList<>();
        this.squareList = new ArrayList<>();
    }


    /**
     * Add new avenue.
     *
     * @param name avenue.
     */
    public void addAvenue(String name) {
        Avenue avenue = new Avenue();
        avenue.name = name;
        avenueList.add(avenue);
    }

    /**
     * Add new street.
     *
     * @param name street.
     */
    public void addStreet(String name) {
        Street street = new Street();
        street.name =name;
        streetList.add(street);
    }

    /**
     * Add new square.
     *
     * @param name square.
     */
    public void addSquare(String name) {
        Square square = new Square();
        square.name = name;
        squareList.add(square);
    }

    /**
     * Class for avenue in city.
     */
    private class Avenue {
        /**
         * Name of Avenue.
         */
        private String name;
    }


    /**
     * Class for street in city.
     */
    private static class Street {

        /**
         * Name of street.
         */
        private String name;
    }

    /**
     * Class for square in city.
     */
    private static class Square {

        /**
         * Name of square.
         */
        private String name;
    }
}
