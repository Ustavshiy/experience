package com.courses.apollo.model.bank;

import java.math.BigDecimal;

/**
 * Created by Dell on 02.04.2017.
 */
public enum Deposit {
    THREE_MONTH(new BigDecimal(3)),
    SIX_MONTH(new BigDecimal(4.25)),
    NINE_MONTH(new BigDecimal(6.50)),
    ONE_YEAR(new BigDecimal(9.00));
    final BigDecimal percentPerYear;

    Deposit(BigDecimal percentPerYear) {
        this.percentPerYear = percentPerYear;
    }

    public BigDecimal getPercentPerYear() {
        return percentPerYear;
    }
}