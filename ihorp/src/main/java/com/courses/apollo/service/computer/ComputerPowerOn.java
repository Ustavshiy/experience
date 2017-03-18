package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;

/**
 * Created by Ihor Pronko.
 */
public final class ComputerPowerOn {

    private ComputerPowerOn() {}

    /**
     * This method turns on the computer.
     * @param computer is the object type Computer which need to be turned on.
     */
    public static void turnComputerOn(Computer computer) {
        computer.setConditionComputer(true);
    }
}
