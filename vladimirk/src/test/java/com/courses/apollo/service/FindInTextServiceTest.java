package com.courses.apollo.service;

import com.courses.apollo.model.TextTestData;
import org.junit.Assert;
import org.junit.Test;

public class FindInTextServiceTest {

    private  static FindInTextService findInTextService = new FindInTextService();
    private static TextTestData textTestData = new TextTestData();
    private final static int expectedWordsBgnWithVowel = 11;
    private final static int wordCost = 13;
    private final static int expectedReceiptInCent = 130;

    @Test
    public void testFindWhichLettersMore() {
        Assert.assertTrue(textTestData.getExpectedStringsA()
                .equals(findInTextService.findWhichLettersMore(textTestData.getTextA())));
    }

    @Test
    public void testFindNumberOfWordsBgnAndEndWithVowels() {
        Assert.assertTrue(expectedWordsBgnWithVowel == (findInTextService.findNumberOfWordsBgnAndEndWithVowels
                (textTestData.getTextB())));
    }

    @Test
    public void testFindWordsSame1stLstLttr() {
        Assert.assertTrue(findInTextService.findWrdSameFstLstLttr(textTestData.getTextC())
                .equals(textTestData.getExpectedStringsC()));
    }

    @Test
    public void testReturnWordsMaxMinLength() {
         Assert.assertTrue(textTestData.getExpectedStringsD()
                .equals(findInTextService.returnWordsMaxMinLength(textTestData.getTextD())));
    }

    @Test
    public void testReturnReceiptForPaymentOFTelegram() {
        Assert.assertTrue(findInTextService.returnReceiptForPaymentOFTelegram(textTestData.getTextE(),
                wordCost) == expectedReceiptInCent);
    }
 }