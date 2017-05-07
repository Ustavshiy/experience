package com.courses.apollo.service.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Util class. AP-91 paragraph 1.
 */
public final class CharMatches {

    private CharMatches() {
    }

    /**
     * This method finds the same letters that occur in all words.
     *
     * @param string Here you need to search
     * @return list of characters.
     */
    public static ArrayList<Character> charMatches(String string) {

        ArrayList<Character> result = new ArrayList<>();
        String[] splitedStrings = string.split("[^a-z,A-Z,\\']+");
        String[] firstWordChars = splitedStrings[0].split("");

        for (String i : firstWordChars) {
            if (isHasChar(i, splitedStrings)) {
                result.add(i.charAt(0));
            }
        }
        return result;
    }

    /**
     * @param stringToFind is the string whitch need to find in "strings".
     * @param strings      That's where we look
     * @return true if find, false if not find.
     */
    public static boolean isHasChar(String stringToFind, String[] strings) {
        Pattern pattern = Pattern.compile(stringToFind.toLowerCase());
        boolean result = true;
        for (String i : strings) {
            Matcher matcher = pattern.matcher(i.toLowerCase());
            if (!matcher.find()) {
                return false;
            }
        }
        return result;
    }
}