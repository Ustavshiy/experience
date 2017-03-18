package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;

/**
 * Created by Ihor Pronko.
 */
public final class ComputerPowerOff {

    private ComputerPowerOff() {}

    /**
     * This method turns on the computer.
     * @param computer is the object type Computer which need to be turned off.
     */
    public static void turnComputerOff(Computer computer) {
        computer.setConditionComputer(false);
    }
}
