package com.courses.apollo.service.io;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class StringSorterTest {

    String testTextFile = "src\\main\\resources\\TestText.txt";
    String testText = "fifth fifth fifth fifth fifth fourth fourth fourth fourth third third third second second first";
    String answerTextFile = "src\\main\\resources\\AnswerText.txt";
    String answerText = "first second third fourth fifth ";


    @Before
    public void generateTestText(){
        BufferedWriter writeText = null;
        BufferedWriter writeText2 = null;
        try {
            writeText = new BufferedWriter(new FileWriter(new File(testTextFile)));
            writeText.write(testText);
            writeText2 = new BufferedWriter(new FileWriter(new File(answerTextFile)));
            writeText2.write(answerText);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writeText.flush();
                writeText2.flush();
                writeText.close();
                writeText2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void testSortStringInFile() {
        String inputFile = "src\\main\\resources\\Taras Shevchenko - Son.txt";
        String outputFile = "Taras Shevchenko - Son java edition.txt";

        StringSorter.sortStringInFile(inputFile, outputFile);
    }

    @Test
    public void testSortStringByNumberOfWords() {
//        try {
//            BufferedReader testReader = new BufferedReader(new InputStreamReader(new FileInputStream(testTextFile), UTF_8));
//            BufferedReader answerReader = new BufferedReader(new InputStreamReader(new FileInputStream(answerTextFile), UTF_8));
//            String test = String.valueOf(testReader.read());
//            String answer = String.valueOf(answerReader.read());
//            System.out.println(StringSorter.sortStringByNumberOfWords(test));
//            System.out.println(answer);
            Assert.assertEquals(StringSorter.sortStringByNumberOfWords(testText), answerText);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//
//        }
    }
}
