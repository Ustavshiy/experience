package com.courses.apollo.service;

import com.courses.apollo.model.CndnHoliday;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Class FindAvrgTimeFee.
 */
public class FindAvrgTimeFee {

    /**
     * Method that find average payment of 1 canadian employee in 1 hour (in previous (ended) year).
     * @param salary to indicate salary per year.
     * @param workhour to indicate quantity of work hours in 1 day.
     * @param year to indicate report year.
     * @return average payment of 1 canadian employee in 1 hour in cents.
     */
    public int findAvrgTimeFee(int salary, int workhour, LocalDate year) {
        int workday = findWorkDays(year);
        return Math.round(salary / (workday * workhour));
    }

    /**
     * Method to find workdays in Canada without weekends and holidays.
     * @param year to indicate report year.
     * @return quantity of workdays.
     */
    private int findWorkDays(LocalDate year) {
        LocalDate dateOfYear = LocalDate.of(year.getYear(), 1, 1);
        int workdays = 0;
        for (int i = 0; i < dateOfYear.lengthOfYear(); i++) {
            if (!(dateOfYear.getDayOfWeek() == DayOfWeek.SATURDAY || dateOfYear.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                workdays++;
            }
            dateOfYear = dateOfYear.plusDays(1);
        }
        return workdays - findNmbrHolidaysWthtWknd();
    }

    /**
     * Method to find number of holiday days without weekend.
     * @return quantity of holidays.
     */
    private int findNmbrHolidaysWthtWknd() {
        int nmbrHolidays = 0;
        for (CndnHoliday holidays : CndnHoliday.values()) {
            if (!(holidays.getDate().getDayOfWeek() == DayOfWeek.SATURDAY
                    || holidays.getDate().getDayOfWeek() == DayOfWeek.SUNDAY)) {
                nmbrHolidays++;
            }
        }
        return nmbrHolidays;
    }
}