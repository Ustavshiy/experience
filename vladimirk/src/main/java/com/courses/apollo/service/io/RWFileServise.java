package com.courses.apollo.service.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by vladimirk on 13.05.17.
 */
public class RWFileServise {
    /**
     * Method that read form file and return String.
     */
    public String readFile(String inFilePath) {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(new File(inFilePath).toPath());
            for (String line : lines) {
                builder.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString().substring(0, builder.length() - 1);
    }

    /**
     * Method that write string to file.
     */
    public void writeFile(String string, String outFilePath) {
        try (PrintWriter writer = new PrintWriter(new File(outFilePath), Charset.defaultCharset().name())) {
            writer.print(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}