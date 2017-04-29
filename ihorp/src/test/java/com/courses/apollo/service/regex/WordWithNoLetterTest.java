package com.courses.apollo.service.regex;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class WordWithNoLetterTest {

    private String testString = "the boss's wife loves me but I can't sleep with her :(";

    @Test
    public void changeFirstLetterTest() {
        String answerString = "the Boss's wife loves me but I Can't sleep with her :(";
        Assert.assertTrue(answerString.equals(WordWithNonLetter.changeFirstLetter(testString)));
    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<WordWithNonLetter> constructor = WordWithNonLetter.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
