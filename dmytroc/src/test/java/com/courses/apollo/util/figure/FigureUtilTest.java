package com.courses.apollo.util.figure;

import com.courses.apollo.util.figures.FigureUtil;
import com.courses.apollo.util.io.FileIOUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Test for FigureUtils.
 */
public class FigureUtilTest {
    FileIOUtils fileIOUtils = new FileIOUtils();
    FigureUtil figureUtil = new FigureUtil();
    static File inputFile = new File("./src/test/resources/PlainFigures.txt");
    static File outputFolder = new File("./src/main/resources/figureoutput/");
    File testFolder = new File("./src/test/resources/figureoutput/");
    String testMatrix = "01000001110000000000\n" +
                        "01100000010001100000\n" +
                        "01000000000000110000\n" +
                        "00000110000000000000\n" +
                        "00000100100111000000\n" +
                        "00000100110010000000\n" +
                        "00001000110000100000\n" +
                        "00011000000001100000\n" +
                        "00001000000001000000\n" +
                        "00000001111000000001";

    @Before
    public void before(){
        fileIOUtils.writeToFile(inputFile, testMatrix);
        outputFolder.mkdir();
        figureUtil.findUniqueFiguresInSheet(inputFile, outputFolder);
    }

    @Test
    public void findUniqueFiguresInSheetTest() {
        for (File file : testFolder.listFiles()) {
            Assert.assertArrayEquals(figureUtil.arrayFromSheet(fileIOUtils.multiLineReader(file)),
                    figureUtil.arrayFromSheet(fileIOUtils
                            .multiLineReader(new File(outputFolder +"/"+ file.getName()))));
        }
    }

    @AfterClass
    public static void clean() {
        for (File file : outputFolder.listFiles()) {
            file.delete();
        }
        outputFolder.delete();
        inputFile.delete();
    }
}
