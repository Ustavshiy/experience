package com.courses.apollo.service;

import com.courses.apollo.model.TextTestData;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TextServiceTest {

    private static TextService textService = new TextService();
    private static TextTestData textTestData = new TextTestData();
    private static final Integer QUANTITY_NUMBER = 17;
    private static final String word = "and";
    private static final Integer QUANTITY_EVEN_NUMERAL = 140;

    private static List<String> text = new ArrayList<>();
    private static List<Integer> quantity = new ArrayList<>();

    @BeforeClass
    public static void onlyOne(){
        text.add(new String (textTestData.getTextOne()));
        text.add(new String (textTestData.expectedTextTwo()));
        text.add(new String (textTestData.getTextThree()));
        text.add(new String (textTestData.getTextFour()));
        text.add(new String (textTestData.getTextFive()));
    }

    @Test
    public void testFindSumNumber(){
        Assert.assertEquals(QUANTITY_NUMBER, textService.findSumNumber(text.get(0)));
    }

    @Test
    public void testRemoveComments(){
        Assert.assertEquals(textTestData.expectedTextTwo(), textService.removeComments(text.get(1)));
    }

    @Test
    public void testFindOneWord(){
        Assert.assertEquals(word, textService.findOneWord(text.get(2)));
    }

    @Test
    public void testFindSumEvenNumeral(){
        Assert.assertEquals(QUANTITY_EVEN_NUMERAL, textService.findSumEvenNumeral(text.get(3)));
    }

    @Test
    public void textRemoveSpace(){
        Assert.assertEquals(textTestData.expectedTextFive(), textService.removeSpace(text.get(4)));
    }

}
