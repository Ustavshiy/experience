package com.courses.apollo.service.computer;

import com.courses.apollo.model.computer.Computer;
import com.courses.apollo.model.computer.ComputerTestData;
import com.courses.apollo.service.io.RWFileServise;
import org.junit.AfterClass;
import org.junit.Assert;
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
    private final static CmptrFileIOSrvs cmptrFileIOSrvs = new CmptrFileIOSrvs();
    private final static RWFileServise rwFileServise = new RWFileServise();
    private final static  String compIOExeptPath = "./src/main/resourses/CompIOExept.txt";
    private final static  String saveExeptFilePath = "./src/main/resourses/SaveExept.txt";
    private final static  String loadExeptFilePath = "./src/main/resourses/LoadExept.txt";
    private final static String resourseDirPath = "./src/main/resourses";

    @Test
    public void LoadComputerExceptionTest() {
        cmptrFileIOSrvs.loadObjectsFromFile("", loadExeptFilePath);
        Assert.assertEquals(rwFileServise.readFile(loadExeptFilePath), FileNotFoundException.class.toString());
    }

    @Test
    public void SaveComputerExceptionTest() {
        cmptrFileIOSrvs.saveComputer(computer, "", saveExeptFilePath);
        Assert.assertEquals(rwFileServise.readFile(saveExeptFilePath), FileNotFoundException.class.toString());
    }

    @Test
    public void cmptrFileIOSrvsTest() throws IOException, ClassNotFoundException {
        cmptrFileIOSrvs.saveComputer(computer, outSourceFilePath, compIOExeptPath);
        Assert.assertEquals(computer, cmptrFileIOSrvs.loadObjectsFromFile(outSourceFilePath, compIOExeptPath));
    }

    @AfterClass
    public static void deleteAllFilesFolder() {
        for (File file : new File(resourseDirPath).listFiles()) {
            if (!file.getName().equals(".gitkeep")) {
                    file.delete();
            }
        }
    }
}