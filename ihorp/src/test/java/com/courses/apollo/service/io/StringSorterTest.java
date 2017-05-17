package com.courses.apollo.service.io;

import org.junit.*;

import java.io.*;

public class StringSorterTest {

    private static String testTextFile = "src\\test\\resources\\TestText.txt";
    private static String testText = "fifth fifth fifth fifth fifth fourth fourth fourth fourth third third third second second first";
    private static String answerTextFile = "src\\test\\resources\\AnswerText.txt";
    private static String answerText = "first second third fourth fifth ";


    @BeforeClass
    public static void generateTestText(){
        BufferedWriter writeText = null;
        BufferedWriter writeTextTwo = null;
        try {
            writeText = new BufferedWriter(new FileWriter(new File(testTextFile)));
            writeText.write(testText);
            writeTextTwo = new BufferedWriter(new FileWriter(new File(answerTextFile)));
            writeTextTwo.write(answerText);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
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
