package com.courses.apollo.holidays;

import com.courses.apollo.model.HolidayTestData;
import com.courses.apollo.service.WeekdaysService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeekdaysServiceTest {

    private static final WeekdaysService wekdays = new WeekdaysService();
    private static final int YEAR = 2017;
    private static final Integer expected = 250;

    @Test
    public void findWeekdaysTest() {
        assertEquals(expected, wekdays.findWeekdays(YEAR, HolidayTestData.getBankingHolidays()));
    }
}
