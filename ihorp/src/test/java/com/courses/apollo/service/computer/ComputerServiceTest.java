package com.courses.apollo.service.computer;

import com.courses.apollo.data.ComputerDataTest;
import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.service.regex.CharMatches;
import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class ComputerServiceTest {

    @Test
    public void TestComputerPowerOn() {
        final boolean computerOn = true;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.setOn(false);

        ComputerService.turnComputerOn(testComputer);
        Assert.assertEquals(computerOn, testComputer.isOn());
    }

    @Test
    public void TestComputerPowerOff() {
        final boolean computerOff = false;

        Computer testComputer = ComputerDataTest.getComputer();
        testComputer.setOn(true);

        ComputerService.turnComputerOff(testComputer);
        Assert.assertEquals(computerOff, testComputer.isOn());
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
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<ComputerService> constructor = ComputerService.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void TestShowCapacityHDD() {
        ComputerService.hddTotalSpace(ComputerDataTest.getComputer());
    }
}
