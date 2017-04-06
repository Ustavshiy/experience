package com.courses.apollo.model.bank;

import java.math.BigDecimal;

/**
 * Types of deposit.
 */
public enum DepositType {
    /**
     * Three month deposit.
     */
    THREE_MONTH(new BigDecimal("16.00"), 3),
    /**
     * Six month deposit.
     */
    SIX_MONTH(new BigDecimal("16.50"), 6),
    /**
     * One year deposit.
     */
    ONE_YEAR(new BigDecimal("16.80"), 12);
    /**
     * Deposit penrcent.
     */
    private final BigDecimal percentPerYear;
    /**
     * Month count of deposit.
     */
    private final int monthCount;

    DepositType(BigDecimal percentPerYear, int monthCount) {
        this.percentPerYear = percentPerYear;
        this.monthCount = monthCount;
    }

    public BigDecimal getPercentPerYear() {
        return percentPerYear;
    }

    public int getMonthCount() {
        return monthCount;
    }
}