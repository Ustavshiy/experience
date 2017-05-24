package com.courses.apollo.service.io;

import org.junit.*;

import java.io.*;
import java.nio.file.Files;

import static java.nio.charset.StandardCharsets.UTF_8;

public class StringSorterTest {

    private static String testTextFile = "src\\test\\resources\\TestText.txt";
    private static String testText = "fifth fifth fifth fifth fifth fourth fourth fourth fourth third third third second second first";
    private static String answerTextFile = "src\\test\\resources\\AnswerText.txt";
    private static String answerText = "first second third fourth fifth ";


    @BeforeClass
    public static void generateTestText() {
        BufferedWriter writeText = null;
        BufferedWriter writeTextTwo = null;
        try {
            writeText = Files.newBufferedWriter(new File(testTextFile).toPath(), UTF_8);
            writeText.write(testText);
            writeTextTwo = Files.newBufferedWriter(new File(answerTextFile).toPath(), UTF_8);
            writeTextTwo.write(answerText);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writeText.flush();
                writeTextTwo.flush();
                writeText.close();
                writeTextTwo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testSortStringByNumberOfWords() {
        Assert.assertEquals(StringSorter.sortStringByNumberOfWords(testText), answerText);
    }

    @AfterClass
    public static void deleteFiles() {
        File deleteFile = new File(testTextFile);
        File deleteFileTwo = new File(answerTextFile);
        deleteFile.delete();
        deleteFileTwo.delete();
    }


}
