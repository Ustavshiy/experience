package com.courses.apollo.service.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ConsonantsFinderTest {

    String testString = "In March, it was reported that a Lithuanian man had been charged over an email";
    ArrayList<Character> answer;
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
}
