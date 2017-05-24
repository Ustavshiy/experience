package com.courses.apollo.service.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Util class.
 */
public final class IdentifyDataType {

    private IdentifyDataType() {
    }

    /**
     * Method find text in file "dataType" check the type of data and read only this data type in file "dataFile".
     * @param dataFile the way to file with text.
     * @param dataType the way to file with data type.
     * @return String with required data type.
     * @throws IOException exception.
     */
    public static String getDataType(String dataFile, String dataType) throws IOException {

        String dataTypeString = readFromFile(dataType);
        String text = readFromFile(dataFile);

        if (Pattern.matches("^\\d+$", dataTypeString)) {
            return getOnlyInt(text);
        } else if (Pattern.matches("[0-9a-zA-Z([+-]?\\d*\\.+\\d*)]*", dataTypeString)) {
            return getOnlyString(text);
        } else if (Pattern.matches("^([+-]?\\d*\\.+\\d*)$", dataTypeString)) {
            return getOnlyFloats(text);
        } else if (Pattern.matches("[\\D\\W]", dataTypeString)) {
            return getOnlyChars(text);
        }
        return null;
    }

    /**
     * Method read string from file.
     * @param filePlace is the path and name of file.
     * @return string from file.
     * @throws IOException exception.
     */
    public static String readFromFile(String filePlace) throws IOException {
        BufferedReader dataFileReader = new BufferedReader(new FileReader(filePlace));
        StringBuilder stringBuilder = new StringBuilder();
        String thisLine;
        while ((thisLine = dataFileReader.readLine()) != null) {
            stringBuilder.append(thisLine);
        }
        dataFileReader.close();
        return stringBuilder.toString();
    }

    /**
     * Method return only integers from string.
     * @param text is string to find.
     * @return String with integers.
     */
    public static String getOnlyInt(String text) {
        String[] splited = text.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String i: splited) {
            if (Pattern.matches("^\\d+$", i)) {
                answer.append(i + " ");
            }
        }
        return answer.toString();
    }

    /**
     * Method return only words from string.
     * @param text is string to find.
     * @return String with words.
     */
    public static String getOnlyString(String text) {
        String[] splited = text.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String i: splited) {
            if (Pattern.matches("[a-zA-Z]{2,}[\\-\\']?[a-z]*", i)) {
                answer.append(i + " ");
            }
        }
        return answer.toString();
    }

    /**
     * Method return only floats from string.
     * @param text is string to find.
     * @return String with floats.
     */
    public static String getOnlyFloats(String text) {
        String[] splited = text.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String i: splited) {
            if (Pattern.matches("^([+-]?\\d*\\.+\\d*)$", i)) {
                answer.append(i + " ");
            }
        }
        return answer.toString();
    }

    /**
     * Method return only chars from string.
     * @param text is string to find.
     * @return String with chars.
     */
    public static String getOnlyChars(String text) {
        String[] splited = text.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String i: splited) {
            if (Pattern.matches("[\\D\\W]", i)) {
                answer.append(i + " ");
            }
        }
        return answer.toString();
    }
}
