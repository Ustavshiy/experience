package com.courses.apollo.planet;

import com.courses.apollo.model.PlanetTestData;
import com.courses.apollo.model.planet.Planet;
import com.courses.apollo.model.planet.Continent;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

/**
 * Created by Богдан on 21.03.2017.
 */
public class PlanetServiceTest {
    final private String namePlanet = "Terra";

    @Test
    public void testNamePlanet() {
        Assert.assertEquals(namePlanet, PlanetTestData.getPlanet().getName());
    }

    @Test
    public void testNameContinent() {
        for (int i = 0; i < PlanetTestData.getContinents().size(); i++) {
            Assert.assertEquals(getTestContinents().get(i).getName(), PlanetTestData.getContinents().get(i).getName());
        }
    }

    private ArrayList<Continent> getTestContinents() {
        ArrayList<Continent> continentes = new ArrayList<>();
        continentes.add(new Continent("Australia", "South"));
        continentes.add(new Continent("Eurasia", "North"));
        continentes.add(new Continent("Africa", "Equator"));
        return continentes;
    }

   @Test
    public void testQtyContinents() {
       int expected = 3;
       Assert.assertEquals(expected, PlanetTestData.getContinents().size());
   }

}

