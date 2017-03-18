package com.courses.apollo.model.computer;

/**
 * Constructor of Hard Drive.
 */
public class HardDiskDrive {

    public HardDiskDrive() {

    }

    /**
     * Name of HDD.
     */
    private String nameHdd;

    /**
     * Boolean to check is HHD has viruses.
     */
    private boolean isHasViruses;

    /**
     * Capacity of HDD, gB.
     */
    private int capacityHdd;

    /**
     * Form factor of HDD, 2.5", 3.5".
     */
    private double formFactorHdd;

    /**
     * Interface of HDD, SATA, SATA2.
     */
    private String interfaceHdd;

    public String getNameHdd() {
        return nameHdd;
    }

    public void setNameHdd(String nameHdd) {
        this.nameHdd = nameHdd;
    }

    public boolean isHasViruses() {
        return isHasViruses;
    }

    public void setHasViruses(boolean hasViruses) {
        isHasViruses = hasViruses;
    }

    public int getCapacityHdd() {
        return capacityHdd;
    }

    public void setCapacityHdd(int capacityHdd) {
        this.capacityHdd = capacityHdd;
    }

    public double getFormFactorHdd() {
        return formFactorHdd;
    }

    public void setFormFactorHdd(double formFactorHdd) {
        this.formFactorHdd = formFactorHdd;
    }

    public String getInterfaceHdd() {
        return interfaceHdd;
    }

    public void setInterfaceHdd(String interfaceHdd) {
        this.interfaceHdd = interfaceHdd;
    }
}
