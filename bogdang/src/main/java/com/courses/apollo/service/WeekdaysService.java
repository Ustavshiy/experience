package com.courses.apollo.service;

import com.courses.apollo.model.holidays.Holiday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

/**
 * Class for calculates working days.
 */
public class WeekdaysService {

    /**
     * Method for calculates total working days in year for Ukraine. Including banking holidays.
     * @param year needed year.
     * @param holidays List banking holidays in this year.
     * @return total working days in this year.
     */
    public Integer findWeekdays(int year, List<Holiday> holidays) {
        LocalDate date = LocalDate.of(year, 1, 1);
        Integer weekdays = 0;
        for (int i = 0; i < date.lengthOfYear(); i++) {
            if (isNotHoliday(date, holidays) && date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek()
                        != DayOfWeek.SUNDAY) {
                        weekdays++;
                }
            date = date.plusDays(1);
        }
        return weekdays;
    }

    /**
     * Compares or day of the year coincides with the banking holidays.
     * @param date that coincides.
     * @param holidays List banking holidays in this year.
     * @return true or false.
     */
    private static boolean isNotHoliday(LocalDate date, List<Holiday> holidays) {
        for (Holiday holiday : holidays) {
            if (holiday.getDate().equals(date)) {
                return false;
            }
        }
        return true;
    }
}
