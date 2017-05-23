package com.courses.apollo.service.io;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IdentifyDataTypeTest {

    private String answerString = "word boolean ";
    private String answerInteger = "123 4 ";
    private String answerFloat = "12.34 3.14";
    private String answerCharacter = "c p ";

    private static String fileWithText = "src\\test\\resources\\FileWithText.txt";
    private String fileWithInt = "src\\test\\resources\\FileWithInt.txt";
    private String fileWithString = "src\\test\\resources\\FileWithString.txt";
    private String fileWithFloat = "src\\test\\resources\\FileWithFloat.txt";
    private String fileWithChar = "src\\test\\resources\\FileWithChar.txt";

    @Before
    public void before() {
        BufferedWriter textBw = null;
        try {
            File file = new File(fileWithText);
            FileWriter fileWriter = new FileWriter(file);
            textBw = new BufferedWriter(fileWriter);
            textBw.write("123 word 12.34 4 c boolean 3.14 p");

            BufferedWriter integerBw = new BufferedWriter(new FileWriter(new File(fileWithInt)));
            integerBw.write("25");

            BufferedWriter stringBw = new BufferedWriter(new FileWriter(new File(fileWithString)));
            stringBw.write("word");

            BufferedWriter floatBw = new BufferedWriter(new FileWriter(new File(fileWithFloat)));
            floatBw.write("28.45");

            BufferedWriter charBw = new BufferedWriter(new FileWriter(new File(fileWithChar)));
            floatBw.write("c");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error");
        }



    }

    @Test
    public void getDataTypeTest() throws IOException {
        Assert.assertEquals(IdentifyDataType.getDataType(fileWithText, fileWithInt), answerInteger);
    }
}
