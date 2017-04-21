package com.courses.apollo.service;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Year;

public class FindAvrgTimeFeeTest {

    private final static FindAvrgTimeFee findAvrgTimeFee = new FindAvrgTimeFee();
    private final static int salaryPerYear = 14000000;
    private final static LocalDate anyDateOfYear = LocalDate.of(2016,5,11);
    private final static int expected = 6916;
    private final static int workHour = 8;

    @Test
    public void testFindAvrgTimeFee() {
        Assert.assertTrue(findAvrgTimeFee.findAvrgTimeFee(salaryPerYear, workHour, anyDateOfYear) == expected);
    }
}