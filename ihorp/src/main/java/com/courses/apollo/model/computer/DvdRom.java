package com.courses.apollo.model.computer;

import java.util.Objects;

/**
 * Constructor of DVDRom.
 */
public class DvdRom {

    /**
     * Name of DVD ROM.
     */
    private String nameDvdRom;

    /**
     * Speed of DVD ROM, *x.
     */
    private int speedDvdRom;

    /**
     * Field to detect is the CPU can write information on the disk.
     */
    private boolean isDvdWriting;

    public String getNameDvdRom() {
        return nameDvdRom;
    }

    public void setNameDvdRom(String nameDvdRom) {
        this.nameDvdRom = nameDvdRom;
    }

    public int getSpeedDvdRom() {
        return speedDvdRom;
    }

    public void setSpeedDvdRom(int speedDvdRom) {
        this.speedDvdRom = speedDvdRom;
    }

    public boolean isDvdWriting() {
        return isDvdWriting;
    }

    public void setDvdWriting(boolean dvdWriting) {
        isDvdWriting = dvdWriting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DvdRom)) {
            return false;
        }
        DvdRom dvdRom = (DvdRom) o;
        return speedDvdRom == dvdRom.speedDvdRom
                && isDvdWriting == dvdRom.isDvdWriting
                && Objects.equals(nameDvdRom, dvdRom.nameDvdRom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDvdRom, speedDvdRom, isDvdWriting);
    }
}
