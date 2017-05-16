package com.courses.apollo.util.figures;

import com.courses.apollo.model.raster.Pixel;
import com.courses.apollo.util.io.FileIOUtils;
import com.courses.apollo.util.matrix.IntegerMatrixUtil;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Class for operation with figures located in 2 dimensional array by byte.
 */
public class FigureUtil {
    /**
     * Integer[][] is a input matrix with figures included.
     */
    private Integer[][] sheet;
    /**
     * Multiplicity of Pixels that describes new figure.
     */
    private Set<Pixel> pixels = new HashSet<>();
    /**
     * Set of unique figures found in sheet.
     */
    private Set<int[][]> uniqueFigures = new HashSet<>();

    /**
     * 4 cycles to rotate figure for comparison.
     */
    private final int rotateCycles = 4;

    /**
     * Method find unique figures in sheet and write them to different files as 2 dimensional rectangle array.
     *
     * @param inputFile    input file.
     * @param outputFolder export figures folder.
     */
    public void findUniqueFiguresInSheet(File inputFile, File outputFolder) {
        IOFigures ioFigures = new IOFigures();
        FileIOUtils fileIOUtils = new FileIOUtils();
        sheet = ioFigures.sheetReader(inputFile);
        getUniqueFigures();
        int figureCounter = 1;
        for (int[][] figureArray : uniqueFigures) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int y = 0; y < figureArray.length; y++) {
                for (int x = 0; x < figureArray[y].length; x++) {
                    stringBuffer.append(figureArray[y][x]);
                }
                stringBuffer.append("\n");
            }
            File file = new File(outputFolder + "/figure" + String.valueOf(figureCounter) + ".txt");
            try {
                fileIOUtils.writeToFile(file, stringBuffer.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            figureCounter++;
        }
    }

    /**
     * Method finds unique figures in sheet and add them to figures set.
     */
    private void getUniqueFigures() {
        for (int y = 0; y < sheet.length; y++) {
            for (int x = 0; x < sheet[y].length; x++) {
                if (sheet[y][x] == 1) {
                    pixels.clear();
                    collectPixels(pixels, y, x);
                    simplifyPixels(pixels);
                    createFigureIfUnique(pixels);
                }
            }
        }
    }

    /**
     * Method finds shape of figure based on neighbour pixels and add them to Set of pixels.
     * added pixels in sheet paints "white" (0).
     *
     * @param pixels new multiplicity of Pixels.
     * @param y      y coordinate of first pixel.
     * @param x      x coordinate of first pixel.
     */
    private void collectPixels(Set<Pixel> pixels, int y, int x) {
        pixels.add(new Pixel(y, x));
        sheet[y][x] = 0;
        if (y < sheet.length - 1 && sheet[y + 1][x] == 1) {
            collectPixels(pixels, y + 1, x);
        }
        if (x < sheet[y].length - 1 && sheet[y][x + 1] == 1) {
            collectPixels(pixels, y, x + 1);
        }
        if (y != 0 && sheet[y - 1][x] == 1) {
            collectPixels(pixels, y - 1, x);
        }
        if (x != 0 && sheet[y][x - 1] == 1) {
            collectPixels(pixels, y, x - 1);
        }
    }

    /**
     * Method overrides X and Y coordinates of all pixels to move whole figure to beginning of coordinates.
     *
     * @param pixels input pixels.
     */
    private void simplifyPixels(Set<Pixel> pixels) {
        int minX = sheet[0].length;
        int minY = sheet.length;
        for (Pixel pixel : pixels) {
            if (pixel.getXValue() < minX) {
                minX = pixel.getXValue();
            }
            if (pixel.getYValue() < minY) {
                minY = pixel.getYValue();
            }
        }
        for (Pixel pixel : pixels) {
            pixel.setXValue(pixel.getXValue() - minX);
            pixel.setYValue(pixel.getYValue() - minY);
        }
    }

    /**
     * Method add figure to set of figures if it is unique.
     *
     * @param pixels new figure.
     */
    private void createFigureIfUnique(Set<Pixel> pixels) {
        int[][] newFigure = pixelsToFigure(pixels);
        if (uniqueFigures.size() != 0) {
            boolean flag = false;
            for (int[][] figure : uniqueFigures) {
                if (figureMatcher(figure, newFigure)) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                uniqueFigures.add(newFigure);
            }
        } else {
            uniqueFigures.add(newFigure);
        }
    }

    /**
     * Method check if new figure equals existing figure with rotation by 90 degrees.
     *
     * @param existFigure existing figure.
     * @param newFigure   new figure.
     * @return true if equals.
     */
    private boolean figureMatcher(int[][] existFigure, int[][] newFigure) {
        IntegerMatrixUtil matrixUtil = new IntegerMatrixUtil();
        for (int i = 0; i < rotateCycles; i++) {
            if (figureCompare(existFigure, newFigure)) {
                return true;
            }
            newFigure = matrixUtil.reverseColumn(matrixUtil.transpose(newFigure));
        }
        return false;
    }

    /**
     * Method compare int[][] of new figure with int[][] of existing figure from set.
     *
     * @param existFigure existing figure.
     * @param newFigure   new figure.
     * @return true if equals.
     */
    private boolean figureCompare(int[][] existFigure, int[][] newFigure) {
        if (existFigure.length != newFigure.length || existFigure[0].length != newFigure[0].length) {
            return false;
        } else {
            for (int y = 0; y < existFigure.length; y++) {
                for (int x = 0; x < existFigure[y].length; x++) {
                    if (existFigure[y][x] != newFigure[y][x]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Method convert pixels set to int array[][] to create figure for collect,
     * rotate it and compare with other figures.
     *
     * @param pixels figure.
     * @return int[][].
     */
    private int[][] pixelsToFigure(Set<Pixel> pixels) {
        int maxX = 0;
        int maxY = 0;
        for (Pixel pixel : pixels) {
            if (pixel.getXValue() > maxX) {
                maxX = pixel.getXValue();
            }
            if (pixel.getYValue() > maxY) {
                maxY = pixel.getYValue();
            }
        }
        int[][] figure = new int[maxY + 1][maxX + 1];
        for (Pixel pixel : pixels) {
            figure[pixel.getYValue()][pixel.getXValue()] = 1;
        }
        return figure;
    }
}