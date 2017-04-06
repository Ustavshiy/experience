package com.courses.apollo.service;

import com.courses.apollo.model.CanadianHolidayTestData;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vladimirk on 03.04.17.
 */
public class FindAvrgTimeFeeTest {

    private final static FindAvrgTimeFee findAvrgTimeFee = new FindAvrgTimeFee();
    private final static int salaryPerYearinCentc = 14000000;
    private final static int givenYear = 2016;
    private final static int expected = 6916;
    private final static int workHour = 8;

    @Test
    public void testFindAvrgTimeFee() {
        Assert.assertTrue(findAvrgTimeFee.findAvrgTimeFee(salaryPerYearinCentc, workHour, givenYear,
                CanadianHolidayTestData.getCanadianHolidays2016()) == expected);
    }
}