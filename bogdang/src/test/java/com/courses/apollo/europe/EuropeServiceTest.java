package com.courses.apollo.europe;

import com.courses.apollo.model.EuropeTestData;
import com.courses.apollo.model.europe.Europe;
import com.courses.apollo.service.EuropeService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 03.04.2017.
 */
public class EuropeServiceTest {

    @Test
    public void testTerritorialDivision() {
        Assert.assertEquals(EuropeTestData.getCountry(), EuropeService.territorialDivision(1954, EuropeTestData.getEurope()));
    }
}
