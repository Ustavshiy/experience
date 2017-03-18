package com.courses.apollo.model.computer;

/**
 * Constructor of RAM.
 */
public class Ram {

    public Ram() {

    }

    /**
     * Name of RAM.
     */
    private String nameRam;

    /**
     * Capacity of RAM, GB.
     */
    private int capacityRam;

    /**
     * Speed of RAM, mHZ.
     */
    private int speedRam;

    /**
     * Type of RAM. DDR/DDR2/DDR3/DDR4.
     */
    private String typeRam;

    public String getNameRam() {
        return nameRam;
    }

    public void setNameRam(String nameRam) {
        this.nameRam = nameRam;
    }

    public int getCapacityRam() {
        return capacityRam;
    }

    public void setCapacityRam(int capacityRam) {
        this.capacityRam = capacityRam;
    }

    public int getSpeedRam() {
        return speedRam;
    }

    public void setSpeedRam(int speedRam) {
        this.speedRam = speedRam;
    }

    public String getTypeRam() {
        return typeRam;
    }

    public void setTypeRam(String typeRam) {
        this.typeRam = typeRam;
    }
}
