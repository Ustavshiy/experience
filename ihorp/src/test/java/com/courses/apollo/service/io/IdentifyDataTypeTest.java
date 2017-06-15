package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class IdentifyDataTypeTest {

    private static String fileWithText = "src/test/resources/IdentifyDataType/FileWithText.txt";
    private static String fileWithInt = "src/test/resources/IdentifyDataType/FileWithInt.txt";
    private static String fileWithString = "src/test/resources/IdentifyDataType/FileWithString.txt";
    private static String fileWithFloat = "src/test/resources/IdentifyDataType/FileWithFloat.txt";
    private static String fileWithChar = "src/test/resources/IdentifyDataType/FileWithChar.txt";

    private static String testedText = "123 word 12.34 4 c boolean 3.14 p";
    private static String strInteger = "25";
    private static String strString = "word";
    private static String strFloat = "28.45";
    private static String strChar = "c";

    @Before
    public void generateData() {
        IOFileString.writeToFile(fileWithText, testedText, false);
        IOFileString.writeToFile(fileWithInt, strInteger, false);
        IOFileString.writeToFile(fileWithString, strString, false);
        IOFileString.writeToFile(fileWithFloat, strFloat, false);
        IOFileString.writeToFile(fileWithChar, strChar, false);
    }

    @Test
    public void getDataTypeTest() throws IOException {
        String answerInteger = "123 4 ";
        Assert.assertEquals(IdentifyDataType.getDataType(fileWithText, fileWithInt), answerInteger);
    }

    @Test
    public void getDataTypeTestTwo() throws IOException {
        String answerString = "word boolean ";
        Assert.assertEquals(IdentifyDataType.getDataType(fileWithText, fileWithString), answerString);
    }

    @Test
    public void getDataTypeTestThree() throws IOException {
        String answerCharacter = "c p ";
        Assert.assertEquals(IdentifyDataType.getDataType(fileWithText, fileWithChar), answerCharacter);
    }

    @Test
    public void getDataTypeTestFour() throws IOException {
        String answerFloat = "12.34 3.14 ";
        Assert.assertEquals(IdentifyDataType.getDataType(fileWithText, fileWithFloat), answerFloat);
    }

    @Test
    public void getOnlyString() {
        String answerString = "word boolean ";
        Assert.assertEquals(answerString, IdentifyDataType.getOnlyString(testedText));
    }

    @Test
    public void getOnlyFloatsTest() {
        String answerFloat = "12.34 3.14 ";
        Assert.assertEquals(answerFloat, IdentifyDataType.getOnlyFloats(testedText));
    }

    @Test
    public void getOnlyChars() {
        String answerCharacter = "c p ";
        Assert.assertEquals(answerCharacter, IdentifyDataType.getOnlyChars(testedText));
    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<IdentifyDataType> constructor = IdentifyDataType.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @AfterClass
    public static void clearFiles() {
        new File(fileWithText).delete();
        new File(fileWithInt).delete();
        new File(fileWithString).delete();
        new File(fileWithFloat).delete();
        new File(fileWithChar).delete();
        new File(fileWithText.replaceAll("[/][^/]+$", "")).delete();
    }
}
