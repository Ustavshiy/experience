package com.courses.apollo.service.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class that find and print to file students with average marks more than given mark.
 */
public class FindSaveSNamesIfAvgMarkMoreGiven {

    /**
     * Created object of the RWFileServise class.
     */
    private RWFileServise rWFile = new RWFileServise();

    /**
     * Method that return second names of Students with average marks more than given mark.
     * @param inFilePath to indicate path to journal-file.
     * @param givenAvgMark to indicate given average mark.
     */
    public List<String> fndSNameIfAvgMarkMore(String inFilePath, double givenAvgMark) {
        List<String> secNames = new ArrayList<>();
        String[] journal = rWFile.readFile(inFilePath).split("\\n");
        for (String personalJrnl : journal) {
            String[] marks = personalJrnl.replaceFirst("\\D+", "").split("\\D+");
            int sum = Arrays.stream(marks).mapToInt(Integer::parseInt).sum();
            if (marks.length != 0 && (double) sum / marks.length > givenAvgMark) {
                secNames.add(personalJrnl.replaceAll("[^A-Za-z]", ""));
            }
        }
        return secNames;
    }

    /**
     * Method to copy journal file with marks and add second names (in upper case)of good students to it.
     */
    public void copyJrnlAddSNames(String outFilePath, String inFilePath, double givenMark, boolean isAdd) {
        String journal = rWFile.readFile(inFilePath);
        rWFile.writeFile(journal, outFilePath, isAdd);
        fndSNameIfAvgMarkMore(inFilePath, givenMark)
                .forEach(sname -> rWFile.writeFile("\n" + sname.toUpperCase(), outFilePath, isAdd));
    }
}