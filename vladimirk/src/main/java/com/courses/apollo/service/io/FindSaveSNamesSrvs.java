package com.courses.apollo.service.io;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that find and print to file SN of students with average marks more than given mark.
 */
public class FindSaveSNamesSrvs {

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
            int sum = summarizeArrayNmbrsInString(marks);
            if (marks.length != 0 && (double) sum / marks.length > givenAvgMark) {
                secNames.add(personalJrnl.replaceAll("[^A-Za-z]", ""));
            }
        }
        return secNames;
    }

    /**
     * Method to summarize an Array of numbers in String.
     */
    public int summarizeArrayNmbrsInString(String[] nmbrs) {
        int sum = 0;
        for (String nmbr : nmbrs) {
            sum = sum + Integer.parseInt(nmbr);
        }
        return sum;
    }

    /**
     * Method to copy journal file with marks and add second names (in upper case)of good students to it.
     */
    public void copyJrnlAddSNames(String outFilePath, String inFilePath, double givenMark, boolean isAdd) {
        String journal = rWFile.readFile(inFilePath);
        rWFile.writeFile(journal, outFilePath, isAdd);
        List<String> secNames = fndSNameIfAvgMarkMore(inFilePath, givenMark);
        for (String sname : secNames) {
            rWFile.writeFile("\n" + sname.toUpperCase(), outFilePath, isAdd);
        }
    }
}