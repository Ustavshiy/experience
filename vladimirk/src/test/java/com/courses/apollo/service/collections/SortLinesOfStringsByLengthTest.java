package com.courses.apollo.service.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to test return Strings in list with sorted lines by length.
 */
public class SortLinesOfStringsByLengthTest {
    private final static SortLinesOfStringsByLengthTest sortLinesOfStringsTest = new SortLinesOfStringsByLengthTest();
    private final static SortLinesOfStringsByLength sortLinesOfStrings = new SortLinesOfStringsByLength();
    private final static List<String> poemsForTest = sortLinesOfStringsTest.getPoemsForTest();
    private final static List<String> exspectedSortedPoems = sortLinesOfStringsTest.getExcpectedListOfPoems();

    public List<String> getPoemsForTest() {
        return new ArrayList<String>() {{
            add(new String("O Thou who burn'st in Heart for those who burn in Hell,\n" +
                    "whose fires thyself shall feed in turn,\n" +
                    "How long be crying, 'Mercy on them, God!'\n" +
                    "Why, who art Thou to teach, and He to learn?"));
            add(new String("I tell you this—When, started from the Goal,\n"+
                    "Over the flaming shoulders of the Foal\n"+
                    "Of Heav'n Parwin and Mushtari they flung,\n"+
                    "In my predestined Plot of Dust and Soul."));
        }};
    }

    public List<String> getExcpectedListOfPoems() {
        return new ArrayList<String>() {{
            add(new String("whose fires thyself shall feed in turn,\n" +
                    "How long be crying, 'Mercy on them, God!'\n" +
                    "Why, who art Thou to teach, and He to learn?\n" +
                    "O Thou who burn'st in Heart for those who burn in Hell,"));
            add(new String("Over the flaming shoulders of the Foal\n"+
                    "In my predestined Plot of Dust and Soul.\n" +
                    "Of Heav'n Parwin and Mushtari they flung,\n"+
                    "I tell you this—When, started from the Goal,"));
        }};
    }

    @Test
    public void sortLinesOfStringsByLengthTest() {
        Assert.assertEquals(exspectedSortedPoems, sortLinesOfStrings.sortLinesOfStringsByLength(poemsForTest));
    }
}
