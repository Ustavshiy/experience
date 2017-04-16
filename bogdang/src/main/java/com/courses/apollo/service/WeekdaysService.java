package com.courses.apollo.service;

import com.courses.apollo.model.holidays.Holiday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class WeekdaysService {

    public Integer findWeekdays(int year, List<Holiday> holidays) {
        LocalDate date = LocalDate.of(year,1,1);
        Integer weekdays = 0;
        Integer qtyMonth = 12;
        holidays = holidaysInWeekdays(holidays);
        for (int i = 1; i <= qtyMonth; i++) {
            date = LocalDate.of(date.getYear(), i, date.getDayOfWeek().getValue());
            Integer quantity = date.lengthOfMonth();
            for (int j = 1; j <= quantity; j++) {
                date = LocalDate.of(date.getYear(), i, j);
                if (findHolidays(date, holidays) == false) {
                    if (date.getDayOfWeek() != DayOfWeek.SATURDAY) {
                        if (date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                            weekdays++;
                        }
                    }
                }
            }
        }
        return weekdays;
    }

    private static boolean findHolidays(LocalDate date, List<Holiday> holidays) {
        boolean result = false;
        for (Holiday holiday : holidays) {
            if ( holiday.getDate().equals(date)) {
                result = true;
            }
        }
        return result;
    }

    private static List<Holiday> holidaysInWeekdays(List<Holiday> holidays) {
        List<Holiday> holidaysInWe = new ArrayList<>();
        for (Holiday holiday : holidays) {
            if (holiday.getDate().getDayOfWeek() != DayOfWeek.SATURDAY) {
                if (holiday.getDate().getDayOfWeek() != DayOfWeek.SUNDAY) {
                    holidaysInWe.add(holiday);
                }
            }
        }
        return holidaysInWe;
    }
}
