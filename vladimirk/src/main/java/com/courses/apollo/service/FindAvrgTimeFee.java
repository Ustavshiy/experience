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
                int result = Math.round(salary / (workday * workhour));
                return result;
        }

        /**
         * Method to find workdays in Canada without weekends and holidays.
         * @param holidays - list of holidays in Canada in 2016.
         * @param year to indicate report year.
         * @return quantity of workdays.
         */
        private int findWorkDays(List<Holiday> holidays, int year) {
                LocalDate reportPeriod = LocalDate.of(year, 1, 1);
                int workdays = findDaysQuantityInYear(reportPeriod);
                for (int i = 0; i < findDaysQuantityInYear(reportPeriod); i++) {
                        int result = reportPeriod.getDayOfWeek().getValue();
                        if (result == DayOfWeek.SATURDAY.getValue() || result == DayOfWeek.SUNDAY.getValue()) {
                                workdays--;
                        } else {
                                for (int k = 0; k < holidays.size(); k++) {
                                        String strData = holidays.get(k).getDate();
                                        if (LocalDate.parse(strData).getDayOfYear() == reportPeriod.getDayOfYear()) {
                                                workdays--;
                                        }
                                }
                        }
                        reportPeriod = reportPeriod.plusDays(1);
                }
                return workdays;
        }

         /**
          Method to find quantity of days in year.
          @param reportPeriod to indicate year.
          @return quantity of days.
          */
         private int findDaysQuantityInYear(LocalDate reportPeriod) {
                int daysInYear;
                if (reportPeriod.isLeapYear()) {
                        daysInYear =  reportPeriod.MAX.getDayOfYear() + 1;
                } else {
                        daysInYear = reportPeriod.MAX.getDayOfYear();
                }
                return daysInYear;
        }
}