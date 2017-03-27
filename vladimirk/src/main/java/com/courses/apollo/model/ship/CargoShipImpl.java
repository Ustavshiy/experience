package com.courses.apollo.model.ship;

import com.courses.apollo.service.IShip;

/**
 * Abstract class CargoShipImpl for all cargo ships.
 */
abstract class CargoShipImpl implements IShip {

    /**
     * @param weight indicate net weight of the ship.
     */
    private int weight;

    /**
     * @param cargoWeight indicate weight of the loaded cargo.
     */
    private int cargoWeight;

    /**
     * @param totalWeight to indicate weigt of the ship (loaded or not).
     */
    private int totalWeight;

    /**
     * @param isLoaded to indicate if the ship loaded.
     */
    private boolean isLoaded;

    /**
     * @param isMove to indicate move or stop the ship.
     */
    private boolean isMove;

    public int getWeight() {
        return weight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setIsLoaded(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public void setIsMove(boolean isMove) {
        this.isMove = isMove;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public boolean isMove() {
        return isMove;
    }

    /**
     * Method to load cargo on board.
     */
    abstract void load();

    /**
     * Method to unload cargo from board.
     */
    abstract void unload();
}