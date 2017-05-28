package com.courses.apollo.service.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class to find and save to file maximal quantity of numbers in row in given text file.
 */
public class FindSaveMxQnttNmbrInRow {

    /**
     * Created object of the RWFileServise class.
     */
    private RWFileServise readWriteFile = new RWFileServise();

    /**
     * Method for finding and saving to new file (by path) the maximal quantity of numbers in a row in given text file.
     */
    public void findAndSaveMaxQnttNmbrInRow(String inFilePath, String outFilePath, boolean isAdd) {
        List<String> nmbrs = new ArrayList<>();
        Collections.addAll(nmbrs, readWriteFile.readFile(inFilePath).split("\\D+"));
        int max = nmbrs.stream().mapToInt(String::length).max().orElseGet(null);
        readWriteFile.writeFile(String.valueOf(max), outFilePath, isAdd);
    }
}