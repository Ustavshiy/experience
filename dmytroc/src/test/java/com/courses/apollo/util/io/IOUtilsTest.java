package com.courses.apollo.util.io;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

/**
 * IOUtils test.
 */
public class IOUtilsTest {
    IOUtils ioUtil = new IOUtils();
    String testFileName = "./src/main/resources/LA DIVINA COMMEDIA DI DANTE ALIGHIERI.txt";
    File testFile = new File(testFileName);
    String text;
    String testWord = "ch'era";
    Character testChar = 'n';
    Integer expectedResultCountWords = 27;
    Integer expectedResultCountChars = 26689;


    @Before
    public void ioTestData() {
        text = ioUtil.readFromFile(testFile);

    }

    @Test
    public void countSameWordsTest() {
        Assert.assertEquals(expectedResultCountWords, ioUtil.countSameWords(testFile, testWord));
    }

    @Test
    public void countSameLettersTest(){
        Assert.assertEquals(expectedResultCountChars, ioUtil.countSameLetters(testFile, testChar));
    }
}
