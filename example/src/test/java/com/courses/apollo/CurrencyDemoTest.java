package com.courses.apollo;

import com.courses.apollo.model.CurrencyDemo;
import com.courses.apollo.model.CurrencyEnum;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class CurrencyDemoTest {

    @Test
    public void testCurrency() {
        System.out.println("PENNY " + CurrencyDemo.PENNY);
    }

    @Test
    public void testCurrencyEnum() {
        System.out.println(CurrencyEnum.PENNY == CurrencyEnum.PENNY);
        System.out.println(CurrencyEnum.PENNY.value);
        CurrencyEnum.PENNY.printValue();
        testSwitchInEnum(CurrencyEnum.NICKLE);
        for (int i = 0; i < CurrencyEnum.values().length; i++) {

        }

        List empty = Collections.EMPTY_LIST;
        empty.add("Test");
        System.out.println(empty.size());

    }

    public void testSwitchInEnum(CurrencyEnum currencyEnum) {
        switch (currencyEnum) {
            case NICKLE:
                System.out.println("Nickle");break;
            case PENNY:
                System.out.println("Penny");break;
        }
    }
}
