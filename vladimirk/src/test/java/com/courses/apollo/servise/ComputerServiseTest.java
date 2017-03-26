package com.courses.apollo.servise;

import com.courses.apollo.model.ComputerTestData;
import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.service.ComputerService;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vladimirk on 23.03.17.
 */
public class ComputerServiseTest {

    final Computer computer = ComputerTestData.getComputer();
    final Computer computer1 = ComputerTestData.getOnnComputer();
    ComputerService computerService = new ComputerService();

    @Test
    public void testComputerServiseOn() {
        Assert.assertTrue(computerService.on_(computer));
    }

    @Test
    public void testComputerServiseOff() {
        Assert.assertFalse(computerService.off(computer1));
    }

    @Test
    public void testFindHddSize() {
        final int hddSize = 1286144;
        Assert.assertTrue(hddSize == computerService.findHddSize(computer));
    }

    @Test
    public void testCheckVirus() {
        Assert.assertTrue(computerService.checkVirus(computer));
    }
}
