package com.courses.apollo.service.regex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;


/**
 * Util class. AP-91 paragraph 2.
 */
public final class NonLetterChain {

    private NonLetterChain() {
    }

    /**
     * Method find a biggest sequence of non letters in text.
     *
     * @param string is a text there we must find.
     * @return a biggest sequence of non letters
     */
    public static String nonLettersFinder(String string) {

        String[] nonLetters = string.split("[a-z,A-Z]+");
        Stream<String> stringsStream = Arrays.stream(nonLetters);
        Comparator<String> compare = (one, two) -> Integer.compare(one.length(), two.length());
        return stringsStream.max(compare).get();
    }
}