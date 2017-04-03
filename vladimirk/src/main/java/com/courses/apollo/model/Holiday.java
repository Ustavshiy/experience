package com.courses.apollo.model;

/**
 * Class Holiday for holidays.
 */
public class Holiday {

    /**
     * @param name to indicate name of the holiday.
     */
    private final String name;

    /**
     * @param date to indicate date of the holiday.
     */
    private final String date;

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    /**
     * Constructor for holiday.
     * @param name to indicate name of the holiday;
     * @param date to indicate date of the holiday;
     */
    public Holiday(String name, String date) {
        this.name = name;
        this.date = date;
    }
}