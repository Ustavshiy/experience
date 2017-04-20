package com.courses.apollo.util.io;

import java.io.File;
import java.util.Set;

/**
 * Writes to file statistics of words and letters in text file.
 */
public class StatisticsUtils {
    /**
     * Regular expression for split words in text.
     */
    private final String wordsSplitRegex = "[^('{0,1}\\w+'{0,1}\\w{0})]+|[\\d+)(+_,]+";
    /**
     * Regular expression for split letters in text.
     */
    private final String lettersSplitRegex = "[^a-zA_Z]*";
    /**
     * TextUtils object.
     */
    private TextUtils textUtils = new TextUtils();
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
        Set<String> words = textUtils.splitToUniqueSubstring(text, wordsSplitRegex);
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
        Set<String> letters = textUtils.splitToUniqueSubstring(text, lettersSplitRegex);
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
                    + textUtils.countSameSubstring(text, substring) + " times,\n");
        }
        return stringBuffer.toString();
    }

}