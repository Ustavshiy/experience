package com.courses.apollo.service;

import com.courses.apollo.model.TextTestData;
import org.junit.Assert;
import org.junit.Test;

public class FindInTextServiceTest {

    private  static FindInTextService findInTextService = new FindInTextService();
    private static TextTestData textTestData = new TextTestData();
    private final static int expectedWordsBgnWithVowel = 11;
    private final static int wordCost = 13;
    private final static String expectedReceipt = "The payment for the telegram is 1 dollar(s) 30 cent(s).";

    @Test
    public void testFindWhichLettersMore() {
        Assert.assertTrue(textTestData.getExpectedStrings1()
                .equals(findInTextService.findWhichLettersMore(textTestData.getText1())));
    }

    @Test
    public void testFindNumberOfWordsBgnAndEndWithVowels() {
        Assert.assertTrue(expectedWordsBgnWithVowel == (findInTextService.findNumberOfWordsBgnAndEndWithVowels
                (textTestData.getText2())));
    }

    @Test
    public void testFindWordsSame1stLstLttr() {
        Assert.assertTrue(findInTextService.findWrdSameFstLstLttr(textTestData.getText3())
                .equals(textTestData.getExpectedStrings3()));
    }

    @Test
    public void testReturnWordsMaxMinLength() {
         Assert.assertTrue(textTestData.getExpectedStrings4()
                .equals(findInTextService.returnWordsMaxMinLength(textTestData.getText4())));
    }

    @Test
    public void testReturnReceiptForPaymentOFTelegram() {
        Assert.assertTrue(findInTextService.returnReceiptForPaymentOFTelegram(textTestData.getText5(), wordCost)
                .contentEquals(expectedReceipt));
    }
 }