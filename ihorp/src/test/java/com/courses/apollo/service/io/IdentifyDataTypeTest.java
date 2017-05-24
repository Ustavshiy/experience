package com.courses.apollo.service.io;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;

public class IdentifyDataTypeTest {

    private static String fileWithText = "src\\test\\resources\\FileWithText.txt";
    private static String fileWithInt = "src\\test\\resources\\FileWithInt.txt";
    private static String fileWithString = "src\\test\\resources\\FileWithString.txt";
    private static String fileWithFloat = "src\\test\\resources\\FileWithFloat.txt";
    private static String fileWithChar = "src\\test\\resources\\FileWithChar.txt";

    private String testedText = "123 word 12.34 4 c boolean 3.14 p";

    @Before
    public void before() {
        BufferedWriter textBw = null;
        BufferedWriter integerBw = null;
        BufferedWriter stringBw = null;
        BufferedWriter floatBw = null;
        BufferedWriter charBw = null;
        try {
            textBw = Files.newBufferedWriter(Paths.get(fileWithText), UTF_8);
            textBw.write(testedText);

            integerBw = Files.newBufferedWriter(new File(fileWithInt).toPath(), UTF_8);
            String checkInteger = "25";
            integerBw.write(checkInteger);

            stringBw = Files.newBufferedWriter(new File(fileWithString).toPath(), UTF_8);
            String checkString = "word";
            stringBw.write(checkString);

            floatBw = Files.newBufferedWriter(new File(fileWithFloat).toPath(), UTF_8);
            String checkFloat = "28.45";
            floatBw.write(checkFloat);

            charBw = Files.newBufferedWriter(new File(fileWithChar).toPath(), UTF_8);
            String checkChar = "c";
            floatBw.write(checkChar);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error");
        } finally {
            try {
                textBw.close();
                integerBw.close();
                stringBw.close();
                floatBw.close();
                charBw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void getDataTypeTest() throws IOException {
        String answerInteger = "123 4 ";
        Assert.assertEquals(IdentifyDataType.getDataType(fileWithText, fileWithInt), answerInteger);
    }

    @Test
    public void readFromFileTest() throws IOException {
        Assert.assertEquals(testedText, IdentifyDataType.readFromFile(fileWithText));
    }
    @Test
    public void getOnlyIntTest() {
        String answerInteger = "123 4 ";
        Assert.assertEquals(answerInteger, IdentifyDataType.getOnlyInt(testedText));
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

    @AfterClass
    public static void clearFiles() {
        new File(fileWithText).delete();
        new File(fileWithInt).delete();
        new File(fileWithString).delete();
        new File(fileWithFloat).delete();
        new File(fileWithChar).delete();
    }
}
