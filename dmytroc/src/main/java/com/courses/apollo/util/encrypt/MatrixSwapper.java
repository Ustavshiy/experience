package com.courses.apollo.util.encrypt;

/**
 * Created by Dell on 22.03.2017.
 */
public class MatrixSwapper {
    /**
     * Second step of encrypting and decrypting.
     * Swap top and bottom lines to center.
     * Then swap odd with previous even rows left to right.
     *
     * @param matrix input char[][].
     * @return swapped char[][].
     */
    public char[][] swap(char[][] matrix) {
        char[][] swapLines = new char[matrix.length][matrix.length];
        for (int i = 0; i < (matrix.length + 1) / 2; i++) {
            swapLines[i] = matrix[matrix.length - 1 - i];
            swapLines[matrix.length - 1 - i] = matrix[i];
        }
        char[][] swapRows = new char[matrix.length][matrix.length];
        for (int i = 0; i < swapLines.length; i++) {

            for (int j = 0; j < swapLines.length; j++) {
                if (j % 2 != 0) {
                    swapRows[i][j] = swapLines[i][j - 1];
                    swapRows[i][j - 1] = swapLines[i][j];
                } else if (j == swapLines.length - 1) {
                    swapRows[i][j] = swapLines[i][j];
                }
            }
        }
        return swapRows;
    }
}
