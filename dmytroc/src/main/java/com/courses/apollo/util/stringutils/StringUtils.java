package com.courses.apollo.util.stringutils;

/**
 * Class for String utils.
 */
public class StringUtils {

    /**
     * Method removes longest substring which begins and ends with the same symbol.
     * @param string input String.
     * @return edited String.
     */
    public String maxSubstringDelete(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int maxSubstring = 0;
        int substringStart = 0;
        int substringEnd = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = i; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j) && j - i > maxSubstring) {
                    maxSubstring = j - i;
                    substringStart = i;
                    substringEnd = j + 1;
                }
            }
        }
        stringBuilder = stringBuilder.delete(substringStart, substringEnd);
        return stringBuilder.toString();
    }
}
