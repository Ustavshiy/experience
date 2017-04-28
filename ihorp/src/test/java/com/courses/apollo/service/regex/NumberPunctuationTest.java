package com.courses.apollo.service.regex;

import org.junit.Assert;
import org.junit.Test;

public class NumberPunctuationTest {

    String testString = "Text, text text. Text (text text); text?! - text TEXT!!!";

    @Test
    public void test() {
        int answer = 8;
        Assert.assertEquals(answer, NumberPunctuation.numberOfPunctuation(testString));

    }

}
