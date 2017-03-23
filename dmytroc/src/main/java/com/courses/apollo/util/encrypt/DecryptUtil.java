package com.courses.apollo.util.encrypt;

/**
 * Decrypt String values with n^2 length encrypted by EncryptUtil.
 *
 * @see EncryptUtil
 */
public class DecryptUtil {
    /**
     * Public method to decrypt string.
     *
     * @param encryptedText Input encrypted text.
     * @return String of decrypted text.
     */
    public String decrypt(String encryptedText) {
        MatrixSwapper swapper = new MatrixSwapper();
        char[][] charMatrix = unRotate(swapper.swap(stringToMatrixSpiral(encryptedText)));
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < charMatrix.length; i++) {
            decryptedText.append(String.valueOf(charMatrix[i]));
        }
        return decryptedText.toString();
    }

    /**
     * First step of decrypting.
     * Fill char[][] matrix with counterclockwise spiral from center.
     *
     * @param encryptedText Input encrypted String.
     * @return char[][].
     */
    private static char[][] stringToMatrixSpiral(String encryptedText) {
        int matrixSize = (int) Math.sqrt(encryptedText.length());
        char[][] matrix = new char[matrixSize][matrixSize];
        int matrixLine = (matrixSize + 1) / 2 - 1;
        int matrixRow = (matrixSize + 1) / 2 - 1;
        int spiralEdge = 1;
        int lastChar = encryptedText.length();
        if ((matrixSize + 1) / 2 != matrixSize / 2) {
            matrix[matrixLine--][matrixRow--] = encryptedText.charAt(--lastChar);
            spiralEdge++;
        }
        while (spiralEdge < matrixSize) {
            for (int i = 0; i < spiralEdge; i++) {
                matrix[++matrixLine][matrixRow] = encryptedText.charAt(--lastChar);
            }
            for (int i = 0; i < spiralEdge; i++) {
                matrix[matrixLine][++matrixRow] = encryptedText.charAt(--lastChar);
            }
            for (int i = 0; i < spiralEdge; i++) {
                matrix[--matrixLine][matrixRow] = encryptedText.charAt(--lastChar);
            }
            for (int i = 0; i < spiralEdge; i++) {
                matrix[matrixLine][--matrixRow] = encryptedText.charAt(--lastChar);
            }
            matrixLine--;
            matrixRow--;
            spiralEdge += 2;
        }
        return matrix;
    }

    /**
     * Third step of decrypting.
     * Rotates char[][] 90 degrees counterclockwise.
     *
     * @param matrix char[][].
     * @return rotated char[][].
     */
    private static char[][] unRotate(char[][] matrix) {
        char[][] rotatedMatrix = new char[matrix.length][matrix.length];
        for (int k = 0; k < matrix.length; k++) {
            for (int n = 0; n < matrix.length; n++) {
                rotatedMatrix[k][matrix[k].length - 1 - n]
                        = matrix[rotatedMatrix.length - 1 - n][rotatedMatrix.length - 1 - k];
            }
        }
        return rotatedMatrix;
    }
}