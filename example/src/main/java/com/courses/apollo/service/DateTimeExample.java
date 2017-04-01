package com.courses.apollo.service;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Class for input and output dates and times.
 */
public final class DateTimeExample {

    /**
     * Value of year.
     */
    private static final int YEAR = 2014;

    /**
     * Value of month.
     */
    private static final int MONTH = 3;

    /**
     * Value of date.
     */
    private static final int DATE = 18;

    /**
     * Value of hour.
     */
    private static final int HRS = 13;

    /**
     * Value of minute.
     */
    private static final int MIN = 45;

    /**
     * Value of second.
     */
    private static final int SEC = 20;

    /**
     * Value of third variant.
     */
    private static final int THREE = 3;

    /**
     * Value of first number.
     */
    private static final int FIRSTNUMB = 44;

    /**
     * Value of second number.
     */
    private static final int SECONDNUMB = 365;

    /**
     * Value of third number.
     */
    private static final int THIRDDNUMB = 86400;

    private DateTimeExample() {

    }


    /**
     * Old method of using dates.
     */
    public static void useOldDate() {
        Date date = new Date(YEAR, MONTH, DATE, HRS, MIN);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(date));
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, Calendar.FEBRUARY, DATE);
        System.out.println(calendar);
    }

    /**
     * Local method for initializing the date.
     */
    public static void useLocalDate() {
        LocalDate date = LocalDate.of(YEAR, MONTH, DATE);
        System.out.println(date);
        LocalTime time = LocalTime.of(HRS, MIN, SEC); // 13:45:20
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.of(YEAR, Month.MARCH, DATE, HRS, MIN, SEC); // 2014-03-18T13:45
        System.out.println(dateTime);
        System.out.println(dateTime.toLocalDate());
        System.out.println(dateTime.toLocalTime());
        Instant instant = Instant.ofEpochSecond(FIRSTNUMB * SECONDNUMB * THIRDDNUMB);
        Instant now = Instant.now();
        Duration duration = Duration.between(LocalTime.of(HRS, MIN, SEC), time);
        Duration durationTwo = Duration.between(instant, now);
        System.out.println(duration.getSeconds());
        System.out.println(durationTwo.getSeconds());
        System.out.println(Duration.of(MONTH, ChronoUnit.MINUTES));
        System.out.println(JapaneseDate.from(date));
    }

    /**
     * Class for setting time parameters.
     */
    public static void useTemporalAdjuster() {
        LocalDate date = LocalDate.of(YEAR, MONTH, DATE);
        System.out.println(date.with(nextOrSame(DayOfWeek.SUNDAY)));
        System.out.println(date.with(lastDayOfMonth()));
        System.out.println(date.with(new NextWorkingDay()));
        System.out.println(date.with(nextOrSame(DayOfWeek.FRIDAY)));
        System.out.println(date.with(new NextWorkingDay()));
        System.out.println(date.with(nextOrSame(DayOfWeek.FRIDAY)));
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
        System.out.println(date);
    }

    /**
     * The class that returns the next working day.
     */
    public static class NextWorkingDay implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int dayToAdd = 1;
            if (dow == DayOfWeek.FRIDAY) {
                dayToAdd = THREE;
            }
            if (dow == DayOfWeek.SATURDAY) {
                dayToAdd = 2;
            }
            return temporal.plus(dayToAdd, ChronoUnit.DAYS);
        }
    }

    /**
     * Class for formatting dates.
     */
    public static void useDateFormatter() {
        LocalDate date = LocalDate.of(YEAR, MONTH, DATE);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(date.format(formatter));
        System.out.println(date.format(italianFormatter));

        DateTimeFormatter complexFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(". ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ITALIAN);

        System.out.println(date.format(complexFormatter));
    }
}
