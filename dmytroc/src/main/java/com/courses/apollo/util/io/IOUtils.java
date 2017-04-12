
package com.courses.apollo.util.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for IOUtils utils.
 */
public class IOUtils {
    /**
     * Metod read string from file.
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
     * Method returns integer count of same words in file.
     *
     * @param file   file.
     * @param string word.
     * @return integer words count.
     */
    public Integer countSameWords(File file, String string) {
        String text = readFromFile(file);
        Integer count = 0;
        Pattern pat = Pattern.compile("\\b" + string.toLowerCase() + "\\b");
        Matcher mat = pat.matcher(text.toLowerCase());
        while (mat.find()) {
            count++;
        }
        return count;
    }

    /**
     * Count same letters in file.
     *
     * @param file   file.
     * @param letter char.
     * @return integer same chars count.
     */
    public Integer countSameLetters(File file, Character letter) {
        String text = readFromFile(file);
        Integer count = 0;
        Pattern pat = Pattern.compile(letter.toString());
        Matcher mat = pat.matcher(text.toLowerCase());
        while (mat.find()) {
            count++;
        }
        return count;
    }
}