package com.courses.apollo.util.encrypt;

import static java.util.stream.IntStream.range;

/**
 * Class for matrix logic.
 */
public class MatrixUtil {
    /**
     * Then swap odd with previous even columns left to right.
     *
     * @param matrix input char[][].
     * @return swapped char[][].
     */
    public char[][] swapEvenAndOddColumns(char[][] matrix) {
        return range(0, matrix.length)
                .mapToObj(r -> range(0, matrix[r].length)
                        .mapToObj(c -> {
                            if (c % 2 == 0 && c == matrix[r].length - 1) {
                                return matrix[r][c];
                            } else if (c % 2 != 0) {
                                return matrix[r][c - 1];
                            } else return matrix[r][c + 1];
                        })
                        .toArray())
                .toArray(char[][]::new);
    }

    /**
     * Transpose matrix.
     *
     * @param matrix char[][] array.
     * @return transposed char[][] array.
     */
    public char[][] transpose(char[][] matrix) {
        for (int k = 0; k < matrix.length - 1; k++) {
            for (int n = k + 1; n < matrix.length; n++) {
                char temp = matrix[n][k];
                matrix[n][k] = matrix[k][n];
                matrix[k][n] = temp;
            }
        }
        return matrix;
    }

    /**
     * Reverse each column of matrix.
     *
     * @param matrix input char[][].
     * @return reversed char[][].
     */
    public char[][] reverseColumn(char[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            char[] temp = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = temp;
        }
        return matrix;
    }
}
