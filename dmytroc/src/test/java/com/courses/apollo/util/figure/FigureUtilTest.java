package com.courses.apollo.util.figure;

import com.courses.apollo.util.figures.FigureUtil;
import com.courses.apollo.util.figures.IOFigures;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Test for FigureUtils.
 */
public class FigureUtilTest {
    IOFigures ioFigures = new IOFigures();
    FigureUtil figureUtil = new FigureUtil();
    File inputFile = new File("./src/test/resources/PlainFigures.txt");
    File outputFolder = new File("./src/main/resources/");
    File testFolder = new File("./src/test/resources/figureoutput/");

    @Before
    public void before(){
        figureUtil.findUniqueFiguresInSheet(inputFile, outputFolder);
    }

    @Test
    public void findUniqueFiguresInSheetTest() {
        for (File file : testFolder.listFiles()) {
            Assert.assertArrayEquals(ioFigures.sheetReader(file),
                    ioFigures.sheetReader(new File(outputFolder +"/"+ file.getName())));
        }
    }

    @AfterClass
    public static void clean() {
        File outputDir = new File("./src/main/resources/");
        for (File file : outputDir.listFiles()) {
            file.delete();
        }
    }
}
