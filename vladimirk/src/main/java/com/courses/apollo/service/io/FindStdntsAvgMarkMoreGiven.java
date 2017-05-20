package com.courses.apollo.service.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class that find and print to file students with average marks more than given mark.
 */
public class FindStdntsAvgMarkMoreGiven {

    /**
     * Created object of the RWFileServise class.
     */
    private RWFileServise readWriteFile = new RWFileServise();

    /**
     * Method that return Second Names of Students with average marks more than given mark.
     * @param inFilePath to indicate path to journal-file.
     * @param givenAvgMark to indicate given average mark.
     */
    public List<String> findSNofStdntsAvgMarkMore(String inFilePath, double givenAvgMark) {
        List<String> result = new ArrayList<>();
        String journal = readWriteFile.readFile(inFilePath);
        List<String> secNames = Arrays.asList(journal.replaceAll("[^A-Za-z\\s+]", "").split("\\s+"));
        List<String> persMarks = Arrays.asList(journal.replaceFirst("\\D+", " ").split("[A-Za-z]+"));
        for (int i = 0; i < persMarks.size(); i++) {
            List<String> marks = Arrays.asList(persMarks.get(i).replaceFirst("\\D+", "").split("\\D+"));
            Integer sum = 0;
            for (String mark : marks) {
                sum = sum + Integer.parseInt(mark);
            }
            if (marks.size() != 0 && (double) sum / marks.size() > givenAvgMark) {
            result.add(secNames.get(i).toUpperCase());
            }
        }
        return result;
    }

    /**
     * Method to copy journal file with marks and add second names (in upper case)of good students to it.
     */

    public void copyJrnlAddSNOfStdnts(String outFilePath, String inFilePath, double givenMark, boolean isAdd) {
        String journal = readWriteFile.readFile(inFilePath);
        readWriteFile.writeFile(journal, outFilePath, isAdd);
        findSNofStdntsAvgMarkMore(inFilePath, givenMark)
                .forEach(sname -> readWriteFile.writeFile("\n" + sname, outFilePath, isAdd));
    }
}