package com.courses.apollo.model.bank;

import java.math.BigDecimal;

/**
 * Types of deposit.
 */
public enum DepositType {
    /**
     * Three month deposit.
     */
    THREE_MONTH(new BigDecimal("3.00"), 3),
    /**
     * Six month deposit.
     */
    SIX_MONTH(new BigDecimal("4.25"), 6),
    /**
     * Nine month deposit.
     */
    NINE_MONTH(new BigDecimal("6.50"), 9),
    /**
     * One year deposit.
     */
    ONE_YEAR(new BigDecimal("9.00"), 12);
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