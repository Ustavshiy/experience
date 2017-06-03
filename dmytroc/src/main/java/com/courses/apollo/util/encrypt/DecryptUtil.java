package com.courses.apollo.util.encrypt;

import java.util.Arrays;

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
        MatrixUtil matrixUtil = new MatrixUtil();
        Character[][] charMatrix = matrixUtil.reverseColumn(
                matrixUtil.swapEvenAndOddColumns(stringToMatrixSpiral(encryptedText)));
        charMatrix = matrixUtil.reverseColumn(matrixUtil.transpose(charMatrix));
        return Arrays.deepToString(charMatrix).substring(1).replace("]", "").replace("[", "").replace(", ", "");
    }

    /**
     * Fill Character[][] matrix with counterclockwise spiral from center.
     *
     * @param encryptedText Input encrypted String.
     * @return Character[][].
     */
    private Character[][] stringToMatrixSpiral(String encryptedText) {
        int matrixSize = (int) Math.sqrt(encryptedText.length());
        Character[][] matrix = new Character[matrixSize][matrixSize];
        int matrixLine = (matrixSize + 1) / 2 - 1;
        int matrixRow = (matrixSize + 1) / 2 - 1;
        int spiralEdge = 1;
        int lastChar = encryptedText.length();
        return matrixSpiralProcessing(matrix, matrixSize, spiralEdge, encryptedText, lastChar, matrixLine, matrixRow);
    }

    private Character[][] matrixSpiralProcessing(Character[][] matrix, int matrixSize, int spiralEdge,
                                                 String encryptedText, int lastChar, int matrixLine, int matrixRow) {
        if ((matrixSize + 1) / 2 != matrixSize / 2) {
            matrix[matrixLine--][matrixRow--] = encryptedText.charAt(--lastChar);
            spiralEdge++;
        }
        for (int edge = spiralEdge; edge < matrixSize; edge += 2) {
            for (int i = 0; i < edge; i++) {
                matrix[++matrixLine][matrixRow] = encryptedText.charAt(--lastChar);
            }
            for (int i = 0; i < edge; i++) {
                matrix[matrixLine][++matrixRow] = encryptedText.charAt(--lastChar);
            }
            for (int i = 0; i < edge; i++) {
                matrix[--matrixLine][matrixRow] = encryptedText.charAt(--lastChar);
            }
            for (int i = 0; i < edge; i++) {
                matrix[matrixLine][--matrixRow] = encryptedText.charAt(--lastChar);
            }
            matrixLine--;
            matrixRow--;
        }
        return matrix;
    }
}