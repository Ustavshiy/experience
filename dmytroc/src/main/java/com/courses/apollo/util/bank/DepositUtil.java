package com.courses.apollo.util.bank;

import com.courses.apollo.model.bank.DepositAccount;
import com.courses.apollo.model.bank.DepositType;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * DepositUtil class.
 */
public class DepositUtil {
    /**
     * Days in year.
     */
    private final int yearDays = 365;
    /**
     * Percent divider.
     */
    private final int percentDivider = 100;
    /**
     * Set default rounding mode for BigDecimal.
     */
    private static int roundingMode = BigDecimal.ROUND_DOWN;
    /**
     * Set decimals scale.
     */
    private static int decimals = 2;

    /**
     * Set end of deposit date. Based on Start date and DepositType Type.
     *
     * @param depositAccount Deposit account.
     * @return End date of deposit.
     */
    public LocalDate getDepositEndDate(DepositAccount depositAccount) {
        LocalDate startDate = depositAccount.getStartDate();
        DepositType depositType = depositAccount.getDepositType();
        switch (depositType) {
            case THREE_MONTH:
                return startDate.plusMonths(depositType.THREE_MONTH.getMonthCount());
            case SIX_MONTH:
                return startDate.plusMonths(depositType.SIX_MONTH.getMonthCount());
            case NINE_MONTH:
                return startDate.plusMonths(depositType.NINE_MONTH.getMonthCount());
            case ONE_YEAR:
                return startDate.plusMonths(depositType.ONE_YEAR.getMonthCount());
            default:
                return null;
        }
    }

    /**
     * Returns money plus interest at current date.
     *
     * @param account     deposit account.
     * @param currentDate current date.
     * @return current money.
     */
    public BigDecimal getCurrentDepositValue(DepositAccount account, LocalDate currentDate) {
        return rounded(account.getDepositValue()).add(getDailyInterest(account, currentDate));
    }

    /**
     * Returns Local Date when client can withdraw money.
     *
     * @param depositAccount deposit account.
     * @return withdraw date.
     */
    public LocalDate withdrawMoneyDate(DepositAccount depositAccount) {
        if (depositAccount.getEndDate().getDayOfWeek() == DayOfWeek.SATURDAY) {
            return depositAccount.getEndDate().plusDays(2);
        } else if (depositAccount.getEndDate().getDayOfWeek() == DayOfWeek.SUNDAY) {
            return depositAccount.getEndDate().plusDays(1);
        }
        return depositAccount.getEndDate();
    }

    /**
     * Returns deposit interest to withdraw date.
     *
     * @param account DepositType account.
     * @return money value.
     */
    public BigDecimal getDepositInterest(DepositAccount account) {
        LocalDate withdrawDate = account.getEndDate();
        return getDailyInterest(account, withdrawDate);

    }

    private BigDecimal getDailyInterest(DepositAccount account, LocalDate countDate) {
        BigDecimal epochDepositDate = new BigDecimal(account.getStartDate().toEpochDay());
        BigDecimal epochCountDate = new BigDecimal(countDate.toEpochDay());
        BigDecimal days = epochCountDate.subtract(epochDepositDate);
        BigDecimal percentPerYear = rounded(account.getDepositType().getPercentPerYear());
        return percentPerYear
                .multiply(account.getDepositValue())
                .multiply(days)
                .divide(new BigDecimal(yearDays * percentDivider), roundingMode);
    }

    private BigDecimal rounded(BigDecimal aNumber) {
        return aNumber.setScale(decimals, roundingMode);
    }
}