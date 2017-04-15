package com.courses.apollo.service;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class WeekdaysService {

    public Integer findWeekdays(LocalDate date) {
        Integer weekdays = 0;
        Integer quantity = date.lengthOfMonth();
        for (int i = 1; i < quantity; i++) {
            date = LocalDate.of(date.getYear(), date.getMonth(), i);
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY) {
                if (date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                    weekdays++;
                }

            }
        }
            return weekdays;
    }
}
