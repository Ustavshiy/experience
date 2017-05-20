package com.courses.apollo.model.date;

import java.time.LocalDate;

/**
 * Enum of Astrological Sign.
 */
public enum AstrologicalSign {

    /**
     * Enum of Astrological sign AQUARIUS.
     */
    AQUARIUS(LocalDate.of(2017, 1, 20), LocalDate.of(2017, 2, 18)),

    /**
     * Enum of Astrological sign PISCES.
     */
    PISCES(LocalDate.of(2017, 2, 19), LocalDate.of(2017, 3, 20)),

    /**
     * Enum of Astrological sign ARIES.
     */
    ARIES(LocalDate.of(2017, 3, 21), LocalDate.of(2017, 4, 19)),

    /**
     * Enum of Astrological sign TAURUS.
     */
    TAURUS(LocalDate.of(2017, 4, 20), LocalDate.of(2017, 5, 20)),

    /**
     * Enum of Astrological sign GEMINI.
     */
    GEMINI(LocalDate.of(2017, 5, 21), LocalDate.of(2017, 6, 20)),

    /**
     * Enum of Astrological sign CANCER.
     */
    CANCER(LocalDate.of(2017, 6, 21), LocalDate.of(2017, 7, 22)),

    /**
     * Enum of Astrological sign LEO.
     */
    LEO(LocalDate.of(2017, 7, 23), LocalDate.of(2017, 8, 22)),

    /**
     * Enum of Astrological sign VIRGO.
     */
    VIRGO(LocalDate.of(2017, 8, 23), LocalDate.of(2017, 9, 22)),

    /**
     * Enum of Astrological sign LIBRA.
     */
    LIBRA(LocalDate.of(2017, 9, 23), LocalDate.of(2017, 10, 22)),

    /**
     * Enum of Astrological sign SCORPIO.
     */
    SCORPIO(LocalDate.of(2017, 10, 23), LocalDate.of(2017, 11, 22)),

    /**
     * Enum of Astrological sign SAGITTARIUS.
     */
    SAGITTARIUS(LocalDate.of(2017, 11, 22), LocalDate.of(2017, 12, 22)),

    /**
     * Enum of Astrological sign CAPRICORN.
     */
    CAPRICORN(LocalDate.of(2016, 12, 22), LocalDate.of(2017, 1, 19));

    /**
     * Start date of astrological sign.
     */
    private final LocalDate startDate;

    /**
     * End date of astrological sign.
     */
    private final LocalDate endDate;

    AstrologicalSign(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
