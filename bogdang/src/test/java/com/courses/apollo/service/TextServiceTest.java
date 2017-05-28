package com.courses.apollo.service;

import com.courses.apollo.model.TextTestData;
import org.junit.Assert;
import org.junit.Test;

public class TextServiceTest {

    private static TextService textService = new TextService();
    private static TextTestData textTestData = new TextTestData();
    private static final Integer QUANTITY_NUMBER = 17;
    private static final String word = "and";
    private static final Integer QUANTITY_EVEN_NUMERAL = 140;

    @Test
    public void testFindSumNumber(){
        Assert.assertEquals(QUANTITY_NUMBER, textService.findSumNumber(textTestData.getTextOne()));
    }

    @Test
    public void testNoComments(){
        Assert.assertEquals(textTestData.expectedTextTwo(),textService.removeComments(textTestData.getTextTwo()));
    }

    @Test
    public void testFindOneWord(){
        Assert.assertEquals(word, textService.findOneWord(textTestData.getTextThree()));
    }

    @Test
    public void testFindSumEvenNumeral(){
        Assert.assertEquals(QUANTITY_EVEN_NUMERAL, textService.findSumEvenNumeral(textTestData.getTextFour()));
    }

    @Test
    public void textRemoveSpace(){
        Assert.assertEquals(textTestData.expectedTextFive(),textService.removeSpace(textTestData.getTextFive()));
    }

}
