package com.courses.apollo.model.ship;

/**
 * Alpha abstract Class of warship.
 */
public abstract class WarshipImpl implements IShip {

    public WarshipImpl() {
    }

    /**
     * Weight of Warship.
     */
    private int weight;

    /**
     * Number of a gun in Warship.
     */
    private int numberOfGun;

    /**
     * Caliber of a guns.
     */
    private int calibreOfGun;

    /**
     * Thickness of armor in Warship.
     */
    private int armorThickness;

    /**
     * This abstract method calculate a firepower of a ship.
     */
    public abstract int firePower(int numberOfGun, int calibreOfGun);

    public WarshipImpl(int weight, int numberOfGun, int calibreOfGun, int armorThickness) {
        this.weight = weight;
        this.numberOfGun = numberOfGun;
        this.calibreOfGun = calibreOfGun;
        this.armorThickness = armorThickness;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfGun() {
        return numberOfGun;
    }

    public void setNumberOfGun(int numberOfGun) {
        this.numberOfGun = numberOfGun;
    }

    public int getCalibreOfGun() {
        return calibreOfGun;
    }

    public void setCalibreOfGun(int calibreOfGun) {
        this.calibreOfGun = calibreOfGun;
    }

    public int getArmorThickness() {
        return armorThickness;
    }

    public void setArmorThickness(int armorThickness) {
        this.armorThickness = armorThickness;
    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void sailForward() {

    }

    @Override
    public void sailBack() {

    }

    @Override
    public int displacement(int weight) {
        int displacement = weight;
        return displacement;
    }
}

