package com.courses.apollo.util.io;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * TextStatisticsUtils test.
 */
public class TextStatisticsUtilsTest {
    FileIOUtils fileIOUtils = new FileIOUtils();
    TextStatisticsUtils textStatisticsUtils = new TextStatisticsUtils();
    String outputPath = "./src/main/resources/textoutput/";
    String outputTestPath = "./src/test/resources/textoutput/";
    String testFileName = "./src/main/resources/textinput/LA DIVINA COMMEDIA DI DANTE ALIGHIERI TEST.txt";
    String testOutputLettersFileName = outputPath + "LettersInDivinaCommedia.txt";
    String testOutputWordsFileName = outputPath + "WordsInDivinaCommedia.txt";
    File testOutputLettersFile = new File(testOutputLettersFileName);
    File testOutputWordsFile = new File(testOutputWordsFileName);

    @Before
    public void before() throws IOException {
        fileIOUtils.writeToFile(testOutputLettersFile, textStatisticsUtils.getLettersStatistics(new File(testFileName)));
        fileIOUtils.writeToFile(testOutputWordsFile, textStatisticsUtils.getWordsStatistics(new File(testFileName)));
    }

    @Test
    public void countSameLettersTest() {
        Assert.assertEquals(fileIOUtils.readFromFile(new File(outputTestPath + "LettersInDivinaCommedia.txt")),
                fileIOUtils.readFromFile(testOutputLettersFile));
    }

    @Test
    public void countSameWordsTest() {
        Assert.assertEquals(fileIOUtils.readFromFile(new File(outputTestPath + "WordsInDivinaCommedia.txt")),
                fileIOUtils.readFromFile(testOutputWordsFile));
    }
}