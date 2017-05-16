package com.courses.apollo.util.figures;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;


/**
 * Class IO for read 2 dimensional array (rectangle) from file.
 */
public class IOFigures {

    /**
     * Method returns 2 dimensional array from file.
     *
     * @param inputFile input file
     * @return Integer[][]
     */
    public Integer[][] sheetReader(File inputFile) {
        Integer[][] sheet = null;
        try {
            List<String> lines = Files.readAllLines(inputFile.toPath(), StandardCharsets.UTF_8);
            Integer[][] sheetArray = new Integer[lines.size()][lines.get(0).length()];
            for (int i = 0; i < lines.size(); i++) {
                String[] symbols = lines.get(i).split("");
                for (int j = 0; j < symbols.length; j++) {
                    sheetArray[i][j] = Integer.valueOf(symbols[j]);
                }
            }
            sheet = sheetArray;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sheet;
    }
}