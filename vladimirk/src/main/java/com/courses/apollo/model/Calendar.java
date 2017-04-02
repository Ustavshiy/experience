package com.courses.apollo.model;

import java.util.List;

/**
 * Class Calendar with inner class Weekend for holidays and weekends.
 */
public class Calendar {

    /**
     *@param weekends indicale list of weekends.
     */
    private List<Weekend> weekends;

    /**
     *@param date to indicate date of the holiday.
     */
    private static String date;

    /**
     *@param month to indicate month of the holiday.
     */
    private static String month;

    /**
     *@param year to indicate year of the holiday.
     */
    private static String year;

    /**
     *@param dayOfWeek to indicate day of the week of the holiday.
     */
    private static String dayOfWeek;

    public List<Weekend> getWeekends() {
        return weekends;
    }

    public static String getDate() {
        return date;
    }

    public static String getMonth() {
        return month;
    }

    public static String getYear() {
        return year;
    }

    public static String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     *Class Weekend - inner class of Calendar.
     */
    public class Weekend {

        /**
         *@param name indicate name of holidays, if it's null - indicate that the date is weekend, but not a holiday.
         */
        private String name;

        /**
         * Constructor for holidays.
         * @param date to indicate date of the holiday.
         * @param month to indicate month of the holiday.
         * @param year to indicate year of the holiday.
         * @param dayOfWeek to indicate day of the week of the holiday.
         * @param name to indicate name of the holiday.
         */
        public Weekend(String date, String month, String year, String dayOfWeek, String name) {
            Calendar.date = date;
            Calendar.month = month;
            Calendar.year = year;
            Calendar.dayOfWeek = dayOfWeek;
            this.name = name;
        }

        /**
         * Constructor for the weekend, but not holidays.
         * @param date to indicate date of the holiday.
         * @param month to indicate month of the holiday.
         * @param year year to indicate year of the holiday.
         * @param dayOfWeek to indicate day of the week of the holiday.
         */
        public Weekend(String date, String month, String year, String dayOfWeek) {
            Calendar.date = date;
            Calendar.month = month;
            Calendar.year = year;
            Calendar.dayOfWeek = dayOfWeek;
        }

        /**
         * Method that return number of weekends in calendar.
         * @param weekends indicale list of weekends.
         * @return quantity of weekends in calendar.
         */
        public int findQuantityOfWeekends(List<Weekend> weekends) {
            return weekends.size();
        }
    }
}