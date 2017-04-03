package com.courses.apollo.model.bank;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Dell on 01.04.2017.
 */
public class DepositAccount {
    private BigDecimal DepositValue;
    LocalDate InDate;
    LocalDate outDate;
    Deposit depositType;

    private DepositAccount() {
    }

    public DepositAccount(Double depositSum, Deposit depositType, int year, int month, int day) {
        DepositValue = new BigDecimal(depositSum);
        InDate = LocalDate.of(year, month, day);
        this.depositType = depositType;
    }

    public LocalDate getStartDate() {
        return InDate;
    }

    public void setOutDate(LocalDate outDate) {
        this.outDate = outDate;
    }

    public LocalDate getEndDate() {
        return outDate;
    }

    public Deposit getDepositType() {
        return depositType;
    }

    public BigDecimal getDepositValue() {
        return DepositValue;
    }

    public void setDepositValue(BigDecimal depositValue) {
        DepositValue = depositValue;
    }
}
