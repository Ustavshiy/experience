package com.courses.apollo.service.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Util class.  AP-91 paragraph 5.
 */
public final class NumberPunctuation {

    private NumberPunctuation() {
    }

    /**
     * Method finds and count all punctuation in text.
     *
     * @param text is string.
     * @return number of punctuation.
     */
    public static int numberOfPunctuation(String text) {

        Pattern pattern = Pattern.compile("\\.{3}|\\!{3}|\\?\\!|\\,|\\.|\\!|\\?|\\;|\\(|\\)| \\- ");
        Matcher matcher = pattern.matcher(text);

        int result = 0;

        while (matcher.find()) {
            result++;
        }
        return result;
    }
}
