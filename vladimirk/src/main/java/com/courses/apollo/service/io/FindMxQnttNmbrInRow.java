package com.courses.apollo.service.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class to find maximal quantity of numbers in row in given text file.
 */
public class FindMxQnttNmbrInRow {

    /**
     * Created object of the RWFileServise class.
     */
    private RWFileServise readWriteFile = new RWFileServise();

    /**
     * Method to find maximal quantity of numbers in row in given text file.
     */
    public void findMaxQnttNmbrInRow(String inFilePath, String outFilePath) {
        List<String> nmbrs = new ArrayList<>();
        Collections.addAll(nmbrs, readWriteFile.readFile(inFilePath).split("\\D+"));
        Integer max = 0;
        for (String nmbr : nmbrs) {
            if (nmbr.length() > max) {
                max = nmbr.length();
            }
        }
        readWriteFile.writeFile(max.toString(), outFilePath);
    }
}