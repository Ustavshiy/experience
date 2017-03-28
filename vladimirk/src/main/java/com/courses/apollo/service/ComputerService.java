package com.courses.apollo.service;

import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.model.computer.HDD;

/**
 * Class for logic methods for computer.
 */
public class ComputerService {

    /**
     * Method to turn on the computer.
     * @param computer is a model of computer;
     * @return changed boolean isOn to true;
     */
    public boolean on_(Computer computer) {
        computer.setIsOn(true);
        return computer.getIsOn();
    }

    /**
     * Method to turn off the computer.
     * @param computer is a model of computer;
     * @return changed boolean isOn to false;
     */
    public boolean off(Computer computer) {
        computer.setIsOn(false);
        return computer.getIsOn();
    }

    /**
     * Method to calculate size of HDD's.
     * @param computer is a model of computer;
     * @return hddsSize is a size of all HDD's in Mb;
     */
    public int findHddSize(Computer computer) {
        int result = 0;
        for (int i = 0; i < computer.getMemories().size(); i++) {
            if (computer.getMemories().get(i) instanceof HDD) {
                result = computer.getMemories().get(i).getSize() + result;
            }
        }
        return result;
    }

    /**
     * Method to check computer on viruses.
     * @param computer is a model of computer;
     * @return changed to true boolean isChecked;
     */
    public boolean checkVirus(Computer computer) {
        computer.setIsChecked(true);
        return computer.getIsChecked();
    }
}
