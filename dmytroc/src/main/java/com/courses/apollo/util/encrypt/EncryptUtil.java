package com.courses.apollo.util.encrypt;

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
        MatrixSwapper swapper = new MatrixSwapper();
        return spiralToString(swapper.swap(rotate(stringToMatrix(decryptedText))));
    }

    /**
     * Convert String value of text to char[][](left to right, top to down).
     *
     * @param decryptedText input String.
     * @return char[][].
     */
    private static char[][] stringToMatrix(String decryptedText) {
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
     * First step of encrypting.
     * 90degrees clockwise rotate char[][] array .
     *
     * @param matrix char[][] array.
     * @return rotated char[][] array.
     */
    private static char[][] rotate(char[][] matrix) {
        char[][] rotatedMatrix = new char[matrix.length][matrix.length];
        for (int k = 0; k < matrix.length; k++) {
            for (int n = 0; n < matrix.length; n++) {
                rotatedMatrix[rotatedMatrix.length - 1 - n][rotatedMatrix.length - 1 - k]
                        = matrix[k][matrix[k].length - 1 - n];
            }
        }
        return rotatedMatrix;
    }

    /**
     * Third step of encrypting.
     * Write to String from top left corner of matrix by clockwise spiral.
     *
     * @param matrix char[][] array.
     * @return encoded String.
     */
    private static String spiralToString(char[][] matrix) {
        int matrixLine = 0;
        int matrixRow = 0;
        StringBuilder encryptedString = new StringBuilder();
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