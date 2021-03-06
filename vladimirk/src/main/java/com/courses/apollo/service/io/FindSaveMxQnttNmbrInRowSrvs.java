package com.courses.apollo.service.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class to find and save to file maximal quantity of numbers in row in given text file.
 */
public class FindSaveMxQnttNmbrInRowSrvs {

    /**
     * Created object of the RWFileServise class.
     */
    private RWFileServise readWriteFile = new RWFileServise();

    /**
     * Method for finding and saving to new file (by path) the maximal quantity of numbers in a row in given text file.
     */
    public void findAndSaveMaxQnttNmbrInRow(String inFilePath, String outFilePath, boolean isAdd) {
        List<String> nmbrs = new ArrayList<>();
        nmbrs.addAll(Arrays.asList(readWriteFile.readFile(inFilePath).split("\\D+")));
        readWriteFile.writeFile(String.valueOf(fndLongestStringInList(nmbrs)), outFilePath, isAdd);
    }

    /**
     * Method for finding longest String in given List.
     */
    public int fndLongestStringInList(List<String> strings) {
        int max = 0;
        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
            }
        }
    return max;
    }
}