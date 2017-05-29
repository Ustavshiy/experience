package com.courses.apollo.model;

import com.courses.apollo.model.holidays.Holiday;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HolidayTestData {

    public static List<Holiday> getBankingHolidays() {
        List<Holiday> holidays = new ArrayList<>();
        holidays.add(new Holiday("New Year's Day", LocalDate.of(2017,1,1)));
        holidays.add(new Holiday("New Year's Day observed", LocalDate.of(2017,1,2)));
        holidays.add(new Holiday("Christmas Day", LocalDate.of(2017,1,7)));
        holidays.add(new Holiday("Orthodox Christmas Day", LocalDate.of(2017,1,9)));
        holidays.add(new Holiday("International Women's Day", LocalDate.of(2017,3,8)));
        holidays.add(new Holiday("Orthodox Easter Day", LocalDate.of(2017,4,16)));
        holidays.add(new Holiday("Orthodox Easter Day", LocalDate.of(2017,4,16)));
        holidays.add(new Holiday("Orthodox Easter Day holiday", LocalDate.of(2017,4,17)));
        holidays.add(new Holiday("Labor Day", LocalDate.of(2017,5,1)));
        holidays.add(new Holiday("Labor Day Holiday", LocalDate.of(2017,5,2)));
        holidays.add(new Holiday("Victory Day / Memorial Day", LocalDate.of(2017,5,9)));
        holidays.add(new Holiday("Orthodox Pentecost", LocalDate.of(2017,6,4)));
        holidays.add(new Holiday("Orthodox Pentecost holiday", LocalDate.of(2017,6,5)));
        holidays.add(new Holiday("Constitution Day", LocalDate.of(2017,6,28)));
        holidays.add(new Holiday("Independence Day", LocalDate.of(2017,8,24)));
        return holidays;
    }
}
