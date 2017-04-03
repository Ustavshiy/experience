package com.courses.apollo.util.bank;

import com.courses.apollo.model.bank.Client;
import com.courses.apollo.model.bank.Deposit;
import com.courses.apollo.model.bank.DepositAccount;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Created by Dell on 01.04.2017.
 */
public class DepositUtilTest {
    DepositUtil depositUtil = new DepositUtil();
    private Client testClientOne = new Client();
    private Client testClientTwo = new Client();

    @Before
    public void before() {
        testClientOne.setDepositAccount(new DepositAccount(3000.00, Deposit.THREE_MONTH, 2017, 03, 03));
        testClientTwo.setDepositAccount(new DepositAccount(3000.00, Deposit.SIX_MONTH, 2017, 03, 03));
    }

    @Test
    public void depositAddTest() {
        System.out.println(depositUtil.getDepositOutDate(testClientOne.getDepositAccount()));
        System.out.println(testClientOne.getDepositAccount().getEndDate());
        System.out.println(depositUtil.getDepositInterest(testClientOne.getDepositAccount()));
        System.out.println(depositUtil.getCurrentDepositValue(testClientOne.getDepositAccount(), LocalDate.of(2017, 04, 05)));
        System.out.println(depositUtil.withdrawMoneyDate(testClientOne.getDepositAccount()));
        System.out.println(depositUtil.getDepositOutDate(testClientTwo.getDepositAccount()));
        System.out.println(depositUtil.withdrawMoneyDate(testClientTwo.getDepositAccount()));
    }
}
