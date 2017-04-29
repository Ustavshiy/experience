package com.courses.apollo.service.regex;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class NumberPunctuationTest {

    private String testString = "Text, text text. Text (text text); text?! - text TEXT!!!";

    @Test
    public void test() {
        int answer = 8;
        Assert.assertEquals(answer, NumberPunctuation.numberOfPunctuation(testString));

    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<NumberPunctuation> constructor = NumberPunctuation.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
