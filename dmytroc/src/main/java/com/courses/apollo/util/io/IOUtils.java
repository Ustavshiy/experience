
package com.courses.apollo.util.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for IOUtils utils.
 */
public class IOUtils {
    /**
     * Regular expression for split words in text.
     */
    private final String wordsSplitRegex = "[^('{0,1}\\w+'{0,1}\\w{0})]+|[\\d+)(+_,]+";
    /**
     * Regular expression for split letters in text.
     */
    private final String lettersSplitRegex = "[^a-zA_Z]*";

    /**
     * Method read string from file.
     *
     * @param testFile file.
     * @return string.
     */
    public String readFromFile(File testFile) {
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Reader fileReader = Files.newBufferedReader(testFile.toPath(), StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line + " ");
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(stringBuffer);
    }

    /**
     * Method write to string to file.
     *
     * @param file   output file.
     * @param string string to write.
     */
    public void writeToFile(File file, String string) {
        try {
            Writer writer = Files.newBufferedWriter(file.toPath(), StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(string);
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
    private Set<String> splitToSubstring(String text, String regex) {
        String[] substrings = text.split(regex);
        Set<String> substringSet = new HashSet();
        for (String substring : substrings) {
            if (!substring.equals("")) {
                substringSet.add(substring.toLowerCase());
            }
        }
        return substringSet;
    }

    /**
     * Returns words statistics.
     *
     * @param file input file.
     * @return sting statistics for words.
     */
    public String getWordsStatistics(File file) {
        String text = readFromFile(file);
        Set<String> words = splitToSubstring(text, wordsSplitRegex);
        repeatsCounter(text, words);
        return repeatsCounter(text, words);
    }

    /**
     * Returns letter statistics.
     *
     * @param file input file.
     * @return sting statistics for letters.
     */
    public String getLettersStatistics(File file) {
        String text = readFromFile(file);
        Set<String> letters = splitToSubstring(text, lettersSplitRegex);
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
}