package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;

/**
 * This class contains all methods of Computer task.
 */
public class ComputerService {

    private ComputerService() {}

    /**
     * This method turns on the computer.
     * @param computer is the object type Computer which need to be turned off.
     */
    public static void turnComputerOff(Computer computer) {
        computer.setConditionComputer(false);
    }


    /**
     * This method turns on the computer.
     * @param computer is the object type Computer which need to be turned on.
     */
    public static void turnComputerOn(Computer computer) {
        computer.setConditionComputer(true);
    }

    /**
     * This method checks computer for viruses.
     * @param computer is type of Computer.
     * @return true - if viruses find, false if computer doesn't have viruses.
     */
    public static boolean virusesDetected(Computer computer) {
        boolean virusDetect = false;
        for (int i = 0; i < computer.getHardDiskDrives().size(); i++) {
            if (computer.getHardDiskDrives().get(i).isHasViruses()) {
                virusDetect = true;
            }
        }
        return virusDetect;
    }

    /**
     * The method calculate space of all of hdd disks in the computer.
     * @param computer is the object type Computer.
     */
    public static void hddTotalSpace(Computer computer) {
        int hddSpace = 0;
        for (int i = 0; i < computer.getHardDiskDrives().size(); i++) {
            hddSpace += computer.getHardDiskDrives().get(i).getCapacityHdd();
        }
        System.out.println(hddSpace);
    }
}

