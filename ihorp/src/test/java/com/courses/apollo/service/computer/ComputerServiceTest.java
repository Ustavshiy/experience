package com.courses.apollo.service.computer;

import com.courses.apollo.data.ComputerDataTest;
import com.courses.apollo.model.computer.Computer;
import org.junit.Test;
import org.junit.Assert;

public class ComputerServiceTest {

    @Test
    public void TestComputerPowerOn() {
        final boolean computerOn = true;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.setConditionComputer(false);

        ComputerService.turnComputerOn(testComputer);
        Assert.assertEquals(computerOn, testComputer.isConditionComputer());
    }

    @Test
    public void TestComputerPowerOff() {
        final boolean computerOff = false;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.setConditionComputer(true);

        ComputerService.turnComputerOff(testComputer);
        Assert.assertEquals(computerOff, testComputer.isConditionComputer());
    }

    @Test
    public void TestForViruses1() {
        final boolean isVirus = true;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.getHardDiskDrives().get(0).setHasViruses(true);
        testComputer.getHardDiskDrives().get(1).setHasViruses(false);

        Assert.assertEquals(ComputerService.virusesDetected(testComputer), isVirus);
    }

    @Test
    public void TestForViruses2() {
        final boolean isVirus = true;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.getHardDiskDrives().get(0).setHasViruses(false);
        testComputer.getHardDiskDrives().get(1).setHasViruses(true);

        Assert.assertEquals(ComputerService.virusesDetected(testComputer), isVirus);
    }

    @Test
    public void TestForViruses3() {
        final boolean isVirus = false;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.getHardDiskDrives().get(0).setHasViruses(false);
        testComputer.getHardDiskDrives().get(1).setHasViruses(false);

        Assert.assertEquals(ComputerService.virusesDetected(testComputer), isVirus);
    }

    @Test
    public void TestForViruses4() {
        final boolean isVirus = true;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.getHardDiskDrives().get(0).setHasViruses(true);
        testComputer.getHardDiskDrives().get(1).setHasViruses(true);

        Assert.assertEquals(ComputerService.virusesDetected(testComputer), isVirus);
    }

    @Test
    public void TestShowCapacityHDD() {
        ComputerService.hddTotalSpace(ComputerDataTest.getComputer());
    }
}
