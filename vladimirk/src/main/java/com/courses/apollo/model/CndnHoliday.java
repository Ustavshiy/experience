package com.courses.apollo.model;

import java.time.LocalDate;

/**
 * Enum class for Canadians holidays.
 */
public enum CndnHoliday {

    /**
     * date of New Year.
     */
    NEW_YEAR_DAY(LocalDate.of(2016, 1, 1)),
    /**
     * date of Family Day.
     */
    FAMILY_DAY(LocalDate.of(2016, 2, 15)),
    /**
     * date of Good Friday.
     */
    GOOD_FRIDAY(LocalDate.of(2016, 3, 25)),
    /**
     * date of MOTHERS_DAY.
     */
    MOTHERS_DAY(LocalDate.of(2016, 5, 8)),
    /**
     * date of VICTORIA_DAY.
     */
    VICTORIA_DAY(LocalDate.of(2016, 5, 23)),
    /**
     * date of FATHERS_DAY.
     */
    FATHERS_DAY(LocalDate.of(2016, 6, 19)),
    /**
     * date of CANADA_DAY.
     */
    CANADA_DAY(LocalDate.of(2016, 7, 1)),
    /**
     * date of CIVIC_DAY.
     */
    CIVIC_DAY(LocalDate.of(2016, 8, 1)),
    /**
     * date of LABOUR_DAY.
     */
    LABOUR_DAY(LocalDate.of(2016, 9, 5)),
    /**
     * date of CHRISTMAS_DAY.
     */
    CHRISTMAS_DAY(LocalDate.of(2016, 12, 25)),
    /**
     * date of CHRISTMAS_DAY (2nd day).
     */
    CHRISTMAS_DAY2(LocalDate.of(2016, 12, 26));

    /**
     *@param date - is date fild.
     */
    private final LocalDate date;

    /**
     * Constructor for Canadian holidays.
     * @param date - is date fild.
     */
    CndnHoliday(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}