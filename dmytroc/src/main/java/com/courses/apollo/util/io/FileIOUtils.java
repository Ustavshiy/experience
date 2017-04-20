package com.courses.apollo.util.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * IO class to read and write.
 */
public class FileIOUtils {

    /**
     * Method read string from file.
     *
     * @param testFile file.
     * @return string.
     */
    public String readFromFile(File testFile) {
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        try (Reader fileReader = Files.newBufferedReader(testFile.toPath(), StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(stringBuffer);
    }

    /**
     * Method write to string to file.
     *
     * @param file output file.
     * @param string string to write.
     */

    public void writeToFile(File file, String string) {
        try (Writer writer = Files.newBufferedWriter(file.toPath(), StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

