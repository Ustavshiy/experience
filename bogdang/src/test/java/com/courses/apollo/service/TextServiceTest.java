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
        text.add(new String (textTestData.expectedTextTwo()));
        text.add(new String (textTestData.getTextThree()));
        text.add(new String (textTestData.getTextFive()));
        quantity.add(new Integer (textTestData.getTextOne()));
        quantity.add(new Integer (textTestData.getTextFour()));

    }

    @Test
    public void testFindSumNumber(){
        Assert.assertEquals(QUANTITY_NUMBER, quantity.get(0));
    }

    @Test
    public void testNoComments(){
        Assert.assertEquals(textTestData.expectedTextTwo(), text.get(0));
    }

    @Test
    public void testFindOneWord(){
        Assert.assertEquals(word, text.get(1));
    }

    @Test
    public void testFindSumEvenNumeral(){
        Assert.assertEquals(QUANTITY_EVEN_NUMERAL, quantity.get(1));
    }

    @Test
    public void textRemoveSpace(){
        Assert.assertEquals(textTestData.expectedTextFive(), text.get(2));
    }

}
