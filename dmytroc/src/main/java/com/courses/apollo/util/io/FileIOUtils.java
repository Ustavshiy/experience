package com.courses.apollo.util.io;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


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
        StringBuffer stringBuffer = new StringBuffer();
        try {
            List<String> lines = Files.readAllLines(testFile.toPath(), UTF_8);
            for (String line : lines) {
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
     * @param file   output file.
     * @param string string to write.
     */

    public void writeToFile(File file, String string) {
        Writer writer = null;
        try {
            writer = Files.newBufferedWriter(Paths.get(file.toURI()), UTF_8);
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * Method returns List of strings from file.
     *
     * @param inputFile input file
     * @return Integer[][]
     */
    public List<String> multiLineReader(File inputFile) {
        List<String> sheet = null;
        try {
            sheet = Files.readAllLines(inputFile.toPath(), UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sheet;
    }
}