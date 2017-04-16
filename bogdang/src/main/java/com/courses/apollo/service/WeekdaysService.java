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
     * Quantity month in year.
     */
    private static final Integer QTY_MONTH = 12;

    /**
     * Method for calculates total working days in year for Ukraine. Including banking holidays.
     * @param year needed year.
     * @param holidays List banking holidays in this year.
     * @return total working days in this year.
     */
    public Integer findWeekdays(int year, List<Holiday> holidays) {
        LocalDate date = LocalDate.of(year, 1, 1);
        Integer weekdays = 0;
        for (int i = 1; i <= QTY_MONTH; i++) {
            date = LocalDate.of(date.getYear(), i, date.getDayOfWeek().getValue());
            Integer quantity = date.lengthOfMonth();
            for (int j = 1; j <= quantity; j++) {
                date = LocalDate.of(date.getYear(), i, j);
                if (!findHolidays(date, holidays) && date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek()
                        != DayOfWeek.SUNDAY) {
                        weekdays++;
                }
            }
        }
        return weekdays;
    }

    /**
     * Compares or day of the year coincides with the banking holidays.
     * @param date that coincides.
     * @param holidays List banking holidays in this year.
     * @return true or false.
     */
    private static boolean findHolidays(LocalDate date, List<Holiday> holidays) {
        boolean result = false;
        for (Holiday holiday : holidays) {
            if (holiday.getDate().equals(date)) {
                result = true;
            }
        }
        return result;
    }
}
