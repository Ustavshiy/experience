package com.courses.apollo.service.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class NonLetterChainTest {

    private String string = "I must find 234 here a most 0978&^6 long (*7 non letters order";
    private ArrayList<String> stringArray = new ArrayList<>();

    @Before
    public void beforeTest() {
        String stringToArrayOne = "not long string";
        String stringToArrayTwo = "middle string";
        String stringToArrayThree = "little string";
        String stringToArrayFour = "The most supa long string";

        stringArray.add(stringToArrayOne);
        stringArray.add(stringToArrayTwo);
        stringArray.add(stringToArrayThree);
        stringArray.add(stringToArrayFour);
    }

    @Test
    public void testNonLettersFinder() {
        String answer = " 0978&^6 ";
        Assert.assertEquals(answer,NonLetterChain.nonLettersFinder(string));
    }

    @Test
    public void testTheBiggestString() {
        String answear = "The most supa long string";
        Assert.assertEquals(answear, NonLetterChain.theBiggestString(stringArray));
    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<NonLetterChain> constructor = NonLetterChain.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
