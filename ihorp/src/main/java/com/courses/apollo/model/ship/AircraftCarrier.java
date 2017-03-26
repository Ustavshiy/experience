package com.courses.apollo.model.ship;

/**
 * Pojo of Aircraft Carrier.
 */
public class AircraftCarrier extends WarshipImpl {

    public AircraftCarrier() {
    }

    /**
     * Field Number of Aircraft in Aircraft Carrier.
     */
    private int numberOfAircraft;

    public AircraftCarrier(int weight, int numberOfGun, int calibreOfGun, int armorThinckness, int numberOfAircraft) {
        super(weight, numberOfGun, calibreOfGun, armorThinckness);
        this.numberOfAircraft = numberOfAircraft;
    }

    public int getNumberOfAircraft() {
        return numberOfAircraft;
    }

    public void setNumberOfAircraft(int numberOfAircraft) {
        this.numberOfAircraft = numberOfAircraft;
    }

    @Override
    /**
     * This method calculate a fire power of a Aircraft Carrier. Initialized in class WarshipImpl.
     * @param numberOfGun number of guns in ship.
     * @param calibreOfGun calibre of guns in ship.
     * @return firePower.
     */
    public int firePower(int numberOfGun, int calibreOfGun) {
        int firePower = numberOfGun * calibreOfGun;
        return firePower;
    }
}
