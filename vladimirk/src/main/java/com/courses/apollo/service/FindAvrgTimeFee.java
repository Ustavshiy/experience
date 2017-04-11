package com.courses.apollo.service;

import com.courses.apollo.model.Holiday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

/**
 * Class FindAvrgTimeFee.
 */
public class FindAvrgTimeFee {

    /**
     * Method that fint average payment of 1 canadian employee in 1 hour (in previous (ended) year).
     * @param salary to indicate salary per year.
     * @param workhour to indicate quantity of work hours in 1 day.
     * @param year to indicate report year.
     * @param holidays to take list of Canadian Holidays.
     * @return average payment of 1 canadian employee in 1 hour in cents.
     */
    public int findAvrgTimeFee(int salary, int workhour, int year, List<Holiday> holidays) {
        int workday = findWorkDays(holidays, year);
        return Math.round(salary / (workday * workhour));
    }

    /**
     * Method to find workdays in Canada without weekends and holidays.
     * @param holidays - list of holidays in Canada in 2016.
     * @param year to indicate report year.
     * @return quantity of workdays.
     */
    private int findWorkDays(List<Holiday> holidays, int year) {
        LocalDate bgnRprtYear = LocalDate.of(year, 1, 1);
        final int daysInWeek = 7;
        int weekend = 0;
        int daysToFirstSat = Math.abs(DayOfWeek.SATURDAY.getValue() - bgnRprtYear.getDayOfWeek().getValue());
        int daysToFirstSun = Math.abs(DayOfWeek.SUNDAY.getValue() - bgnRprtYear.getDayOfWeek().getValue());
        for (int i = 0; i < bgnRprtYear.lengthOfYear() - daysToFirstSat; i += daysInWeek) {
            weekend++;
        }
        for (int i = 0; i < bgnRprtYear.lengthOfYear() - daysToFirstSun; i += daysInWeek) {
            weekend++;
        }
        return bgnRprtYear.lengthOfYear() - weekend - holidays.size() + findNmbrHolidaysOnWeekend(holidays);
    }

    /**
     * Method to find holidays that coincide with the weekend.
     * @param holidays - list of holidays in Canada in 2016.
     * @return quantity of coincidences.
     */
    private int findNmbrHolidaysOnWeekend(List<Holiday> holidays) {
        int nmbrHolidaysOnWeekends = 0;
        for (int k = 0; k < holidays.size(); k++) {
            if (holidays.get(k).getDate().getDayOfWeek() == DayOfWeek.SATURDAY
                || holidays.get(k).getDate().getDayOfWeek() == DayOfWeek.SUNDAY) {
                nmbrHolidaysOnWeekends++;
            }
        }
        return nmbrHolidaysOnWeekends;
    }
}