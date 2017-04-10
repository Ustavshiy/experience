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
        try {
            depositValue = new BigDecimal(depositSum);
        } catch (Exception e) {
            throw new NumberFormatException("Make sure your sum contains only digits");
        }
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

    /**
     * Inner class DailyStatus. Contains. information about current status of account.
     */
    public class DailyStatus {
        /**
         * Current date.
         */
        private LocalDate currentDate;

        public DailyStatus(LocalDate currentDate) {
            this.currentDate = currentDate;
        }

        public LocalDate getWithdrawDate() {
            return new DepositUtil().withdrawMoneyDate(DepositAccount.this);
        }

        public BigDecimal getCurrentDepositValue() {
            return new DepositUtil().getCurrentDepositValue(DepositAccount.this, currentDate)
                    .setScale(2, BigDecimal.ROUND_DOWN);
        }
    }
}