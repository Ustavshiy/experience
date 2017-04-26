package com.courses.apollo.model.bank;

import java.math.BigDecimal;

/**
 * Deposit type class.
 */
public class DepositType {
    /**
     * Deposit percent.
     */
    private BigDecimal percentPerYear;
    /**
     * Month count of deposit.
     */
    private int monthCount;

    public DepositType() {
    }

    public DepositType(BigDecimal percentPerYear, int monthCount) {
        this.percentPerYear = percentPerYear;
        this.monthCount = monthCount;
    }

    public void setPercentPerYear(BigDecimal percentPerYear) {
        this.percentPerYear = percentPerYear;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    public BigDecimal getPercentPerYear() {
        return percentPerYear;
    }

    public int getMonthCount() {
        return monthCount;
    }
}
