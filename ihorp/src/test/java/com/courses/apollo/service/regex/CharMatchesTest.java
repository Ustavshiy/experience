package com.courses.apollo.service.regex;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CharMatchesTest {

    private String string = "Test sdfsdfe dfsfkjlsdjfe\ndsfdfed";
    private String[] splitedString = string.split("\\s, \\n");
    private String charToFind = "e";

    @Test
    public void testCharMatches() {
        List<Character> resultChars = new ArrayList<>();
        resultChars.add('e');
        resultChars.add('s');

        Assert.assertEquals(resultChars, CharMatches.charMatches(string));
    }

    @Test
    public void testIsHasChar() {
        boolean result = true;
        assertTrue(CharMatches.isHasChar(charToFind, splitedString));
    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<CharMatches> constructor = CharMatches.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
