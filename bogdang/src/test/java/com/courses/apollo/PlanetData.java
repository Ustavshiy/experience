package com.courses.apollo;

import com.courses.apollo.model.planet.Continent;
import com.courses.apollo.model.planet.Island;
import com.courses.apollo.model.planet.Ocean;
import com.courses.apollo.model.planet.Planet;
import org.hamcrest.core.Is;

import java.util.ArrayList;

/**
 * Created by Богдан on 21.03.2017.
 */
public class PlanetData {




    public static ArrayList<Continent> getContinents() {
        Continent continent = new Continent("Australia", "South");
        Continent continentOne = new Continent("Eurasia", "North");
        Continent continentTwo = new Continent("Africa", "Equator");

        ArrayList<Continent> continentes = new ArrayList<>();
        continentes.add(continent);
        continentes.add(continentOne);
        continentes.add(continentTwo);
        return continentes;
    }

    public static ArrayList<Ocean> getOceans() {
        Ocean ocean = new Ocean("Pacific", 10994);
        Ocean oceanOne = new Ocean("Atlantic", 8742);

        ArrayList<Ocean> oceans = new ArrayList<>();
        oceans.add(ocean);
        oceans.add(oceanOne);
        return oceans;
    }

    public static ArrayList<Island> getIslands() {
        Island island = new Island("Borra", 453D);
        ArrayList<Island> islands = new ArrayList<>();
        islands.add(island);
        return islands;
    }

    public static ArrayList<Planet> getPlanet() {
        Planet planet = new Planet("Terra", 3);
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(planet);
        return planets;
    }

}
