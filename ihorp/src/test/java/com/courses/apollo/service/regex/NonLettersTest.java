package com.courses.apollo.service.regex;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class NonLettersTest {

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
        answer.equals(NonLetters.nonLettersFinder(string));
    }

    @Test
    public void testTheBiggestString() {
        String answer = "The most supa long string";
        answer.equals(stringArray);
    }
}
