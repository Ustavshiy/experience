package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

/**
 * Test class for FindSaveSNamesIfAvgMarkMoreGiven.
 */
public class FindSaveSNamesIfAvgMarkMoreGivenTest {
    private final static RWFileServise rwFileServise = new RWFileServise();
    private final static FindSaveSNamesIfAvgMarkMoreGiven findSaveSNamesIfAvgMarkMoreGiven =
            new FindSaveSNamesIfAvgMarkMoreGiven();
    private final static  String inFilePath = "./src/test/resourses/InJournal.txt";
    private final static  String outFilePath = "./src/main/resourses/ResultJournal.txt";
    private final static double givenAvgMark = 7.0;
    private final static String expected = "[Sidorov, Pupkin, Lopatin]";
    private final static boolean isAdd = true;

    @Test
    public void fndSNameIfAvgMarkMoreTest() {
        Assert.assertEquals(expected,
                findSaveSNamesIfAvgMarkMoreGiven.fndSNameIfAvgMarkMore(inFilePath, givenAvgMark).toString());
    }

    @BeforeClass
    public static void before() {
        findSaveSNamesIfAvgMarkMoreGiven.copyJrnlAddSNames(outFilePath, inFilePath, givenAvgMark, isAdd);
    }
    @Test
    public void copyJrnlAddSNamesTest() {
        Assert.assertEquals(rwFileServise.readFile(outFilePath),
                rwFileServise.readFile(inFilePath).concat("\n" + "SIDOROV" + "\n" + "PUPKIN" + "\n" + "LOPATIN"));
    }
    @AfterClass
    public static void cleanUp() {
        new File(outFilePath).delete();
    }
}