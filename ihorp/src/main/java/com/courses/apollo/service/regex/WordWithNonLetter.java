package com.courses.apollo.service.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Util class. AP-91 paragraph 4.
 */
public final class WordWithNonLetter {

    private WordWithNonLetter() {
    }

    /**
     * Method find words which contains non letter and change first letter to big.
     *
     * @param text input string.
     * @return text with big letters.
     */
    public static String changeFirstLetter(String text) {

        Pattern pattern = Pattern.compile("[A-Z,a-z]+[\\',\\-][a-z]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String tempOne = matcher.group();
            String tempTwo = tempOne.substring(0, 1).toUpperCase() + tempOne.substring(1);
            text = text.replace(tempOne, tempTwo);
        }
        return text;
    }
}
