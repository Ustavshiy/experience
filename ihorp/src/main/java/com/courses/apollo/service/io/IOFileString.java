package com.courses.apollo.service.io;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.StandardOpenOption;


/**
 * Util class to read or write text to file.
 */
public final class IOFileString {

    private IOFileString() {}

    /**
     * Method read string from file.
     * @param filePlace is the path and name of file.
     * @return string from file.
     * @throws IOException exception.
     */
    public static String readFromFile(String filePlace) throws IOException {
        BufferedReader dataFileReader = null;
        StringBuilder stringBuilder = new StringBuilder();
            dataFileReader = new BufferedReader(new FileReader(filePlace));
            String thisLine;
            while ((thisLine = dataFileReader.readLine()) != null) {
                stringBuilder.append(thisLine);
            }
        dataFileReader.close();

        return stringBuilder.toString();
    }

    /**
     * Method write String to file and return false is get error. If file exists - this method add text to file.
     * @param filePlace is place where is.
     * @param text text need to write.
     * @param append Determine append text or rewrite.
     * @return true if all is ok, false if have error.
     */
    public static boolean writeToFile(String filePlace, String text, boolean append) throws IOException {

        String path = filePlace.replaceAll("[\\\\][^\\\\]+$", "");
        if (!new File(path).exists()) {
            new File(path).mkdirs();
        }
        File file = new File(filePlace);
        if (file.isFile() && !append) {
                file.delete();
        }
        if (!file.isFile()) {
            file.createNewFile();
        }
        BufferedWriter writeText  = Files.newBufferedWriter(file.toPath(), UTF_8, StandardOpenOption.APPEND);
            writeText.write(text);
                writeText.flush();
                writeText.close();

        return true;
    }
}
