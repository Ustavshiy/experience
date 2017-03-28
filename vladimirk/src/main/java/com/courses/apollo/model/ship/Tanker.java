package com.courses.apollo.model.ship;

/**
 * Class Tanker.
 */
public class Tanker extends CargoShipImpl {

    /**
     * @param isCleaned to indicate if the ship is not cleaned of oil or gas residues.
     */
    private boolean isCleaned;

    public boolean isCleaned() {
        return isCleaned;
    }

    @Override
    public void load() {
        setIsLoaded(true);
        setTotalWeight(getWeight() + getCargoWeight());
        isCleaned = true;
    }

    @Override
    public void unload() {
        setIsLoaded(false);
        setTotalWeight(getWeight());
        isCleaned = true;
    }

    @Override
    public void sail() {
        setIsMove(true);
    }

    @Override
    public void throwUncor() {
        setIsMove(false);
    }
}