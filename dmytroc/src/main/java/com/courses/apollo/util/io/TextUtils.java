
package com.courses.apollo.util.io;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for text utils.
 */
public class TextUtils {
    /**
     * Count quantity of same substrings in file.
     *
     * @param text      input text.
     * @param substring substring to count.
     * @return Integer counter.
     */
    public Integer countSameSubstring(String text, String substring) {
        Integer counter = 0;
        Pattern pat = Pattern.compile(substring);
        Matcher mat = pat.matcher(text.toLowerCase());
        while (mat.find()) {
            counter++;
        }
        return counter;
    }

    /**
     * Retuns set of substrings split by regular expression.
     *
     * @param text  Input text.
     * @param regex expression for split.
     * @return Set of substrings.
     */
    public Set<String> splitToUniqueSubstring(String text, String regex) {
        String[] substrings = text.split(regex);
        Set<String> substringSet = new HashSet();
        for (String substring : substrings) {
            if (!substring.equals("")) {
                substringSet.add(substring.toLowerCase());
            }
        }
        return substringSet;
    }
}