package com.courses.apollo.util.figure;

import com.courses.apollo.util.figures.FigureUtil;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dell on 16.05.2017.
 */
public class FigureUtilTest {
    FigureUtil figureUtil = new FigureUtil();
    File inputFile = new File("./src/test/resources/PlainFigures.txt");
    File outputFolder = new File("./src/main/resources/");

    @Test
    public void findUniqueFiguresInSheetTest() {
        figureUtil.findUniqueFiguresInSheet(inputFile, outputFolder);
    }
}
