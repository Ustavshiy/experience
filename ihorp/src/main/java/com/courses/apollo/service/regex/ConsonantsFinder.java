package com.courses.apollo.service.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Util class. AP-91 paragraph 3.
 */
public final class ConsonantsFinder {

    private ConsonantsFinder() {
    }

    /**
     * Method find consonants letters that occur in the text no more than 2 times.
     *
     * @param text in which you want to search.
     * @return consonants letters.
     */
    public static ArrayList<Character> consonantsFinder(String text) {

        ArrayList<Character> result = new ArrayList<>();
        String[] splitedText = text.split("[^a-z,A-Z,\\']+");
        final String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k",
                "l", "m", "n", "p", "q", "r", "s", "t", "v", "x", "z"};

        for (String i : consonants) {
            if (isRepetitionsChar(i, splitedText)) {
                result.add(i.charAt(0));
            }
        }
        return result;
    }

    /**
     * The method determines whether there is a letter in the words array that repeats no more than two times.
     *
     * @param find  char to find.
     * @param words array of words.
     * @return true or false.
     */
    public static boolean isRepetitionsChar(String find, String[] words) {
        Pattern pattern = Pattern.compile(find);

        int counter = 0;
        for (String i : words) {
            Matcher matcher = pattern.matcher(i.toLowerCase());
            if (matcher.find()) {
                counter++;
            }
            if (counter > 2) {
                return false;
            }
        }
        return counter != 0;
    }
}
