package com.courses.apollo.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Class for input and output dates and times.
 */
public final class DateTimeExample {

    /**
     * Value of third variant.
     */
    private static final int THREE = 3;

    private DateTimeExample() {

    }

    /**
     * Date and time output format.
     */
    public static final ThreadLocal<DateFormat> FORMATTERS = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        }
    };

    /**
     * Old method of using dates.
     *
     * @param year  result format of year.
     * @param month result format of month.
     * @param datte result format of date.
     * @param hrs   result format of hours.
     * @param min   result format of minutes.
     * @return old date format.
     */
    public static String useOldDate(int year, int month, int datte, int hrs, int min) {
        Date date = new Date(year, month, datte, hrs, min);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.FEBRUARY, datte);
        return FORMATTERS.get().format(date);
    }

    /**
     * Local method for initializing the date.
     *
     * @param year  result format of year.
     * @param month result format of month.
     * @param datte result format of date.
     * @param hrs   result format of hours.
     * @param min   result format of minutes.
     * @param sec   result format of seconds.
     * @return local date format.
     */
    public static LocalDateTime useLocalDate(int year, int month, int datte, int hrs, int min, int sec) {
        return LocalDateTime.of(year, Month.MARCH, datte, hrs, min, sec);
    }

    /**
     * Class for setting time parameters.
     *
     * @param year  result format of year.
     * @param month result format of month.
     * @param datte result format of date.
     * @return local date.
     */
    public static LocalDate useTemporalAdjuster(int year, int month, int datte) {
        LocalDate date = LocalDate.of(year, month, datte);
        date = date.with(temporal -> {
            DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int dayToAdd = 1;
            if (dow == DayOfWeek.FRIDAY) {
                dayToAdd = THREE;
            }
            if (dow == DayOfWeek.SATURDAY) {
                dayToAdd = 2;
            }
            return temporal.plus(dayToAdd, ChronoUnit.DAYS);
        });
        return date;
    }

    /**
     * Class for formatting dates.
     *
     * @param year  result format of year.
     * @param month result format of month.
     * @param datte result format of date.
     * @return complex format.
     */
    public static String useDateFormatter(int year, int month, int datte) {
        LocalDate date = LocalDate.of(year, month, datte);
        DateTimeFormatter complexFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(". ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ITALIAN);
        return date.format(complexFormatter);
    }
}
