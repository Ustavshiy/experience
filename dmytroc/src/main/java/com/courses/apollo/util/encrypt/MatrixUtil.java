package com.courses.apollo.util.encrypt;

import static java.util.stream.IntStream.range;

/**
 * Class for matrix logic.
 */
public class MatrixUtil {
    /**
     * Then swap odd with previous even columns left to right.
     *
     * @param matrix input Character[][].
     * @return swapped Character[][].
     */
    public Character[][] swapEvenAndOddColumns(Character[][] matrix) {
        return range(0, matrix.length)
                .mapToObj(row -> range(0, matrix[row].length)
                        .mapToObj(col -> {
                            if (col % 2 == 0 && col == matrix[row].length - 1) {
                                return matrix[row][col];
                            } else if (col % 2 != 0) {
                                return matrix[row][col - 1];
                            } else return matrix[row][col + 1];
                        })
                        .toArray(Character[]::new))
                .toArray(Character[][]::new);
    }

    /**
     * Transpose matrix.
     *
     * @param matrix Character[][] array.
     * @return transposed Character[][] array.
     */
    public Character[][] transpose(Character[][] matrix) {
        return range(0, matrix[0].length).mapToObj(row -> range(0, matrix.length)
                .mapToObj(col -> matrix[col][row]).toArray(Character[]::new)).toArray(Character[][]::new);
    }

    /**
     * Reverse each column of matrix.
     *
     * @param matrix input Character[][].
     * @return reversed Character[][].
     */
    public Character[][] reverseColumn(Character[][] matrix) {
        return range(0, matrix.length).mapToObj(row -> matrix[matrix.length - 1 - row]).toArray(Character[][]::new);
    }
}