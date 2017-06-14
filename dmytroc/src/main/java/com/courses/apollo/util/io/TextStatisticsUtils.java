package com.courses.apollo.util.io;

import java.io.File;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
        AtomicInteger counter = new AtomicInteger(1);
        return substringList.stream().map(str -> counter.getAndIncrement() + " " + str + " repeats "
                + countSameSubstring(text, str) + " times,\n").collect(Collectors.joining());
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
        return Arrays.stream(text.split(regex))
                .map(String::toLowerCase).filter(s -> !s.equals("")).collect(Collectors.toSet());
    }
}