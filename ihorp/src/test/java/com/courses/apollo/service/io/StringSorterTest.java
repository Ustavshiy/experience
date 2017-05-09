package com.courses.apollo.service.io;

import org.junit.Test;

/**
 * Created by Ihor on 09.05.2017.
 */
public class StringSorterTest {

    @Test
    public void testSortStringInFile() {
        String inputFile = "src\\main\\resources\\Taras Shevchenko - Son.txt";
        String outputFile = "Taras Shevchenko - Son java edition.txt";

        StringSorter.sortStringInFile(inputFile, outputFile);
    }

    @Test
    public void testSortString() {
        String string = "sdfsdf sdfsdfsdgsd sdfsdgwegdsvsgdsg";

        System.out.println(StringSorter.sortString(string));
    }
}
