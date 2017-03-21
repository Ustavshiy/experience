package com.courses.apollo.planet;

import com.courses.apollo.model.planet.Continent;
import com.courses.apollo.model.planet.Island;
import com.courses.apollo.model.planet.Ocean;
import com.courses.apollo.model.planet.Planet;

import java.util.List;

/**
 * Created by Богдан on 21.03.2017.
 */
public class PlanetService {

    public PlanetService(){
        Island island = new Island("Madagascar");

        Planet planet = new Planet("Terra");

        planet.addContinent(new Continent("Eurasia"));
        planet.addContinent(new Continent("Africa"));

        planet.addOcean(new Ocean("Pacific"));
        planet.addOcean(new Ocean("Atlantic"));

        planet.addIsland(new Island("Barbados"));


        System.out.println("Planet name: "+ planet.getName());
        System.out.println("Continent name: "+ getContinentName(planet.getContinentList()));
        System.out.println("Count continents: "+ planet.getContinentList().size());
    }

    public static String getContinentName(List<Continent> continentList) {
        String result = null;
        for (Continent continent: continentList) {
            result =continent.getName();
        }
        return result;
    }
}
