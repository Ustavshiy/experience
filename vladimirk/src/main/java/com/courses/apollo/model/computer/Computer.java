package com.courses.apollo.model.computer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class Computer.
 */
public class Computer implements Serializable {

    /**
     * @param memories indicate list of hdd drives, odd drives and ram in Mb.
     */
    private List<Memory> memories = new ArrayList<>();

    /**
     * @param cpu indicate processor data.
     */
    private CPU cpu;

    /**
     * @param isOn.
     */
    private boolean isOn;

    /**
     * @param isChecked.
     */
    private boolean isChecked;

    public List<Memory> getMemories() {
        return memories;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public Computer(List<Memory> memories, CPU cpu, boolean isOn, boolean isChecked) {
        this.memories = memories;
        this.cpu = cpu;
        this.isOn = isOn;
        this.isChecked = isChecked;
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
                && isChecked == computer.isChecked
                && Objects.equals(memories, computer.memories)
                && Objects.equals(cpu, computer.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memories, cpu, isOn, isChecked);
    }
}