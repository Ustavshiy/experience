package com.courses.apollo.service.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class ConsonantsFinderTest {

    private String testString = "In March, it was reported that a Lithuanian man had been charged over an email";
    private ArrayList<Character> answer;
    @Before
    public void before() {
        answer = new ArrayList<>();
        answer.add('b');
        answer.add('c');
        answer.add('g');
        answer.add('l');
        answer.add('p');
        answer.add('s');
        answer.add('v');
    }

    @Test
    public void testConsonantsFinder() {
     Assert.assertEquals(answer, ConsonantsFinder.consonantsFinder(testString));
    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<ConsonantsFinder> constructor = ConsonantsFinder.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
