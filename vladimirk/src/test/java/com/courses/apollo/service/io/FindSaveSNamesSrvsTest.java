package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

/**
 * Test class for FindSaveSNamesSrvs.
 */
public class FindSaveSNamesSrvsTest {
    private final static RWFileServise rwFileServise = new RWFileServise();
    private final static FindSaveSNamesSrvs findSaveSNamesSrvs = new FindSaveSNamesSrvs();
    private final static  String inFilePath = "./src/test/resourses/InJournal.txt";
    private final static  String outFilePath = "./src/main/resourses/ResultJournal.txt";
    private final static double givenAvgMark = 7.0;
    private final static String expected = "[Sidorov, Pupkin, Lopatin]";
    private final static boolean isAdd = true;

    @Test
    public void fndSNameIfAvgMarkMoreTest() {
        Assert.assertEquals(expected,
                findSaveSNamesSrvs.fndSNameIfAvgMarkMore(inFilePath, givenAvgMark).toString());
    }

    @BeforeClass
    public static void before() {
        findSaveSNamesSrvs.copyJrnlAddSNames(outFilePath, inFilePath, givenAvgMark, isAdd);
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