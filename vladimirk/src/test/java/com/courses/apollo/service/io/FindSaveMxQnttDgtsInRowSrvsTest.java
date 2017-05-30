package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.File;

/**
 * Test Class for FindSaveMxQnttDgtsInRow.
 */
public class FindSaveMxQnttDgtsInRowSrvsTest {
    private final static RWFileServise readWriteFile = new RWFileServise();
    private final static  String inFilePath = "./src/test/resourses/InTextForTest.txt";
    private final static  String outFilePath = "./src/main/resourses/Result.txt";
    private final static String expected = "13";
    private final static boolean isAdd = false;
    private final static String InText = "Some text for testing the method for finding the longest number\n" +
            "digits in a row in a given text (1 task)\n" +
            "wk23 34934r dflgbkl 4545343\n" +
            "456789i\n" +
            "67676 6786786 dfgfd343532324e45er45354343\n" +
            "1234567891011d 787867\n" +
            "Expected result = 13;";

    @BeforeClass
    public static void before() {
        readWriteFile.writeFile(InText, inFilePath, false);
        new FindSaveMxQnttNmbrInRowSrvs().findAndSaveMaxQnttNmbrInRow(inFilePath,outFilePath,isAdd);

    }

    @Test
    public void findAndSaveMaxQnttNmbrInRowTest() {
        Assert.assertEquals(readWriteFile.readFile(outFilePath), expected);
    }

    @AfterClass
    public static void cleanUp() {
        new File(outFilePath).delete();
        new File(inFilePath).delete();
    }
}