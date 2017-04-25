package com.courses.apollo.service.regex;

import java.util.ArrayList;

/**
 * Util class.
 */
public class RegexService1 {

    /**
     * This method finds the same letters that occur in all words.
     * @param string Here you need to search
     * @return list of characters.
     */
    public static ArrayList<Character> charMatches(String string){

        ArrayList<Character> result = new ArrayList<>();
        String[] splitedStrings = string.split("[\\s,\\n]"); // Добавить вариант с новой строкой.
        char[] firstWordChars = splitedStrings[0].toCharArray();

        for (char i: firstWordChars) {
           if (charMatch(i, splitedStrings)) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Additional method. Determines whether there is a letter in the array of strings. I know that this method
     * may seem difficult to understand, but this is the best solution that I came up with in 3 hours.
     * @param charToFind is char whitch need to find.
     * @param strings The array of strings to search in
     * @return true or false.
     */
    private static boolean charMatch(char charToFind, String[] strings) {

        boolean isMatcherInString = true;

        for (String i: strings) {
            char[] soughtWordChars = i.toCharArray();
            boolean isMatcherInWord = false;

            for (char k : soughtWordChars) {
                if(k == charToFind) {
                    isMatcherInWord = true;
                }
            }
            if (!isMatcherInWord) {
                isMatcherInString = false;
                break;
            }
        }
        return isMatcherInString;
    }
}
