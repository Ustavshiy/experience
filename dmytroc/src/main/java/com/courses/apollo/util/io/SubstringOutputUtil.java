package com.courses.apollo.util.io;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class to save to file matched substrings in file.
 */
public class SubstringOutputUtil {

    /**
     * Regular expression for split words in text.
     */
    private final String wordsSplitRegex = "\"[\\\\p{Punct}\\\\s]+\"";
    /**
     * FileIOUtils object.
     */
    private FileIOUtils fileUtils = new FileIOUtils();

    /**
     * Convert text to words separated by space.
     *
     * @param text input text.
     * @return string words separated by space.
     */
    public String getAllWords(String text) {
        String[] words = text.split(wordsSplitRegex);
        StringBuffer stringBuffer = new StringBuffer();
        for (String word : words) {
            stringBuffer.append(word + " ");
        }
        return stringBuffer.toString();
    }

    /**
     * Writes matches to selected file.
     *
     * @param folder   folder of file.
     * @param fileName filename.
     * @param text     text for search matches.
     * @param pattern  pattern to match.
     */
    public void writeMatches(String folder, String fileName, String text, String pattern) {
        File fileFolder = new File(folder);
        fileFolder.mkdirs();
        File file = new File(fileFolder, fileName);
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(getAllWords(text));
        StringBuffer matches = new StringBuffer();
        while (mat.find()) {
            matches.append(mat.group() + "\n");
        }
        fileUtils.writeToFile(file, matches.toString());
    }
}