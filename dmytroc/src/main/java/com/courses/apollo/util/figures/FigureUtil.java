package com.courses.apollo.util.figures;

import com.courses.apollo.model.figure.Figure;
import com.courses.apollo.model.figure.Pixel;
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
     * Set of unique figures found in sheet.
     */
    private Set<Figure> figures = new HashSet<>();

    /**
     * 4 cycles to rotate figure for comparison.
     */
    private final int rotateCycles = 4;

    /**
     * Method find unique figures in sheet and write them to different files as 2 dimensional rectangle array.
     *
     * @param inputFile    input file.
     * @param outputFolder export figures folder.
     * @throws IOException exception.
     */
    public void findUniqueFiguresInSheet(File inputFile, File outputFolder) throws IOException {
        IOFigures ioFigures = new IOFigures();
        FileIOUtils fileIOUtils = new FileIOUtils();
        sheet = ioFigures.sheetReader(inputFile);
        getUniqueFigures();
        int figureCounter = 1;
        for (Figure figure : figures) {
            int[][] matrix = figureToMatrix(figure);
            StringBuffer stringBuffer = new StringBuffer();
            for (int y = 0; y < matrix.length; y++) {
                for (int x = 0; x < matrix[y].length; x++) {
                    stringBuffer.append(matrix[y][x]);
                }
                stringBuffer.append("\n");
            }
            File file = new File(outputFolder + String.valueOf(figureCounter) + ".txt");
            fileIOUtils.writeToFile(file, stringBuffer.toString());
            figureCounter++;
        }
    }

    /**
     * Metod finds unique figures in sheet and add them to figures set.
     */
    public void getUniqueFigures() {
        for (int y = 0; y < sheet.length; y++) {
            for (int x = 0; x < sheet[y].length; x++) {
                if (sheet[y][x] == 1) {
                    Figure figure = new Figure();
                    getNeighbors(figure, y, x);
                    simplifyFigure(figure);
                    figureAdder(figure);
                }
            }
        }
    }

    /**
     * Method finds shape of figure based on neighbour pixels.
     *
     * @param figure new figure.
     * @param y      y coordinate of first pixel.
     * @param x      x coordinate of first pixel.
     */
    public void getNeighbors(Figure figure, int y, int x) {
        figure.addPixel(new Pixel(y, x));
        sheet[y][x] = 0;
        if (y < sheet.length - 1 && sheet[y + 1][x] == 1) {
            getNeighbors(figure, y + 1, x);
        }
        if (x < sheet[y].length - 1 && sheet[y][x + 1] == 1) {
            getNeighbors(figure, y, x + 1);
        }
        if (y != 0 && sheet[y - 1][x] == 1) {
            getNeighbors(figure, y - 1, x);
        }
        if (x != 0 && sheet[y][x - 1] == 1) {
            getNeighbors(figure, y, x - 1);
        }
    }

    /**
     * Method overrides X and Y coordinates of all pixels to move figure to beginning of coordinates.
     *
     * @param figure input figure.
     */
    public void simplifyFigure(Figure figure) {
        int minX = sheet[0].length;
        int minY = sheet.length;
        for (Pixel pixel : figure.getFigureSet()) {
            if (pixel.getXValue() < minX) {
                minX = pixel.getXValue();
            }
            if (pixel.getYValue() < minY) {
                minY = pixel.getYValue();
            }
        }
        for (Pixel pixel : figure.getFigureSet()) {
            pixel.setXValue(pixel.getXValue() - minX);
            pixel.setYValue(pixel.getYValue() - minY);
        }
    }

    /**
     * Method add figure to set of figures if it is unique.
     *
     * @param newFigure new figure.
     */
    public void figureAdder(Figure newFigure) {
        if (figures.size() != 0) {
            boolean flag = false;
            for (Figure figure : figures) {
                if (figureMatcher(figureToMatrix(figure), figureToMatrix(newFigure))) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                figures.add(newFigure);
            }
        } else {
            figures.add(newFigure);
        }
    }

    /**
     * Method check if new figure equals existing figure with rotation by 90 degrees.
     *
     * @param existFigure existing figure.
     * @param newFigure new figure.
     * @return true if equals.
     */
    public boolean figureMatcher(int[][] existFigure, int[][] newFigure) {
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
    public boolean figureCompare(int[][] existFigure, int[][] newFigure) {
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
     * Method convert figure to int array[][] for rotate it and compare with other figures.
     *
     * @param figure figure.
     * @return int[][].
     */
    public int[][] figureToMatrix(Figure figure) {
        int maxX = 0;
        int maxY = 0;
        for (Pixel pixel : figure.getFigureSet()) {
            if (pixel.getXValue() > maxX) {
                maxX = pixel.getXValue();
            }
            if (pixel.getYValue() > maxY) {
                maxY = pixel.getYValue();
            }
        }
        int[][] figureMatrix = new int[maxY + 1][maxX + 1];
        for (Pixel pixel : figure.getFigureSet()) {
            figureMatrix[pixel.getYValue()][pixel.getXValue()] = 1;
        }
        return figureMatrix;
    }
}