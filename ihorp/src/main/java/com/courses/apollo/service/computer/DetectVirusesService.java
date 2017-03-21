package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;

/**
 * This class created for the method that defines is the computer had viruses.
 */
public final class DetectVirusesService {

    private DetectVirusesService() {}

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
}
