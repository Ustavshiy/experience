package com.courses.apollo.model;

import com.courses.apollo.model.planet.Continent;
import com.courses.apollo.model.planet.Island;
import com.courses.apollo.model.planet.Ocean;
import com.courses.apollo.model.planet.Planet;
import org.hamcrest.core.Is;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class PlanetTestData {
    private Planet planet = new Planet();

    public static ArrayList<Continent> getContinents() {
        Continent continent = new Continent("Australia",12325.343, "South");
        Continent continentOne = new Continent("Eurasia", 32525.78, "North");
        Continent continentTwo = new Continent("Africa", 23435.456, "Equator");

        ArrayList<Continent> continentes = new ArrayList<>();
        continentes.add(continent);
        continentes.add(continentOne);
        continentes.add(continentTwo);
        return continentes;
    }

    public static ArrayList<Ocean> getOceans() {
        Ocean ocean = new Ocean("Pacific", 34235.33, 10994);
        Ocean oceanOne = new Ocean("Atlantic", 33232.24, 8742);

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

    public static Planet getPlanet() {
        Planet planet = new Planet();
        planet.setName("Terra");
        return planet;
    }

}
