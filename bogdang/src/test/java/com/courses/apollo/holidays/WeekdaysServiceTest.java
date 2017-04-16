package com.courses.apollo.holidays;

import com.courses.apollo.model.HolidayTestData;
import com.courses.apollo.service.WeekdaysService;
import org.junit.Assert;
import org.junit.Test;

public class WeekdaysServiceTest {

    private static final WeekdaysService wekdays = new WeekdaysService();
    private static final int YEAR = 2017;
    private static final Integer expected = 250;

    @Test
    public void findWeekdaysTest() {
        Assert.assertEquals(wekdays.findWeekdays(YEAR, HolidayTestData.getBankingHolidays()), expected);
    }
}
