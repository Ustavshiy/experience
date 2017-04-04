package com.courses.apollo.util.bank;

import com.courses.apollo.model.bank.Client;
import com.courses.apollo.model.bank.DepositType;
import com.courses.apollo.model.bank.DepositAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Test for DepositUtil.
 */
public class DepositUtilTest {
    DepositUtil depositUtil = new DepositUtil();
    private Client testClientOne = new Client();
    private Client testClientTwo = new Client();
    LocalDate expectedOneWithdrawResult = LocalDate.of(2017, 6, 5);
    LocalDate expectedTwoWithdrawResult = LocalDate.of(2017, 9, 4);
    LocalDate testLocalDate = LocalDate.of(2017, 04, 05);
    BigDecimal expectedForLocalDateResult = new BigDecimal(3008.13).setScale(2, BigDecimal.ROUND_DOWN);
    BigDecimal expectedInterestResult = new BigDecimal(42.84).setScale(2, BigDecimal.ROUND_DOWN);
    DepositAccount clientOneAccount;
    DepositAccount clientTwoAccount;

    @Before
    public void before() {
        testClientOne.setDepositAccount(new DepositAccount(3000.00, DepositType.THREE_MONTH, 2017, 03, 03));
        testClientTwo.setDepositAccount(new DepositAccount(2000.00, DepositType.SIX_MONTH, 2017, 03, 03));
        this.clientOneAccount = testClientOne.getDepositAccount();
        this.clientTwoAccount = testClientTwo.getDepositAccount();
    }

    @Test
    public void withdrawMoneyDateTest() {
        Assert.assertEquals(expectedOneWithdrawResult, depositUtil.withdrawMoneyDate(clientOneAccount));
        Assert.assertEquals(expectedTwoWithdrawResult, depositUtil.withdrawMoneyDate(clientTwoAccount));
     }
    @Test
    public void getCurrentDepositValueTest() {
        Assert.assertEquals(expectedForLocalDateResult, depositUtil.getCurrentDepositValue(clientOneAccount, testLocalDate));
    }
    @Test
    public void getDepositInterestTest() {
        Assert.assertEquals(expectedInterestResult, depositUtil.getDepositInterest(clientTwoAccount));
    }
}
