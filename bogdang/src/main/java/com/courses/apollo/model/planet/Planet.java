package com.courses.apollo.model.planet;

import java.util.List;
import java.util.Objects;

/**
 * Creation of the planet.
 */
public class Planet {

    /**
     * Name of the planet.
     */
    private String name;

    /**
     * Ordinal number of the planet in the system.
     */
    private Integer number;

    /**
     * Sea of this planet.
     */
    private List<Ocean> oceans;

    /**
     * Continents of this planet.
     */
    private List<Continent> continents;

    /**
     * Islands of this planet.
     */
    private List<Island> islands;

    public Planet() {

    }

    public Planet(String name, Integer number, List<Ocean> oceans, List<Continent> continents, List<Island> islands) {
        this.name = name;
        this.number = number;
        this.oceans = oceans;
        this.continents = continents;
        this.islands = islands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Ocean> getOceans() {
        return oceans;
    }

    public void setOceans(List<Ocean> oceans) {
        this.oceans = oceans;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Island> getIslands() {
        return islands;
    }

    public void setIslands(List<Island> islands) {
        this.islands = islands;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Planet planet = (Planet) o;
        return Objects.equals(getName(), planet.getName())
            && Objects.equals(getNumber(), planet.getNumber())
            && Objects.equals(getOceans(), planet.getOceans())
            && Objects.equals(getContinents(), planet.getContinents())
            && Objects.equals(getIslands(), planet.getIslands());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber(), getOceans(), getContinents(), getIslands());
    }
}


