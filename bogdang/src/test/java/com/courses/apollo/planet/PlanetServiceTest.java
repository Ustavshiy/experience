package com.courses.apollo.planet;

import com.courses.apollo.model.PlanetData;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Богдан on 21.03.2017.
 */
public class PlanetServiceTest {
    private  PlanetServise servise = new PlanetServise();

    @Test
    public void testToStringPlanet() {
        String expectedResult = "Name of Planet: Terra";
        Assert.assertEquals(expectedResult, PlanetData.getPlanet().toString());
    }

    @Test
    public void testToStringContinents() {
        Assert.assertEquals(PlanetData.expectContinents().toString(), PlanetData.getContinents().toString());
    }
}
//тесты фигня, не знаю как их правильно сделать под это.
