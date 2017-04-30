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
    static String resourcesPath = "./src/main/resources";
    static String testFolderName = resourcesPath + "/writematches";
    static File testWordsFile = new File(resourcesPath + "/allwords.txt");
    String expectedResultPath = "./src/test/resources/textoutput";

    @Before
    public void before() throws IOException {
        String testText = fileIOUtils.readFromFile(new File("./src/test/resources/textinput/textExamples.txt"));
        fileIOUtils.writeToFile(testWordsFile, substringOutputUtil.getAllWords(testText));
        substringOutputUtil.writeMatches(testFolderName, "/matched.txt", testText, "[a-zA-Z]+@[a-zA-Z]+.[a-zA_Z]+");
    }

    @Test
    public void findMatchedTest() {
        Assert.assertEquals(fileIOUtils.readFromFile(new File(expectedResultPath + "/writematches/matched.txt")),
                fileIOUtils.readFromFile(new File(testFolderName + "/matched.txt")));
    }

    @Test
    public void getAllWords() {
        Assert.assertEquals(fileIOUtils.readFromFile(new File(expectedResultPath + "/allwords.txt")),
                fileIOUtils.readFromFile(testWordsFile));
    }

    @AfterClass
    public static void clean() {
        File dirOne = new File(testFolderName);
        File dirTwo = testWordsFile;
        for (File file : dirOne.listFiles()) {
            file.delete();
        }
        dirTwo.delete();
        dirTwo.delete();
    }
}
