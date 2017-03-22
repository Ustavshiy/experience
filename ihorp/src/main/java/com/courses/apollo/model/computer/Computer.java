package com.courses.apollo.model.computer;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Constructor of Computer.
 */
public final class Computer {

    /**
     * Computer Name.
     */
    private String computerName;

    /**
     * This boolean tell us is computer power on.
     */
    private boolean isOn;

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

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        this.isOn = on;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Computer)) {
            return false;
        }
        Computer computer = (Computer) o;
        return isOn == computer.isOn
                && Objects.equals(computerName, computer.computerName)
                && Objects.equals(hardDiskDrives, computer.hardDiskDrives)
                && Objects.equals(dvdRom, computer.dvdRom)
                && Objects.equals(ram, computer.ram)
                && Objects.equals(cpu, computer.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerName, isOn, hardDiskDrives, dvdRom, ram, cpu);
    }
}



