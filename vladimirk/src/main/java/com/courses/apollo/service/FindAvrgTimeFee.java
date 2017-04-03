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
         * @param holidays to take list of Canadian Holidays.
         * @return average payment of 1 canadian employee in 1 hour in cents.
         */
        public int findAvrgTimeFee(int salary, int workhour, List<Holiday> holidays) {
                int workday = findWorkeDays(holidays);
                int result = Math.round(salary / (workday * workhour));
                return result;
        }

        /**
         * Method to wind workdays in Canada without weekands and holidays.
         * @param holidays - list of holidays in Canada in 2016.
         * @return quantity of workdays.
         */
        private int findWorkeDays(List<Holiday> holidays) {
                LocalDate localDate = LocalDate.now();
                localDate = localDate.now().minusYears(1);
                int daysQuantity = findDaysQuantityInYear(localDate);
                localDate = localDate.of(localDate.getYear(), 1, 1).minusDays(1);
                int workdays = daysQuantity;
                for (int i = 0; i < daysQuantity; i++) {
                        localDate = localDate.plusDays(1);
                        int result = localDate.getDayOfWeek().getValue();
                        int saturday = DayOfWeek.SATURDAY.getValue();
                        int sunday = DayOfWeek.SUNDAY.getValue();
                        if (result == saturday || result == sunday) {
                                workdays--;
                        } else {
                                for (int k = 0; k < holidays.size(); k++) {
                                        String strData = holidays.get(k).getDate();
                                        LocalDate holidayData = LocalDate.parse(strData);
                                        if (holidayData.getDayOfYear() == localDate.getDayOfYear()) {
                                                workdays--;
                                        }
                                }
                        }
                }
                return workdays;
        }

        /**
         * Method to find quantity of days in year.
         * @param localDate to indicate last ended year.
         * @return quantity of days.
         */
        private int findDaysQuantityInYear(LocalDate localDate) {
                int daysQuantity;
                if (localDate.isLeapYear()) {
                        daysQuantity =  localDate.MAX.getDayOfYear() + 1;
                } else {
                        daysQuantity = localDate.MAX.getDayOfYear();
                }
                return daysQuantity;
        }
}

