package com.courses.apollo.util.matrix;

/**
 * Created by Dell on 15.05.2017.
 */
public class IntegerMatrixUtil {


    /**
     * Transpose matrix.
     *
     * @param matrix Integer[][] array.
     * @return transposed Integer[][] array.
     */
    public int[][] transpose(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int k = 0; k < matrix.length; k++) {
            for (int n = 0; n < matrix[k].length; n++) {
                transposedMatrix[n][k] = matrix[k][n];
            }
        }
        return transposedMatrix;
    }

    /**
     * Reverse each column of matrix.
     *
     * @param matrix input Integer[][].
     * @return reversed Integer[][].
     */
    public int[][] reverseColumn(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = temp;
        }
        return matrix;
    }

}
