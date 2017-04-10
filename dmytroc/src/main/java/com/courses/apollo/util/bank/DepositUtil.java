package com.courses.apollo.util.bank;

import com.courses.apollo.model.bank.DepositAccount;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/**
 * DepositUtil class.
 */
public class DepositUtil {
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
        return startDate.plusMonths(depositAccount.getDepositType().getMonthCount());
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
    public BigDecimal getDepositCompoundInterest(DepositAccount account) {
        LocalDate withdrawDate = account.getEndDate();
        return account.getDepositValue().add(getDailyInterest(account, account.getStartDate(), withdrawDate))
                .setScale(2, roundingMode);
    }

    private BigDecimal getDailyInterest(DepositAccount account, LocalDate startDate, LocalDate countDate) {
        int epochDepositDate = (int) startDate.toEpochDay();
        int epochCountDate = (int) countDate.toEpochDay();
        int days = epochCountDate - epochDepositDate;
        BigDecimal percentPerYear = rounded(account.getDepositType().getPercentPerYear());
        ChronoLocalDate chronoLocalDate = startDate;
        return percentPerYear
                .multiply(account.getDepositValue())
                .multiply(BigDecimal.valueOf(days))
                .divide(new BigDecimal(chronoLocalDate.lengthOfYear() * percentDivider), roundingMode);
    }

    /**
     * Returns money plus interest at current date.
     *
     * @param account     deposit account.
     * @param currentDate current date.
     * @return current money.
     */
    public BigDecimal getCurrentDepositValue(DepositAccount account, LocalDate currentDate) {
        LocalDate depositYearStart = LocalDate.of(account.getStartDate().getYear(), 1, 1);
        LocalDate withdrawYearStart = LocalDate.of(currentDate.getYear(), 1, 1);
        if (depositYearStart.equals(withdrawYearStart)) {
            return rounded(account.getDepositValue())
                    .add(getDailyInterest(account, account.getStartDate(), currentDate));
        }
        BigDecimal currentDepositValue =
                account.getDepositValue().add(getDailyInterest(account, account.getStartDate(),
                        LocalDate.of(depositYearStart.getYear(), 1, 1).plusYears(1)));
        depositYearStart = depositYearStart.plusYears(1);
        while (depositYearStart.getYear() < withdrawYearStart.getYear()) {
            currentDepositValue = currentDepositValue
                    .add(getDailyInterest(account, depositYearStart, depositYearStart.plusYears(1)));
            depositYearStart = depositYearStart.plusYears(1);
        }
        return rounded(currentDepositValue
                .add(getDailyInterest(account, depositYearStart, currentDate)));
    }

    /**
     * Returns object of Daily account status.
     *
     * @param depositAccount deposit account.
     * @param currentDate    current date.
     * @return DailyStatus.
     */
    public DepositAccount.DailyStatus getDailyStatus(DepositAccount depositAccount, LocalDate currentDate) {
        return depositAccount.new DailyStatus(currentDate);
    }

    private BigDecimal rounded(BigDecimal aNumber) {
        return aNumber.setScale(decimals, roundingMode);
    }
}