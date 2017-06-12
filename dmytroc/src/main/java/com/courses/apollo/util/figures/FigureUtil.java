package com.courses.apollo.util.figures;

import static java.util.stream.IntStream.range;

import com.courses.apollo.model.raster.Pixel;
import com.courses.apollo.model.raster.PixelMatrix;
import com.courses.apollo.util.io.FileIOUtils;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

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
        return lines.stream().map(s -> Arrays.stream(s.split("")).map(Integer::valueOf)
                .toArray(Integer[]::new)).toArray(Integer[][]::new);
    }

    /**
     * Method finds unique figures in sheet and add them to figures set.
     */
    private void getUniqueFigures() {
        range(0, sheet.length)
                .forEach(r -> range(0, sheet[0].length).filter(c -> sheet[r][c] == 1)
                        .forEach(c -> {
                            pixels.clear();
                            collectPixels(pixels, r, c);
                            simplifyPixels(pixels);
                            createFigureIfUnique(pixels);
                        }));
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
    public void simplifyPixels(Set<Pixel> pixels) {
        final int minX = pixels.stream().mapToInt(Pixel::getXValue).min().getAsInt();
        final int minY = pixels.stream().mapToInt(Pixel::getYValue).min().getAsInt();
        pixels.stream().forEach(pix -> {
            pix.setXValue(pix.getXValue() - minX);
            pix.setYValue(pix.getYValue() - minY);
        });
    }

    /**
     * Method add PixelFigure to set of figures if it is unique.
     *
     * @param pixels new figure.
     */
    private void createFigureIfUnique(Set<Pixel> pixels) {
        PixelMatrix newFigure = new PixelMatrix(pixels);
        if (uniqueFigures.stream().noneMatch(fig -> fig.equals(newFigure))) {
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
        AtomicInteger counter = new AtomicInteger(0);
        uniqueFigures.stream().map(figure -> Arrays.stream(figure.getPixelMatrix())
                .map(row -> Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining()))
                .collect(Collectors.joining("\n"))).forEach(s -> fileIOUtils
                .writeToFile(new File(outputFolder + "/figure" + counter.incrementAndGet() + ".txt"), s));
    }
}