package com.courses.apollo.service.io;

import org.junit.*;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.file.Files;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertTrue;

public class StringSorterTest {

    private static String testTextFile = "src\\test\\resources\\TestText.txt";
    private static String testText = "fifth fifth fifth fifth fifth fourth fourth fourth fourth third third third second second first";
    private static String answerTextFile = "src\\test\\resources\\AnswerText.txt";
    private static String answerText = "first second third fourth fifth ";
    private static String testOutputFile = "src\\test\\resources\\TestOutput.txt";


    @BeforeClass
    public static void generateTestText() throws IOException {
        IOFileString.writeToFile(testTextFile, testText, false);
        IOFileString.writeToFile(answerTextFile, answerText, false);
    }

    @Test
    public void sortStringInFileTest() throws IOException {
        StringSorter.sortStringInFile(testTextFile, testOutputFile);
        Assert.assertEquals(answerText, IOFileString.readFromFile(testOutputFile));
    }

    @Test
    public void testSortStringByNumberOfWordsTest() {
        Assert.assertEquals(StringSorter.sortStringByNumberOfWords(testText), answerText);
    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<StringSorter> constructor = StringSorter.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @AfterClass
    public static void deleteFiles() {
        new File(testTextFile).delete();
        new File(answerTextFile).delete();
        new File(testOutputFile).delete();
        new File(testTextFile.replaceAll("[\\\\][^\\\\]+$", "")).delete();
    }


}
