package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.model.computer.HardDiskDrive;

/**
 * This class contains all methods of Computer task.
 */
public final class ComputerService {

    private ComputerService() {}

    /**
     * This method turns on the computer.
     * @param computer is the object type Computer which need to be turned off.
     */
    public static void turnComputerOff(Computer computer) {
        computer.setOn(false);
    }


    /**
     * This method turns on the computer.
     * @param computer is the object type Computer which need to be turned on.
     */
    public static void turnComputerOn(Computer computer) {
        computer.setOn(true);
    }

    /**
     * This method checks computer for viruses.
     * @param computer is type of Computer.
     * @return true - if viruses find, false if computer doesn't have viruses.
     */
    public static boolean virusesDetected(Computer computer) {
        for (HardDiskDrive i : computer.getHardDiskDrives()) {
            if (i.isHasViruses()) {
                return true;
            }
        }
        return false;
    }

    /**
     * The method calculate space of all of hdd disks in the computer.
     * @param computer is the object type Computer.
     */
    public static int hddTotalSpace(Computer computer) {
        int hddSpace = 0;
        for (int i = 0; i < computer.getHardDiskDrives().size(); i++) {
            hddSpace += computer.getHardDiskDrives().get(i).getCapacityHdd();
        }
        return hddSpace;
    }
}

