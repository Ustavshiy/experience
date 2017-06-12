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
                .mapToObj(r -> range(0, matrix[r].length)
                        .mapToObj(c -> {
                            if (c % 2 == 0 && c == matrix[r].length - 1) {
                                return matrix[r][c];
                            } else if (c % 2 != 0) {
                                return matrix[r][c - 1];
                            } else {
                                return matrix[r][c + 1];
                            }
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
        return range(0, matrix[0].length).mapToObj(r -> range(0, matrix.length)
                .mapToObj(c -> matrix[c][r]).toArray(Character[]::new)).toArray(Character[][]::new);
    }

    /**
     * Reverse each column of matrix.
     *
     * @param matrix input Character[][].
     * @return reversed Character[][].
     */
    public Character[][] reverseColumn(Character[][] matrix) {
        return range(0, matrix.length).mapToObj(r -> matrix[matrix.length - 1 - r]).toArray(Character[][]::new);
    }
}