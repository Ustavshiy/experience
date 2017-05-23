package com.courses.apollo.service.io;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Util class.
 */
public class IdentifyDataType {

    private IdentifyDataType() {
    }

    public static String getDataType(String fileData, String dataType) throws IOException {
        String identifyType = new BufferedReader(new FileReader(dataType)).readLine();
        if (Pattern.matches("^\\d+$", identifyType)) {
            return getOnlyInt(fileData);
        } else if (Pattern.matches("[0-9a-zA-Z([+-]?\\d*\\.+\\d*)]*", identifyType)) {
            return getOnlyString(fileData);
        } else if (Pattern.matches("^([+-]?\\d*\\.+\\d*)$", identifyType)) {
            return getOnlyFloats(fileData);
        } else if (Pattern.matches("[\\D\\W]", identifyType)) {
            return getOnlyChars(fileData);
        }
        return null;
    }

    private static String getOnlyInt(String text) {
        String[] splited = text.split(" ");
        StringBuilder answer = new StringBuilder();
        for(String i: splited) {
            if(Pattern.matches("^\\d+$", i)) {
                answer.append(i + " ");
            }
        }
        return answer.toString();
    }

    private static String getOnlyString(String text) {
        String[] splited = text.split(" ");
        StringBuilder answer = new StringBuilder();
        for(String i: splited) {
            if(Pattern.matches("[0-9a-zA-Z([+-]?\\d*\\.+\\d*)]*", i)) {
                answer.append(i + " ");
            }
        }
        return answer.toString();
    }

    private static String getOnlyFloats(String text) {
        String[] splited = text.split(" ");
        StringBuilder answer = new StringBuilder();
        for(String i: splited) {
            if(Pattern.matches("^([+-]?\\d*\\.+\\d*)$", i)) {
                answer.append(i + " ");
            }
        }
        return answer.toString();
    }

    private static String getOnlyChars(String text) {
        String[] splited = text.split(" ");
        StringBuilder answer = new StringBuilder();
        for(String i: splited) {
            if(Pattern.matches("[\\D\\W]", i)) {
                answer.append(i + " ");
            }
        }
        return answer.toString();
    }
}
