package com.courses.apollo.model.raster;

import com.courses.apollo.util.matrix.IntegerMatrixUtil;

import java.util.Arrays;
import java.util.Set;

/**
 * PixelMatrix represented by integer array. Equals overrides to compare with other PixelMatrix objects by rotating.
 */
public class PixelMatrix {
    /**
     * 4 cycles to rotate figure for comparison in .equals().
     */
    private final int rotateCycles = 4;
    /**
     * Integer array representing PixelMatrix. Where 1 - is black and 0 - is white.
     */
    private int[][] pixelMatrix;

    public PixelMatrix(Set<Pixel> pixels) {
        final int maxX = pixels.stream().mapToInt(Pixel::getXValue).max().getAsInt();
        final int maxY = pixels.stream().mapToInt(Pixel::getYValue).max().getAsInt();
        int[][] figure = new int[maxY + 1][maxX + 1];
        pixels.forEach(pixel -> figure[pixel.getYValue()][pixel.getXValue()] = 1);
        pixelMatrix = figure;
    }

    public int[][] getPixelMatrix() {
        return pixelMatrix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PixelMatrix that = (PixelMatrix) o;
        int[][] newMatrix = that.getPixelMatrix();
        IntegerMatrixUtil matrixUtil = new IntegerMatrixUtil();
        for (int i = 0; i < rotateCycles; i++) {
            if (Arrays.deepEquals(pixelMatrix, newMatrix)) {
                return true;
            }
            newMatrix = matrixUtil.reverseRow(matrixUtil.transpose(newMatrix));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(pixelMatrix);
    }
}
