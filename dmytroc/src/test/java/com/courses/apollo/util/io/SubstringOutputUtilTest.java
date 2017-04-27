package com.courses.apollo.util.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * SubstringOutputUtil test.
 */
public class SubstringOutputUtilTest {
    FileIOUtils fileIOUtils = new FileIOUtils();
    SubstringOutputUtil substringOutputUtil = new SubstringOutputUtil();
    String testText;
    String matcher = "[a-zA-Z]+@[a-zA-Z]+.[a-zA_Z]+";
    static String outputPath = "./src/main/resources";
    String testOutputPath = "./src/test/resources/textoutput";
    static String testFolderName = outputPath + "/writematches";
    String testMatchedFileName = "/matched.txt";
    File testMatchedFile = new File(testFolderName + "/" + testMatchedFileName);
    static String testAllWordsFileName = outputPath + "/allwords.txt";
    File testAllWordsFile = new File(testAllWordsFileName);

    @Before
    public void before() throws IOException {
        testText = fileIOUtils.readFromFile(new File("./src/test/resources/textinput/textExamples.txt"));
        fileIOUtils.writeToFile(testAllWordsFile, substringOutputUtil.getAllWords(testText));
        substringOutputUtil.writeMatches(testFolderName, testMatchedFileName, testText, matcher);
    }

    @Test
    public void findMatchedTest() {
        Assert.assertEquals(fileIOUtils.readFromFile(new File(testOutputPath + "/writematches/matched.txt")),
                fileIOUtils.readFromFile(testMatchedFile));
    }

    @Test
    public void getAllWords() {
        Assert.assertEquals(fileIOUtils.readFromFile(new File(testOutputPath + "/allwords.txt")),
                fileIOUtils.readFromFile(testAllWordsFile));
    }

    @AfterClass
    public static void clean() {
        File dirOne = new File(testFolderName);
        File dirTwo = new File(testAllWordsFileName);
        for (File file : dirOne.listFiles()) {
            file.delete();
        }
        dirTwo.delete();
        dirTwo.delete();
    }
}
