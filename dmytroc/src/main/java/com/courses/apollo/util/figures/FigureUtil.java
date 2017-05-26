package com.courses.apollo.util.figures;

import com.courses.apollo.model.raster.Pixel;
import com.courses.apollo.model.raster.PixelMatrix;
import com.courses.apollo.util.io.FileIOUtils;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Class for operation with figures located in 2 dimensional array by byte.
 */
@SuppressWarnings("PMD.UnusedLocalVariable")
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
    private Set<PixelMatrix> uniqueFigures = new LinkedHashSet<>();

    /**
     * Method find unique figures in sheet and write them to different files as 2 dimensional rectangle array.
     *
     * @param inputFile    input file.
     * @param outputFolder export figures to folder.
     */
    public void findUniqueFiguresInSheet(File inputFile, File outputFolder) {
        FileIOUtils fileIOUtils = new FileIOUtils();
        sheet = arrayFromSheet(fileIOUtils.multiLineReader(inputFile));
        getUniqueFigures();
        pixelMatrixWriter(outputFolder, uniqueFigures);
    }

    /**
     * Method convert List of strings to int[][] array.
     *
     * @param lines list of lines.
     * @return int[][] array.
     */
    public Integer[][] arrayFromSheet(List<String> lines) {
        Integer[][] sheetArray = new Integer[lines.size()][lines.get(0).length()];
        int rowIndex = 0;
        for (Integer[] row : sheetArray) {
            String[] symbols = lines.get(rowIndex).split("");
            int columnIndex = 0;
            for (String symbol : symbols) {
                sheetArray[rowIndex][columnIndex] = Integer.valueOf(symbols[columnIndex++]);
            }
            rowIndex++;
        }
        return sheetArray;
    }

    /**
     * Method finds unique figures in sheet and add them to figures set.
     */
    private void getUniqueFigures() {
        int yValue = 0;
        for (Integer[] integerList : sheet) {
            int xValue = 0;
            for (Integer integer : integerList) {
                if (integer == 1) {
                    pixels.clear();
                    collectPixels(pixels, yValue, xValue);
                    simplifyPixels(pixels);
                    createFigureIfUnique(pixels);
                }
                xValue++;
            }
            yValue++;
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
     * Method add PixelFigure to set of figures if it is unique.
     *
     * @param pixels new figure.
     */
    private void createFigureIfUnique(Set<Pixel> pixels) {
        PixelMatrix newFigure = new PixelMatrix(pixels);
        if (uniqueFigures.size() != 0) {
            boolean flag = false;
            for (PixelMatrix existingFigure : uniqueFigures) {
                if (existingFigure.equals(newFigure)) {
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
     * Method writes set of PixelMatrix to files named by counter.
     *
     * @param outputFolder  folder to save.
     * @param uniqueFigures set of PixelMatrix.
     */
    public void pixelMatrixWriter(File outputFolder, Set<PixelMatrix> uniqueFigures) {
        FileIOUtils fileIOUtils = new FileIOUtils();
        int figureCounter = 1;
        for (PixelMatrix figure : uniqueFigures) {
            int[][] figureArray = figure.getPixelMatrix();
            String stringMatrix = "";
            for (int[] aFigureArray : figureArray) {
                for (int anAFigureArray : aFigureArray) {
                    stringMatrix += anAFigureArray;
                }
                stringMatrix += "\n";
            }
            File file = new File(outputFolder + "/figure" + String.valueOf(figureCounter) + ".txt");
            fileIOUtils.writeToFile(file, stringMatrix);
            figureCounter++;
        }
    }
}