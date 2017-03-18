package com.courses.apollo.model.computer;

/**
 * Constructor of CPU.
 * */
public class Cpu {

    public Cpu() {

    }

    /**
     * Name of CPU.
     */
    private String nameCpu;

    /**
     * Frequency of CPU. mHz.
     */
    private int frequencyCpu;

    /**
     * Lithography of CPU, nM.
     */
    private int lithographyCpu;

    /**
     * TDP of CPU, W.
     */
    private int tdpCpu;

    public String getNameCpu() {
        return nameCpu;
    }

    public void setNameCpu(String nameCpu) {
        this.nameCpu = nameCpu;
    }

    public int getFrequencyCpu() {
        return frequencyCpu;
    }

    public void setFrequencyCpu(int frequencyCpu) {
        this.frequencyCpu = frequencyCpu;
    }

    public int getLithographyCpu() {
        return lithographyCpu;
    }

    public void setLithographyCpu(int lithographyCpu) {
        this.lithographyCpu = lithographyCpu;
    }

    public int getTdpCpu() {
        return tdpCpu;
    }

    public void setTdpCpu(int tdpCpu) {
        this.tdpCpu = tdpCpu;
    }
}
