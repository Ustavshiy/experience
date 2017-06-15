package com.courses.apollo.service.date;

import com.courses.apollo.model.date.AstrologicalSign;

import java.time.LocalDate;

/**
 * Util class.
 */
public final class IdentifyAstrologicalSign {
    private IdentifyAstrologicalSign() {}

    /**
     * Method identify astrological sign by date.
     * @param date date to identify.
     * @return Astrological sign.
     */
    public static AstrologicalSign identifySign(LocalDate date) {
        int dayOfYear = date.getDayOfYear();
        AstrologicalSign sign = null;
        for (AstrologicalSign signTmp : AstrologicalSign.values()) {
            if (dayOfYear >= signTmp.getStartDate().getDayOfYear()
                    && dayOfYear <= signTmp.getEndDate().getDayOfYear()) {
                sign = signTmp;
            }
        }
        return sign;
    }
}