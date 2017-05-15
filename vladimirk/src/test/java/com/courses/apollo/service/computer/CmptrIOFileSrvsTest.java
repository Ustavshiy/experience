package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.model.computer.ComputerTestData;
import org.junit.Assert;
import org.junit.Test;

/**
 * Class for testing CmptrIOFileSrvs class.
 */
public class CmptrIOFileSrvsTest {
    Computer computer = ComputerTestData.getComputer();
    CmptrFileIOSrvs cmptrFileIOSrvs = new CmptrFileIOSrvs();
    private final static  String outSourceFilePath = "./src/main/resourses/Computer.txt";

    @Test
    public void cmptrFileIOSrvsTest() {
        cmptrFileIOSrvs.saveComputer(computer, outSourceFilePath);
        Assert.assertEquals(computer, cmptrFileIOSrvs.loadObjectsFromFile(outSourceFilePath).get(0));
        System.out.println(computer.toString());
        System.out.println(cmptrFileIOSrvs.loadObjectsFromFile(outSourceFilePath).get(0).toString());
    }
}