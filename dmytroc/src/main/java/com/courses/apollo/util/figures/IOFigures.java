package com.courses.apollo.util.figures;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by Dell on 13.05.2017.
 */
public class IOFigures {
    public Integer[][] sheetReader(File testFile) {
        Integer[][] sheet = null;
        try {

            List<String> lines = Files.readAllLines(testFile.toPath(), UTF_8);
            Integer[][] sheetArray = new Integer[lines.size()][lines.get(0).length()];
            for (int i = 0; i < lines.size(); i++) {
                String[] symbols = lines.get(i).split("");
                for (int j = 0; j < symbols.length; i++) {
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
