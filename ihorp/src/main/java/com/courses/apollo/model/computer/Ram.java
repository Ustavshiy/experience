package com.courses.apollo.model.computer;

import java.util.Objects;

/**
 * Constructor of RAM.
 */
public class Ram {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ram)) {
            return false;
        }
        Ram ram = (Ram) o;
        return capacityRam == ram.capacityRam
                && speedRam == ram.speedRam
                && Objects.equals(nameRam, ram.nameRam)
                && Objects.equals(typeRam, ram.typeRam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRam, capacityRam, speedRam, typeRam);
    }
}
