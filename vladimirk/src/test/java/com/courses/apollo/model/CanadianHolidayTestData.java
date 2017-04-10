package com.courses.apollo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class for Canadian Holidays in 2016.
 */
final public class CanadianHolidayTestData {

    /**
     * Methot to return List of holidays with name and date.
     * @return List of holidays.
     */
    public static List<Holiday> getCanadianHolidays2016() {
        List<Holiday> holidays = new ArrayList<>();
        holidays.add(new Holiday("New Year Day", LocalDate.of(2016,1,1)));
        holidays.add(new Holiday("Famili Day", LocalDate.of(2016,2,15)));
        holidays.add(new Holiday("Good Friday", LocalDate.of(2016,3,25)));
        holidays.add(new Holiday("Mother's Day", LocalDate.of(2016,5,8)));
        holidays.add(new Holiday("Victoria Day", LocalDate.of(2016,5,23)));
        holidays.add(new Holiday("Father's Day", LocalDate.of(2016,6,19)));
        holidays.add(new Holiday("Canada Day", LocalDate.of(2016,7,1)));
        holidays.add(new Holiday("Civic Day", LocalDate.of(2016,8,1)));
        holidays.add(new Holiday("Labour Day", LocalDate.of(2016,9,5)));
        holidays.add(new Holiday("Christmas Day", LocalDate.of(2016,12,25)));
        holidays.add(new Holiday("Christmas Day", LocalDate.of(2016,12,26)));
        return holidays;
    }
}