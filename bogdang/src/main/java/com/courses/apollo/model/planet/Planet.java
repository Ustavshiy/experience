package com.courses.apollo.model.planet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Bogdan on 19.03.2017.
 */
public class Planet {

    /**
     * The name of the planet.
     */
    String name;

    private List<Ocean> oceanList = new ArrayList<>();
    private List<Continent> continentList = new ArrayList<>();
    private List<Island> islandList = new ArrayList<>();

    public Planet(){
    }

    public Planet(String name) {
        this.name = name;
    }

    public void addOcean(Ocean ocean) {
        oceanList.add(ocean);
    }

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public void addIsland(Island island){
        islandList.add(island);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ocean> getOceanList() {
        return oceanList;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public List<Island> getIslandList() {
        return islandList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;
        return Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

/*
 1.Создать объект класса Планета, используя классы Материк, Океан, Остров.
 Методы: вывести на консоль название материка, планеты, количество материков.
 2. Звукозапись. Определить иерархию музыкальных композиций. Записать на диск сборку.
 Подсчитать продолжительность. Провести перестановку композиций диска на основе принадлежности к стилю.
 Найти композицию, соответствующую заданному диапазону длины треков.
 */

