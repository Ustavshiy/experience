package com.courses.apollo.util.bank;

import com.courses.apollo.model.bank.Deposit;
import com.courses.apollo.model.bank.DepositAccount;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by Dell on 02.04.2017.
 */
public class DepositUtil {
    private static int ROUNDING_MODE = BigDecimal.ROUND_DOWN;
    private static int DECIMALS = 2;

    public LocalDate getDepositOutDate(DepositAccount depositAccount) {
        LocalDate inDate = depositAccount.getStartDate();
        Deposit depositType = depositAccount.getDepositType();
        switch (depositType) {
            case THREE_MONTH:
                depositAccount.setOutDate(inDate.plusMonths(3));
                return inDate.plusMonths(3);
            case SIX_MONTH:
                depositAccount.setOutDate(inDate.plusMonths(6));
                return inDate.plusMonths(6);
            case NINE_MONTH:
                depositAccount.setOutDate(inDate.plusMonths(9));
                return inDate.plusMonths(9);
            case ONE_YEAR:
                depositAccount.setOutDate(inDate.plusYears(1));
                return inDate.plusYears(1);
        }
        return null;
    }

    public BigDecimal getCurrentDepositValue(DepositAccount account, LocalDate currentDate) {
        return rounded(account.getDepositValue()).add(getDailyInterest(account, currentDate));
    }

    public LocalDate withdrawMoneyDate(DepositAccount depositAccount) {
        if (depositAccount.getEndDate().getDayOfWeek() == DayOfWeek.SATURDAY) {
            return depositAccount.getEndDate().plusDays(2);
        } else if (depositAccount.getEndDate().getDayOfWeek() == DayOfWeek.SUNDAY) {
            return depositAccount.getEndDate().plusDays(1);
        }
        return depositAccount.getEndDate();
    }

    public BigDecimal getDepositInterest(DepositAccount account) {
        LocalDate withdrawDate = account.getEndDate();
        return getDailyInterest(account, withdrawDate);

    }

    private BigDecimal getDailyInterest(DepositAccount account, LocalDate countDate) {
        BigDecimal epochDepositDate = new BigDecimal(account.getStartDate().toEpochDay());
        BigDecimal epochCountDate = new BigDecimal(countDate.toEpochDay());
        BigDecimal days = epochCountDate.subtract(epochDepositDate);
        BigDecimal percentPerYear = rounded(account.getDepositType().getPercentPerYear());
        return percentPerYear.
                multiply(account.getDepositValue()).
                multiply(days).
                divide(new BigDecimal(365 * 100), ROUNDING_MODE);
    }

    public BigDecimal dailyInterest(Deposit account) {
        return account.getPercentPerYear();
    }

    private BigDecimal rounded(BigDecimal aNumber) {
        return aNumber.setScale(DECIMALS, ROUNDING_MODE);
    }
}