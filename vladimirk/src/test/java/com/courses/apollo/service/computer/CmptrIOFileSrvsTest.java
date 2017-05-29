package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.model.computer.ComputerTestData;
import com.courses.apollo.service.io.RWFileServise;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Class for testing CmptrIOFileSrvs class.
 */
public class CmptrIOFileSrvsTest {
    private final static Computer computer = ComputerTestData.getComputer();
    private final static  String outSourceFilePath = "./src/main/resourses/Computer.txt";
    private final static  String exeptionsFilePath = "./src/main/resourses/Exeptions.txt";
    private final static CmptrFileIOSrvs cmptrFileIOSrvs = new CmptrFileIOSrvs();
    private final static RWFileServise rwFileServise = new RWFileServise();

    @BeforeClass
    public static void beforeLoadComputerExceptionTest() {
        cmptrFileIOSrvs.loadObjectsFromFile("", exeptionsFilePath);
    }
    @Test
    public void LoadComputerExceptionTest() {
        Assert.assertEquals(rwFileServise.readFile(exeptionsFilePath), FileNotFoundException.class.toString());
    }
    @AfterClass
    public static void cleanUpLoadComputerExceptionTest() {
        new File(exeptionsFilePath).delete();
    }

    @BeforeClass
    public static void beforeSaveComputerExceptionTest() {
        cmptrFileIOSrvs.saveComputer(computer, "", exeptionsFilePath);
    }
    @Test
    public void SaveComputerExceptionTest() {
        Assert.assertEquals(rwFileServise.readFile(exeptionsFilePath), FileNotFoundException.class.toString());
    }
    @AfterClass
    public static void cleanUpSaveComputerExceptionTest() {
        new File(exeptionsFilePath).delete();
    }

    @BeforeClass
    public static void beforecmptrFileIOSrvsTest() {
        cmptrFileIOSrvs.saveComputer(computer, outSourceFilePath, exeptionsFilePath);
    }
    @Test
    public void cmptrFileIOSrvsTest() throws IOException, ClassNotFoundException {
        Assert.assertEquals(computer, cmptrFileIOSrvs.loadObjectsFromFile(outSourceFilePath, exeptionsFilePath));
    }
    @AfterClass
    public static void cleanUpcmptrFileIOSrvsTest() {
        new File(outSourceFilePath).delete();
    }
}