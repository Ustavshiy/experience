package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;

/**
 * This class create to method which print all space in computer.
 */
public final class ShowCapacityHDD {

    private ShowCapacityHDD() {}

    /**
     * The method calculate space of all of hdd disks in the computer.
     * @param computer is the object type Computer.
     */
    public static void printTotalSpace(Computer computer) {
        int hddSpace = 0;
        for (int i = 0; i < computer.getHardDiskDrives().size(); i++) {
            hddSpace += computer.getHardDiskDrives().get(i).getCapacityHdd();
        }
        System.out.println(hddSpace);
    }
}
