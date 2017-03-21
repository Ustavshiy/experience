package com.courses.apollo.model;

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
    /*public static void main (String[] args) {
        PlanetServise servise = new PlanetServise();
        Island island = new Island("Borra");
        Ocean ocean = new Ocean("Pacific");
        Continent continentOne = new Continent("Eurasia");
        servise.infoTerritory(continentOne);
        Continent continentTwo = new Continent("Africa");
        servise.infoTerritory(continentTwo);
        Planet planet = new Planet("Terra");
        servise.infoTerritory(planet);

    }*/

    public static ArrayList<Continent> getContinents() {
        //Continent continent = new Continent("B2");
       // Continent continentOne = new Continent("Eurasia");
        Continent continentTwo = new Continent("Africa");

        ArrayList<Continent> continentes = new ArrayList<>();
       // continentes.add(continent);
        //continentes.add(continentOne);
        continentes.add(continentTwo);

        return continentes;
    }
    public static ArrayList<Ocean> getOceans() {
        Ocean ocean = new Ocean("Pacific");
        Ocean oceanOne = new Ocean("Atlantic");

        ArrayList<Ocean> oceans = new ArrayList<>();
        oceans.add(ocean);
        oceans.add(oceanOne);

        return oceans;
    }

    public static ArrayList<Island> getIslands() {
        Island island = new Island("Borra");

        ArrayList<Island> islands = new ArrayList<>();
        islands.add(island);
        return islands;
    }

    public static ArrayList<Planet> getPlanet() {
        Planet planet = new Planet("Terra");

        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(planet);
        return planets;
    }

    public static ArrayList<Continent> expectContinents() {
        Continent  contOne = new Continent("Africa");

        ArrayList<Continent > cont = new ArrayList<>();
        cont.add(contOne);
        return cont;
    }
}
