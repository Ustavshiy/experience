package com.courses.apollo.service.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Class to return Strings in list with sorted lines by length.
 */
public class SortLinesOfStringsByLength {

    /**
     * Method to return Strings in list with sorted lines by length.
     */
    public List<String> sortLinesOfStringsByLength(List<String> poems) {
        List<String> result = new ArrayList<>();
        for (String poem : poems) {
            List<String> lines = new ArrayList<>();
            lines.addAll(Arrays.asList(poem.split("\\n")));
            lines.sort(Comparator.comparingInt(String::length));
            result.add(convertLinesToPoem(lines));
        }
        return result;
    }

    /**
     * Method to convert lines to poem.
     */
    private String convertLinesToPoem(List<String> lines) {
        StringBuilder poem = new StringBuilder();
        for (String line : lines) {
            poem.append(line.concat("\n"));
        }
        return poem.subSequence(0, poem.length() - 1).toString();
    }
}