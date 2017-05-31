package com.courses.apollo.util.matrix;

/**
 * Class for Integer Matrix Util.
 */
@SuppressWarnings("PMD.UnusedLocalVariable")
public class IntegerMatrixUtil {

    /**
     * Transpose matrix.
     *
     * @param matrix Integer[][] array.
     * @return transposed Integer[][] array.
     */
    public int[][] transpose(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        int rowIndex = 0;
        for (int[] row : matrix) {
            int colIndex = 0;
            for (int value : row) {
                row[rowIndex] = matrix[rowIndex][colIndex++];
            }
            rowIndex++;
        }
        return transposedMatrix;
    }

    /**
     * Reverse each row of matrix.
     *
     * @param matrix input Integer[][].
     * @return reversed Integer[][].
     */
    public int[][] reverseRow(int[][] matrix) {
        int[][] reversedMatrix = new int[matrix.length][matrix[0].length];
        int rowIndex = 0;
        for (int[] row : matrix) {
            reversedMatrix[rowIndex] = matrix[matrix.length - 1 - rowIndex];
            reversedMatrix[matrix.length - 1 - rowIndex++] = row;
        }
        return reversedMatrix;
    }

}
