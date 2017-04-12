package com.courses.apollo.model;

import java.util.List;
import java.util.Objects;

/**
 * Class Exhibition with inner class Painting.
 */
public class Exhibition {

    /**
     * @param name to indicate name of the exhibition.
     */
    private String name;

    /**
     * @param date to indicate date of the exhibition.
     */
    private String date;

    /**
     * @param time to indicate date of the exhibition.
     */
    private String time;

    /**
     * @param paintings to indicate date of the exhibition.
     */
    private List<Painting> paintings;

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public List<Painting> getPaintings() {
        return paintings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPaintings(List<Painting> paintings) {
        this.paintings = paintings;
    }

    /**
     * Class for painting.
     */
    public static class Painting {

        /**
         * @param title o indicate  title of painting.
         */
        private String title;

        /**
         * @param name to indicate author's name.
         */
        private String name;

        /**
         * @param surname to indicate author's surname.
         */
        private String surname;

        /**
         * @param year to indicate the year of creation of painting.
         */
        private int year;

        public String getSurname() {
            return surname;
        }

        /**
         * Constructor for paintings.
         * @param title to indicate  title of painting.
         * @param name to indicate author's name.
         * @param surname to indicate author's surname.
         * @param year to indicate the year of creation of painting.
         */
        public Painting(String title, String name, String surname, int year) {
            this.title = title;
            this.name = name;
            this.surname = surname;
            this.year = year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Painting)) {
                return false;
            }
            Painting painting = (Painting) o;
            return year == painting.year
                    && Objects.equals(title, painting.title)
                    && Objects.equals(name, painting.name)
                    && Objects.equals(surname, painting.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, name, surname, year);
        }
    }
}