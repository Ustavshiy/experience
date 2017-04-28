package com.courses.apollo.service.regex;

import org.junit.Assert;
import org.junit.Test;

public class WordWithNoLetterTest {

    String testString = "the boss's wife loves me but I can't sleep with her :(";

    @Test
    public void changeFirstLetterTest() {
        String answerString = "the Boss's wife loves me but I Can't sleep with her :(";
        Assert.assertTrue(answerString.equals(WordWithNonLetter.changeFirstLetter(testString)));
    }
}
