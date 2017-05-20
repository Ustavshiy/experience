package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import java.io.File;

/**
 * Test Class for FindMxQnttDgtsInRow.
 */
public class FindMxQnttDgtsInRowTest {
    FindMxQnttNmbrInRow findMxQnttNmbrInRow = new FindMxQnttNmbrInRow();
    RWFileServise readWriteFile = new RWFileServise();
    private final static  String inFilePath = "./src/test/resourses/InTextForTest.txt";
    private final static  String outFilePath = "./src/main/resourses/Result.txt";
    private final static String expected = "13";
    private final static boolean isAdd = false;

    @Test
    public void isFileCreatedTest() {
        findMxQnttNmbrInRow.findMaxQnttNmbrInRow(inFilePath, outFilePath, isAdd);
        Assert.assertEquals(readWriteFile.readFile(outFilePath), expected);
    }

    @AfterClass
    public static void cleanUp() {
        new File(outFilePath).delete();
    }
}