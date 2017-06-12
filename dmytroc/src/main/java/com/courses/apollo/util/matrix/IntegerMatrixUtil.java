package com.courses.apollo.util.matrix;

import static java.util.stream.IntStream.range;

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
        return range(0, matrix[0].length)
                .mapToObj(r -> range(0, matrix.length).map(c -> matrix[c][r]).toArray()).toArray(int[][]::new);
    }

    /**
     * Reverse each row of matrix.
     *
     * @param matrix input Integer[][].
     * @return reversed Integer[][].
     */
    public int[][] reverseRow(int[][] matrix) {
        return range(0, matrix.length).mapToObj(r -> matrix[matrix.length - 1 - r]).toArray(int[][]::new);
    }
}