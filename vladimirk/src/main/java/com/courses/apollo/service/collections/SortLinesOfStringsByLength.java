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
            StringBuilder spoem = new StringBuilder();
            for (String line : lines) {
                 spoem.append(line.concat("\n"));
            }
            result.add(spoem.subSequence(0, spoem.length() - 1).toString());
        }
        return result;
    }
}
