package com.courses.apollo.service;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for working with text.
 */
public class TextService {

    /**
     * Method for find sum number in text.
     * @param text - input text.
     * @return count - sum number in text.
     */
    public Integer findSumNumber(String text) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        Integer count = 0;
            while (matcher.find()) {
                Integer number = Integer.valueOf(matcher.group());
                count += number;
            }
        return count;
    }

    /**
     * Removes all comments from text.
     * @param text - input text.
     * @return text without comments.
     */
    public String noComments(String text) {
        String replacement = "";
        text = Pattern.compile("((?s)\\/\\*(?:(?!param|\\*\\/).)*(?:\\*\\/K|.+?\\*\\/))|(\\/\\/.*\n)").matcher(text)
                .replaceAll(replacement);
        return text;
    }

    /**
     * Find one word which is not repeats.
     * @param text - input text.
     * @return found word.
     */
    public String findOneWord(String text) {
        List<String> words = Arrays.asList(text.split("\\W+"));
        Integer quantity = words.size();
        String wordResult = "No coincidence";
        Integer result = 0;
        for (String comparable : words) {
            for (String word : words) {
                if (!comparable.equalsIgnoreCase(word)) {
                    result += 1;
                }
            }
            if (result == quantity - 1) {
                wordResult = comparable;
            }
            result = 0;
        }
        return wordResult;
    }

    /**
     * Find sum even numeral in text.
     * @param text - input text.
     * @return count sum even numeral.
     */
    public Integer findSumEvenNumeral(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            Integer number = Integer.valueOf(matcher.group());
            Integer remainder = number % 2;
            if (remainder == 0) {
                count += number;
            }
        }
        return count;
    }

    /**
     * Remove space in text.
     * @param text - input text.
     * @return text without space.
     */
    public String removeSpace(String text) {
        String replacement = " ";
        text = Pattern.compile("\\s{2,}").matcher(text).replaceAll(replacement);
        Pattern pattern = Pattern.compile("\\w+\\p{P}\\s+\\p{P}|\\w+\\s+\\p{P}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String tempOne = matcher.group();
            String tempTwo = tempOne.replace(" ", "");
            text = text.replace(tempOne, tempTwo);
        }
        return text;
    }
}
