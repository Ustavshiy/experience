package com.courses.apollo.service.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pattern = Pattern.compile("[^a-z,A-Z]+");
        Matcher matcher = pattern.matcher(string);

        ArrayList<String> nonLetters = new ArrayList<>();
        while (matcher.find()) {
            nonLetters.add(matcher.group());
        }
        return theBiggestString(nonLetters);
    }

    /**
     * Method finds a biggest string in list of strings.
     *
     * @param strings a list of a Strings.
     * @return the biggest String.
     */
    public static String theBiggestString(ArrayList<String> strings) {
        int max = strings.get(0).length();
        int index = 0;

        for (String i : strings) {
            if (i.length() > max) {
                max = i.length();
                index = strings.indexOf(i);
            }
        }
        return strings.get(index);
    }
}
