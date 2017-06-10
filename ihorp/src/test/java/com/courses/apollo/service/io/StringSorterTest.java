package com.courses.apollo.service.io;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm;
import org.junit.*;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

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
    public void createListWordCounterTest() {
        List<StringSorter.WordCounter> wordCounters = new ArrayList<>();
        wordCounters.add(new StringSorter.WordCounter("word", 1));
        String[] strings = {"word", "word"};

        Assert.assertEquals(wordCounters, StringSorter.createListWordCounter(strings));
    }

    @Test
    public void hashCodeTest() {
        new StringSorter.WordCounter("word", 1).hashCode();
    }

    @Test
    public void equelsTest() {
        new StringSorter.WordCounter("word", 1).equals(new StringSorter.WordCounter("word", 1));
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
