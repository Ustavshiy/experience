package com.courses.apollo.model.bank;

import com.courses.apollo.util.bank.DepositUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Dell on 01.04.2017.
 */
public class DepositAccount {
    /**
     * Money value of deposit.
     */
    private BigDecimal depositValue;
    /**
     * Start deposit date.
     */
    private LocalDate depositDate;
    /**
     * End deposit date.
     */
    private LocalDate endDate;
    /**
     * Deposit type.
     */
    private DepositType depositType;

    private DepositAccount() {
    }

    public DepositAccount(String depositSum, DepositType depositType, int year, int month, int day) {
        depositValue = new BigDecimal(depositSum);
        depositDate = LocalDate.of(year, month, day);
        this.depositType = depositType;
        this.endDate = new DepositUtil().getDepositEndDate(this);
    }

    /**
     * Set start date of deposit, deposit type and end date.
     *
     * @param depositDate deposit start date.
     * @param depositType deposit type.
     */
    public void setInDate(LocalDate depositDate, DepositType depositType) {
        this.depositDate = depositDate;
        this.depositType = depositType;
        this.endDate = new DepositUtil().getDepositEndDate(this);
    }

    public LocalDate getStartDate() {
        return depositDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public DepositType getDepositType() {
        return depositType;
    }

    public BigDecimal getDepositValue() {
        return depositValue;
    }

    public void setDepositValue(BigDecimal depositValue) {
        this.depositValue = depositValue;
    }
}