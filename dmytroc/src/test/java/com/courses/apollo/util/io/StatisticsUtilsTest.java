package com.courses.apollo.util.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

/**
 * StatisticsUtils test.
 */
public class StatisticsUtilsTest {
    FileIOUtils fileUtils = new FileIOUtils();
    StatisticsUtils statisticsUtils = new StatisticsUtils();
    String testFileName = "./src/main/resources/textinput/LA DIVINA COMMEDIA DI DANTE ALIGHIERI TEST.txt";
    File testFile = new File(testFileName);
    String testOutputLettersFileName = "./src/main/resources/textoutput/LettersInDivinaCommedia.txt";
    File testOutputLettersFile = new File(testOutputLettersFileName);
    String expectedOutputLettersFileName = "./src/test/resources/textoutput/LettersInDivinaCommedia.txt";
    File expectedOutputLettersFile = new File(expectedOutputLettersFileName);
    String testOutputWordsFileName = "./src/main/resources/textoutput/WordsInDivinaCommedia.txt";
    File testOutputWordsFile = new File(testOutputWordsFileName);
    String expectedOutputWordsFileName = "./src/test/resources/textoutput/WordsInDivinaCommedia.txt";
    File expectedOutputWordsFile = new File(expectedOutputWordsFileName);

    @Test
    public void countSameLettersTest() {
        fileUtils.writeToFile(testOutputLettersFile, statisticsUtils.getLettersStatistics(testFile));
        Assert.assertEquals(fileUtils.readFromFile(expectedOutputLettersFile),
                fileUtils.readFromFile(testOutputLettersFile));
    }

    @Test
    public void countSameWordsTest() {
        fileUtils.writeToFile(testOutputWordsFile, statisticsUtils.getWordsStatistics(testFile));
        Assert.assertEquals(fileUtils.readFromFile(expectedOutputWordsFile),
                fileUtils.readFromFile(testOutputWordsFile));
    }

}
