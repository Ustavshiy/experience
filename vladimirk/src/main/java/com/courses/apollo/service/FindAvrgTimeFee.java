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
        LocalDate strtRprtYear = LocalDate.of(year, 1, 1);
        int daysInYear = strtRprtYear.lengthOfYear();
        int weekendsNmbr = 0;
        for (int i = 0; i < strtRprtYear.lengthOfYear(); i++) {
            if (DayOfWeek.SATURDAY.equals(strtRprtYear.getDayOfWeek())
                || DayOfWeek.SUNDAY.equals(strtRprtYear.getDayOfWeek())) {
                weekendsNmbr++;
            }
            strtRprtYear = strtRprtYear.plusDays(1);
        }
        return daysInYear - weekendsNmbr - holidays.size() + findNmbrHolidaysOnWeekends(holidays);
    }

    /**
     * Method to find holidays that coincide with the weekend.
     * @param holidays - list of holidays in Canada in 2016.
     * @return quantity of coincidences.
     */
    private int findNmbrHolidaysOnWeekends(List<Holiday> holidays) {
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