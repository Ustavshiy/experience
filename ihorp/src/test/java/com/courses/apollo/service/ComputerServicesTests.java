package com.courses.apollo.service;

import com.courses.apollo.data.ComputerDataTest;
import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.service.computer.ComputerPowerOff;
import com.courses.apollo.service.computer.ComputerPowerOn;
import com.courses.apollo.service.computer.DetectViruses;
import com.courses.apollo.service.computer.ShowCapacityHDD;
import org.junit.Test;
import org.junit.Assert;

public class ComputerServicesTests {

    @Test
    public void TestComputerPowerOn() {
        final boolean computerOn = true;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.setConditionComputer(false);

        ComputerPowerOn.turnComputerOn(testComputer);
        Assert.assertEquals(computerOn, testComputer.isConditionComputer());
    }

    @Test
    public void TestComputerPowerOff() {
        final boolean computerOff = false;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.setConditionComputer(true);

        ComputerPowerOff.turnComputerOff(testComputer);
        Assert.assertEquals(computerOff, testComputer.isConditionComputer());
    }

    @Test
    public void TestForViruses1() {
        final boolean isVirus = true;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.getHardDiskDrives().get(0).setHasViruses(true);
        testComputer.getHardDiskDrives().get(1).setHasViruses(false);

        Assert.assertEquals(DetectViruses.virusesDetected(testComputer), isVirus);
    }

    @Test
    public void TestForViruses2() {
        final boolean isVirus = true;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.getHardDiskDrives().get(0).setHasViruses(false);
        testComputer.getHardDiskDrives().get(1).setHasViruses(true);

        Assert.assertEquals(DetectViruses.virusesDetected(testComputer), isVirus);
    }

    @Test
    public void TestForViruses3() {
        final boolean isVirus = false;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.getHardDiskDrives().get(0).setHasViruses(false);
        testComputer.getHardDiskDrives().get(1).setHasViruses(false);

        Assert.assertEquals(DetectViruses.virusesDetected(testComputer), isVirus);
    }

    @Test
    public void TestForViruses4() {
        final boolean isVirus = true;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.getHardDiskDrives().get(0).setHasViruses(true);
        testComputer.getHardDiskDrives().get(1).setHasViruses(true);

        Assert.assertEquals(DetectViruses.virusesDetected(testComputer), isVirus);
    }

    @Test
    public void TestShowCapacityHDD() {
        ShowCapacityHDD.printTotalSpace(ComputerDataTest.getComputer());
    }
}
