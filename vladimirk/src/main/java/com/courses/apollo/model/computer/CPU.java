package com.courses.apollo.model.computer;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class CPU.
 */
public class CPU implements Serializable{

    /**
     * @param frequency to indicate CPU frequency.
     */
    private double frequency;

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    /**
     *Constructor.
     * @param frequency to indicate CPU frequency.
     */
    public CPU(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CPU)) return false;
        CPU cpu = (CPU) o;
        return Double.compare(cpu.frequency, frequency) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency);
    }
}
