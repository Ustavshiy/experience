package com.courses.apollo.model;

import java.util.ArrayList;
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
        Holiday holiday = new Holiday("New Year Day", "2016-01-01");
        Holiday holiday1 = new Holiday("Famili Day", "2016-02-15");
        Holiday holiday2 = new Holiday("Good Friday", "2016-03-25");
        Holiday holiday3 = new Holiday("Mother's Day", "2016-05-08");
        Holiday holiday4 = new Holiday("Victoria Day", "2016-05-23");
        Holiday holiday5 = new Holiday("Father's Day", "2016-06-19");
        Holiday holiday6 = new Holiday("Canada Day", "2016-07-01");
        Holiday holiday7 = new Holiday("Civic Day", "2016-08-01");
        Holiday holiday8 = new Holiday("Labour Day", "2016-09-05");
        Holiday holiday9 = new Holiday("Christmas Day", "2016-12-25");
        Holiday holiday10 = new Holiday("Christmas Day", "2016-12-26");
        List<Holiday> holidays = new ArrayList<>();
        holidays.add(holiday);
        holidays.add(holiday1);
        holidays.add(holiday2);
        holidays.add(holiday3);
        holidays.add(holiday4);
        holidays.add(holiday5);
        holidays.add(holiday6);
        holidays.add(holiday7);
        holidays.add(holiday8);
        holidays.add(holiday9);
        holidays.add(holiday10);
        return holidays;
    }
}