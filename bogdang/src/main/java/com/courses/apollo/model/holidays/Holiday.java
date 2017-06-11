package com.courses.apollo.model.holidays;

import java.time.LocalDate;

/**
 * Created on 15.04.2017.
 */
public class Holiday {

    /**
     * Name of the holiday.
     */
    private String name;

    /**
     * Date of the holiday.
     */
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public Holiday(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
