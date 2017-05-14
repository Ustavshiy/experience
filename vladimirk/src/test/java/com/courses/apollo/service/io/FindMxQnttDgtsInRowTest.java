package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import java.io.File;

/**
 * Created by vladimirk on 07.05.17.
 */
public class FindMxQnttDgtsInRowTest {
    FindMxQnttNmbrInRow findMxQnttNmbrInRow = new FindMxQnttNmbrInRow();
    RWFileServise readWriteFile = new RWFileServise();
    private final static  String inFilePath = "./src/test/resourses/InTextForTest.txt";
    private final static  String outFilePath = "./src/main/resourses/Result.txt";
    private final static String expected = "13";

    @Test
    public void isFileCreatedTest() {
        findMxQnttNmbrInRow.findMaxQnttNmbrInRow(inFilePath, outFilePath);
        Assert.assertEquals(readWriteFile.readFile(outFilePath), expected);
    }

    @AfterClass
    public static void cleanUp() {
        new File(outFilePath).delete();
    }
}