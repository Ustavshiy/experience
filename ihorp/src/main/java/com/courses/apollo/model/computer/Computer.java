package com.courses.apollo.model.computer;

import java.util.ArrayList;

/**
 * Created by User on 18.03.2017.
 */
public class Computer {

    public Computer() {

    }

    /**
     * Computer Name.
     */
    private String computerName;

    /**
     * This boolean tell us is computer power on.
     */
    private boolean conditionComputer;

    /**
     * Add array list of objects type HardDiskDrive.
     */
    private ArrayList<HardDiskDrive> hardDiskDrives;

    /**
     * Add object type DvdRom.
     */
    private DvdRom dvdRom;

    /**
     * Add object type Ram.
     */
    private Ram ram;

    /**
     * Add object type HardDiskDrive.
     */
    private Cpu cpu;

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public boolean isConditionComputer() {
        return conditionComputer;
    }

    public void setConditionComputer(boolean conditionComputer) {
        this.conditionComputer = conditionComputer;
    }

    public ArrayList<HardDiskDrive> getHardDiskDrives() {
        return hardDiskDrives;
    }

    public void setHardDiskDrives(ArrayList<HardDiskDrive> hardDiskDrives) {
        this.hardDiskDrives = hardDiskDrives;
    }

    public DvdRom getDvdRom() {
        return dvdRom;
    }

    public void setDvdRom(DvdRom dvdRom) {
        this.dvdRom = dvdRom;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}



