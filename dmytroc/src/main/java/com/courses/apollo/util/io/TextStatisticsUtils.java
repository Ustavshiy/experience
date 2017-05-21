package com.courses.apollo.util.io;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Writes to file statistics of words and letters in text file.
 */
public class TextStatisticsUtils {
    /**
     * Regular expression for split words in text.
     */
    private final String wordsSplitRegex = "[^('{0,1}\\w+'{0,1}\\w{0})]+|[\\d+)(+_,]+";
    /**
     * Regular expression for split letters in text.
     */
    private final String lettersSplitRegex = "[^a-zA_Z]*";
    /**
     * FileIOUtils object.
     */
    private FileIOUtils fileUtils = new FileIOUtils();

    /**
     * Returns words statistics.
     *
     * @param file input file.
     * @return sting statistics for words.
     */
    public String getWordsStatistics(File file) {
        String text = fileUtils.readFromFile(file);
        Set<String> words = splitToUniqueSubstring(text, wordsSplitRegex);
        return repeatsCounter(text, words);
    }

    /**
     * Returns letter statistics.
     *
     * @param file input file.
     * @return sting statistics for letters.
     */
    public String getLettersStatistics(File file) {
        String text = fileUtils.readFromFile(file);
        Set<String> letters = splitToUniqueSubstring(text, lettersSplitRegex);
        return repeatsCounter(text, letters);
    }

    /**
     * Method returns string statistics for substrings.
     *
     * @param text          text to compare.
     * @param substringList Set of substrings.
     * @return string.
     */
    private String repeatsCounter(String text, Set<String> substringList) {
        StringBuffer stringBuffer = new StringBuffer();
        int counter = 1;
        for (String substring : substringList) {
            stringBuffer.append(counter++ + " " + substring + " repeats "
                    + countSameSubstring(text, substring) + " times,\n");
        }
        return stringBuffer.toString();
    }

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