package com.courses.apollo.model.computer;

import java.util.Objects;

/**
 * Constructor of CPU.
 * */
public class Cpu {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cpu)) {
            return false;
        }
        Cpu cpu = (Cpu) o;
        return frequencyCpu == cpu.frequencyCpu
                && lithographyCpu == cpu.lithographyCpu
                && tdpCpu == cpu.tdpCpu
                && Objects.equals(nameCpu, cpu.nameCpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCpu, frequencyCpu, lithographyCpu, tdpCpu);
    }
}
