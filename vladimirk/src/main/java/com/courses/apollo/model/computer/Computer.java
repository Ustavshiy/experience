package com.courses.apollo.model.computer;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Computer.
 */
public class Computer {

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
}


