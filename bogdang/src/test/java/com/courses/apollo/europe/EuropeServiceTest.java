package com.courses.apollo.europe;

import com.courses.apollo.model.EuropeTestData;
import com.courses.apollo.service.EuropeService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 03.04.2017.
 */
public class EuropeServiceTest {
    private EuropeService europeService = new EuropeService();
    private final static Integer YEAR = 1954;

    @Test
    public void testTerritorialDivision() {
        assertEquals(EuropeTestData.getCountry(), europeService.territorialDivision(YEAR,
                EuropeTestData.getEurope()));
    }
}
