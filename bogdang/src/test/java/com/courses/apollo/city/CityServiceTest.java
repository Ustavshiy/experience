package com.courses.apollo.city;

import com.courses.apollo.model.CityTestData;
import com.courses.apollo.service.CityService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Богдан on 05.04.2017.
 */
public class CityServiceTest {

    private CityService cityService = new CityService();
    private final String NAME_ONE = "Kiev";
    private final String NAME_TWO = "Lviv";

    @Test
    public void testGetAvenueCity() {
       assertEquals(CityTestData.getKievAvenue(), cityService.getAvenueCity(NAME_ONE, CityTestData.getCity()));
    }

    @Test
    public void testGetStreetCity() {
        assertEquals(CityTestData.getLvivStreet(), cityService.getStreetCity(NAME_TWO, CityTestData.getCity()));
    }

    @Test
    public void testGetSquareCity() {
        assertEquals(CityTestData.getKievSquare(), cityService.getSquareCity(NAME_ONE, CityTestData.getCity()));
    }
}
