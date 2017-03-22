package com.courses.apollo.servise;

import com.courses.apollo.PlanetData;
import com.courses.apollo.model.planet.Planet;
import com.courses.apollo.model.planet.Continent;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

/**
 * Created by Богдан on 21.03.2017.
 */
public class PlanetServiceTest {

    @Test
    public void testNamePlanet() {
        Assert.assertEquals(getTestPlanet().get(0).getName(),PlanetData.getPlanet().get(0).getName());
    }

    @Test
    public void testNameContinent() {
        for (int i = 0; i < PlanetData.getContinents().size(); i++) {
            Assert.assertEquals(getTestContinents().get(i).getName(), PlanetData.getContinents().get(i).getName());
        }
    }

    private ArrayList<Planet> getTestPlanet() {
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Terra", 3));
    return planets;
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
       Assert.assertEquals(expected, PlanetData.getContinents().size());
   }

}

