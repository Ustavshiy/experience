package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.model.computer.ComputerTestData;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Class for testing CmptrIOFileSrvs class.
 */
public class CmptrIOFileSrvsTest {
    Computer computer = ComputerTestData.getComputer();
    private final static  String outSourceFilePath = "./src/main/resourses/Computer.txt";
    CmptrFileIOSrvs cmptrFileIOSrvs = new CmptrFileIOSrvs();

    @Test(expected = IOException.class)
    public void LoadComputerExceptionTest() throws IOException, ClassNotFoundException {
        cmptrFileIOSrvs.loadObjectsFromFile("");
    }

    @Test(expected = IOException.class)
    public void SaveComputerExceptionTest() throws IOException {
        cmptrFileIOSrvs.saveComputer(computer, "");
    }

    @Test
    public void cmptrFileIOSrvsTest() throws IOException, ClassNotFoundException {
        cmptrFileIOSrvs.saveComputer(computer, outSourceFilePath);
        Assert.assertEquals(computer, cmptrFileIOSrvs.loadObjectsFromFile(outSourceFilePath));
    }

    @AfterClass
    public static void cleanUp() {
        new File(outSourceFilePath).delete();
    }
}