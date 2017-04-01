package com.courses.apollo.service;

import static org.junit.Assert.assertTrue;
import static com.courses.apollo.service.DateTimeExample.*;

import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import org.junit.Assert;
import org.junit.Test;

public class DateTameExampTest {
    private final String testData = "3914-04-18T13:45:00.000+03:00";
    private final String testLocalData = "2014-03-18T13:45:20";
    private final String testTemporalAdjuster = "2014-03-19";
    private final String testDateFormatter = "18. marzo 2014";
    private final Integer year = 2014;
    private final Integer month = 3;
    private final Integer date = 18;
    private final Integer hrs = 13;
    private final Integer min = 45;
    private final Integer sec = 20;

    @Test
    public void testConstructor()
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<DateTimeExample> constructor = DateTimeExample.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void testOldDate() {
        Assert.assertEquals(testData, useOldDate(year, month, date, hrs, min));
    }

    @Test
    public void testUseLocalDate() {
        Assert.assertEquals(testLocalData, useLocalDate(year, month, date, hrs, min, sec)
                .toString());
    }

    @Test
    public void testUseTemporalAdjuster() {
        Assert.assertEquals(testTemporalAdjuster, useTemporalAdjuster(year, month, date).toString());
    }

    @Test
    public void testUseDateFormatter() {
        Assert.assertEquals(testDateFormatter, useDateFormatter(year, month, date).toString());
    }
}
