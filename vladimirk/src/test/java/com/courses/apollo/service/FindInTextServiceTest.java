package com.courses.apollo.service;

import com.courses.apollo.model.TextTestData;
import org.junit.Assert;
import org.junit.Test;

public class FindInTextServiceTest {

    private  static FindInTextService findInTextService = new FindInTextService();
    private static TextTestData textTestData = new TextTestData();
    private final static int expectedWordsBgnEndWithVowel = 6;
    private final static int wordCost = 13;
    private final static int expectedReceiptInCent = 130;

    @Test
    public void testFindWhichLettersMore() {
        Assert.assertEquals(textTestData.getExpectedStringsA(),
                (findInTextService.findWhichLettersMore(textTestData.getTextA())));
    }

    @Test
    public void testFindNumberOfWordsBgnAndEndWithVowels() {
        Assert.assertTrue(expectedWordsBgnEndWithVowel == (findInTextService.
                findNumberOfWordsBgnAndEndWithVowels(textTestData.getTextB())));
    }

    @Test
    public void testFindWordsSame1stLstLttr() {
        Assert.assertEquals(findInTextService.findWrdSameFstLstLttr(textTestData.getTextC()),
                (textTestData.getExpectedStringsC()));
    }

    @Test
    public void testReturnWordsMaxMinLength() {
         Assert.assertEquals(textTestData.getExpectedStringsD(),
                 (findInTextService.returnWordsMaxMinLength(textTestData.getTextD())));
    }

    @Test
    public void testReturnReceiptForPaymentOFTelegram() {
        Assert.assertTrue(findInTextService.returnReceiptForPaymentOFTelegram(textTestData.getTextE(),
                wordCost) == expectedReceiptInCent);
    }
 }