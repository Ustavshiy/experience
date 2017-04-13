package com.courses.apollo.util.io;

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
    String testOutputLettersFileName = "./src/main/resources/LettersInDivinaCommedia.txt";
    File testOutputLettersFile = new File(testOutputLettersFileName);
    String testOutputWordsFileName = "./src/main/resources/WordsInDivinaCommedia.txt";
    File testOutputWordsFile = new File(testOutputWordsFileName);
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
    public void countSameLettersTest() {
        ioUtil.writeToFile(testOutputLettersFile,ioUtil.getLettersStatistics(testFile));
    }
    @Test
    public void countSameWordsTest() {
        ioUtil.writeToFile(testOutputWordsFile,ioUtil.getWordsStatistics(testFile));
    }
}
