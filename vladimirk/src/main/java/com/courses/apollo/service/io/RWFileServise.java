package com.courses.apollo.service.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.util.List;

/**
 * Class for read and write from/to File.
 */
public class RWFileServise {
    /**
     * Method that read form file and return String.
     */
    public String readFile(String inFilePath) {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(new File(inFilePath).toPath());
            lines.forEach(line -> builder.append(line.concat("\n")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString().substring(0, builder.length() - 1);
    }

    /**
     * Method that write string to file.
     * @param string indicate string to be write to file.
     * @param outFilePath indicate path to new file.
     * @param isAdd indicate if we need to add text to file, not to write/rewrite.
     */
    public void writeFile(String string, String outFilePath, boolean isAdd) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(outFilePath, isAdd), "UTF8"))) {
            bw.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}