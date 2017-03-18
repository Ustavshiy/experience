package com.courses.apollo.model.computer;

/**
 * Constructor of DVDRom.
 */
public class DvdRom {

    public DvdRom() {

    }

    /**
     * Name of DVD ROM.
     */
    private String nameDvdRom;

    /**
     * Speed of DVD ROM, *x.
     */
    private String speedDvdRom;

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

    public String getSpeedDvdRom() {
        return speedDvdRom;
    }

    public void setSpeedDvdRom(String speedDvdRom) {
        this.speedDvdRom = speedDvdRom;
    }

    public boolean isDvdWriting() {
        return isDvdWriting;
    }

    public void setDvdWriting(boolean dvdWriting) {
        isDvdWriting = dvdWriting;
    }
}
