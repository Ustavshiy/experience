package com.courses.apollo.util.io;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * SubstringOutputUtil test.
 */
public class SubstringOutputUtilTest {
    FileIOUtils fileUtils = new FileIOUtils();
    SubstringOutputUtil substringOutputUtil = new SubstringOutputUtil();
    String testExamplesFileName = "./src/main/resources/textinput/textExamples.txt";
    File testExamplesFile = new File(testExamplesFileName);
    String testFolderName = "./src/main/resources/textoutput/writematches";
    String testMatchedFileName = "matched.txt";
    File testMatchedFile = new File(testFolderName + "/" + testMatchedFileName);
    String expectedMatchedFileName = "./src/test/resources/textoutput/writematches/matched.txt";
    File expectedMatchedFile = new File(expectedMatchedFileName);
    String testAllWordsFileName = "./src/main/resources/textoutput/allwords.txt";
    File testAllWordsFile = new File(testAllWordsFileName);
    String expectedAllWordsFileName = "./src/test/resources/textoutput/allwords.txt";
    File expectedAllWordsFile = new File(expectedAllWordsFileName);

    @Before
    public void before() {
        String testText = fileUtils.readFromFile(testExamplesFile);
    }

    @Test
    public void findMatchedTest() {
        String testText = fileUtils.readFromFile(testExamplesFile);
        String matcher = "[a-zA-Z]+@[a-zA-Z]+.[a-zA_Z]+";
        substringOutputUtil.writeMatches(testFolderName, testMatchedFileName, testText, matcher);
        Assert.assertEquals(fileUtils.readFromFile(expectedMatchedFile),
                fileUtils.readFromFile(testMatchedFile));
    }

    @Test
    public void getAllWords() {
        String testText = fileUtils.readFromFile(testExamplesFile);
        fileUtils.writeToFile(testAllWordsFile, substringOutputUtil.getAllWords(testText));
        Assert.assertEquals(fileUtils.readFromFile(expectedAllWordsFile),
                fileUtils.readFromFile(testAllWordsFile));
    }
}
