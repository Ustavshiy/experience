package com.courses.apollo.model.building;

import com.courses.apollo.service.IBuilding;

/**
 * Created abstract class for buildings.
 */
public abstract class PublicBuildingImpl implements IBuilding {

    /**
     * Number of rooms in PublicBuilding.
     */
    private Integer qtyRooms;

    /**
     * Number of windows in PublicBuilding.
     */
    private Integer qtyWindows;

    /**
     * Number of doors in PublicBuilding.
     */
    private Integer qtyDoors;

    /**
     * is working now PublicBuilding.
     */
    private boolean isWorking;

    public Integer getQtyRooms() {
        return qtyRooms;
    }

    public void setQtyRooms(Integer qtyRooms) {
        this.qtyRooms = qtyRooms;
    }

    public Integer getQtyWindows() {
        return qtyWindows;
    }

    public void setQtyWindows(Integer qtyWindows) {
        this.qtyWindows = qtyWindows;
    }

    public Integer getQtyDoors() {
        return qtyDoors;
    }

    public void setQtyDoors(Integer qtyDoors) {
        this.qtyDoors = qtyDoors;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    /**
     * Method for calculating seats based on square of building.
     */
    abstract void qtyOfSeats();

}
