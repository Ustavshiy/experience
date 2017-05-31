package com.courses.apollo.util.encrypt;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/**
 * Encrypt String values with n^2 length.
 *
 * @see DecryptUtil use for decrypt.
 */
public class EncryptUtil {
    /**
     * Public method to encrypt string.
     *
     * @param decryptedText Input String.
     * @return Encrypted String.
     */
    public String encrypt(String decryptedText) {
        MatrixUtil matrixUtil = new MatrixUtil();
        return spiralToString(matrixUtil.swapEvenAndOddColumns(
                matrixUtil.reverseColumn(
                        matrixUtil.transpose(
                                matrixUtil.reverseColumn(
                                        stringToMatrix(decryptedText))))));
    }

    /**
     * Convert String value of text to char[][](left to right, top to down).
     *
     * @param decryptedText input String.
     * @return char[][].
     */
    private char[][] stringToMatrix(String decryptedText) {
        int matrixSize = (int) Math.sqrt(decryptedText.length());
        char[][] matrix = new char[matrixSize][matrixSize];
        int counter = 0;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = decryptedText.charAt(counter);
                counter++;
            }
        }
        return matrix;
    }

    /**
     * Write to String from top left corner of matrix by clockwise spiral.
     *
     * @param matrix char[][] array.
     * @return encoded String.
     */
    private String spiralToString(char[][] matrix) {
        int matrixLine = 0;
        int matrixRow = 0;
        StringBuilder encryptedString = new StringBuilder();
        return spiralToStringProcessing(matrix, matrixLine, matrixRow, encryptedString);
    }

    private String spiralToStringProcessing(char[][] matrix, int matrixLine, int matrixRow,
                                            StringBuilder encryptedString) {
        for (int matrixSize = matrix.length; matrixSize > 0; matrixSize -= 2) {
            if (matrixSize == 1) {
                for (int i = 0; i < matrixSize; i++) {
                    encryptedString.append(matrix[matrixLine][matrixRow++]);
                }
                break;
            }
            for (int i = 0; i < matrixSize - 1; i++) {
                encryptedString.append(matrix[matrixLine][matrixRow++]);
            }
            for (int i = 0; i < matrixSize - 1; i++) {
                encryptedString.append(matrix[matrixLine++][matrixRow]);
            }
            for (int i = 0; i < matrixSize - 1; i++) {
                encryptedString.append(matrix[matrixLine][matrixRow--]);
            }
            for (int i = 0; i < matrixSize - 1; i++) {
                encryptedString.append(matrix[matrixLine--][matrixRow]);
            }
            matrixLine++;
            matrixRow++;
        }
        return encryptedString.toString();
    }
}