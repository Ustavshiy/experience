package com.courses.apollo.service.regex;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CharMatchesTest {

    private String string = "Test sdfsdfe dfsfkjlsdjfe\ndfdfed";
    private String[] splitedString = string.split("\\s, \\n");
    private String charToFind = "e";

    @Test
    public void testCharMatches() {
        List<Character> resultChars = new ArrayList<>();
        resultChars.add('e');
        resultChars.add('s');

        resultChars.equals(CharMatches.charMatches(string));
    }

    @Test
    public void testIsHasChar() {
        boolean result = true;
        result = CharMatches.isHasChar(charToFind, splitedString);
    }
}
