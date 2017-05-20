package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Test class for FindStdntsAvgMarkMore7.
 */
public class FindStdntsAvgMarkMoreGivenTest {
    FindStdntsAvgMarkMoreGiven findStdntsAvgMarkMoreGiven = new FindStdntsAvgMarkMoreGiven();
    RWFileServise rwFileServise = new RWFileServise();
    private final static  String inFilePath = "./src/test/resourses/InJournal.txt";
    private final static  String outFilePath = "./src/main/resourses/ResultJournal.txt";
    private final static double givenAvgMark = 7.0;
    private final static String expected = "[SIDOROV, PUPKIN, LOPATIN]";
    private final static boolean isAdd = true;

    @Test
    public void findSNofStdntsAvgMarkMoreTest() {
        Assert.assertEquals(expected,
                findStdntsAvgMarkMoreGiven.findSNofStdntsAvgMarkMore(inFilePath, givenAvgMark).toString());
    }

    @Test
    public void copyJrnlAddSNOfStdntsTest() {
        findStdntsAvgMarkMoreGiven.copyJrnlAddSNOfStdnts(outFilePath, inFilePath, givenAvgMark, isAdd);
        Assert.assertEquals(rwFileServise.readFile(outFilePath),
                rwFileServise.readFile(inFilePath).concat("\n" + "SIDOROV" + "\n" + "PUPKIN" + "\n" + "LOPATIN"));
    }

    @AfterClass
    public static void cleanUp() {
        new File(outFilePath).delete();
    }
}