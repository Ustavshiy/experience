package com.courses.apollo.service.io;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Util class to read or write text to file.
 */
public final class IOFileString {

    private IOFileString() {
    }

    /**
     * Method read string from file.
     *
     * @param filePlace is the path and name of file.
     * @return string from file.
     * @throws IOException exception.
     */
    public static String readFromFile(String filePlace) throws IOException {
        BufferedReader dataFileReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            dataFileReader = Files.newBufferedReader(Paths.get(filePlace), UTF_8);
            String thisLine;
            while ((thisLine = dataFileReader.readLine()) != null) {
                stringBuilder.append(thisLine);
            }
        } catch (IOException e) {
            throw new IOException();
        } finally {
            try {
                if (dataFileReader != null) {
                    dataFileReader.close();
                }
            } catch (IOException e) {
                throw new IOException();
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Method write String to file and return false is get error. If file exists - this method add text to file.
     *
     * @param filePlace is place where is.
     * @param text      text need to write.
     * @param append    Determine append text or rewrite.
     * @return true if all is ok, false if have error.
     */
    public static boolean writeToFile(String filePlace, String text, boolean append) {

        File file = new File(filePlace);
        File pathFile = new File(filePlace.replaceAll("[\\\\][^\\\\]+$", ""));
        if (!pathFile.exists()) {
            pathFile.mkdirs();
        }
        if (file.isFile() && !append) {
            file.delete();
        }
        return writeToFileAssist(file, text);
    }

    /**
     * Method write text to file.
     *
     * @param file is file.
     * @param text is text to write
     * @return boolean.
     */
    public static boolean writeToFileAssist(File file, String text) {
        BufferedWriter writeText = null;
        try {
            if (!file.isFile()) {
                file.createNewFile();
            }
            writeText = Files.newBufferedWriter(file.toPath(), UTF_8, StandardOpenOption.APPEND);
            writeText.write(text);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                writeText.flush();
                writeText.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
