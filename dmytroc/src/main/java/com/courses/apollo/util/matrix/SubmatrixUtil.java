package com.courses.apollo.util.matrix;

import com.courses.apollo.model.matrix.Matrix;

import java.util.Stack;

/**
 * Class for finding sub matrix in integer matrix.
 */
public class SubmatrixUtil {
    /**
     * Stack for collect row indexes .
     */
    private Stack<Integer> rowStack = new Stack<>();
    /**
     * Stack for collect column indexes in submatrix.
     */
    private Stack<Integer> columnStack = new Stack<>();
    /**
     * Flag that bottom border of submatrix found.
     */
    private boolean isExtendableDown = true;
    /**
     * Flag that intermediate submatrix found. But can find more.
     */
    private boolean isIntermediateFound = false;

    /**
     * Initial method to find a rectangular sub matrix in matrix that contains same integer.
     * It simply iterates a matrix values and runs a method to find biggest.
     *
     * @param matrix incoming matrix.
     * @return object Matrix.
     */
    public Matrix findBiggestSubmatrix(int[][] matrix) {
        Matrix biggestMatrix = new Matrix(0, 0, 0, 0, 0);
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                biggestMatrix = findBiggerSubmatrix(matrix, new Matrix(j, matrix[0].length, i,
                        matrix.length, matrix[i][j]), biggestMatrix);
            }
        }
        return biggestMatrix;
    }

    /**
     * Method returns a rectangular sub matrix in matrix that contains same integer.
     *
     * @param matrix        int[][] matrix to find sub matrix.
     * @param submatrix     Object in sub matrix that have initialized top left corner and value.
     * @param biggestMatrix matrix with a biggest area at the time of running method.
     * @return biggest rectangular matrix in this point if it bigger than previous.
     */
    private Matrix findBiggerSubmatrix(int[][] matrix, Matrix submatrix, Matrix biggestMatrix) {
        columnStack.clear();
        isExtendableDown = true;
        isIntermediateFound = false;
        for (int i = submatrix.getTopBorder(); i < submatrix.getBottomBorder(); i++) {
            columnStack.add(i);
            rowStack.clear();
            passThroughRow(matrix, submatrix, i);
            if (isIntermediateFound) {
                Matrix interMatrix = new Matrix(submatrix.getLeftBorder(), rowStack.peek(),
                        submatrix.getTopBorder(), columnStack.peek(), submatrix.getValue());
                biggestMatrix = returnBiggestMatrix(interMatrix, biggestMatrix);
                isIntermediateFound = false;
            }
            if (!isExtendableDown) {
                break;
            }
        }
        if (isExtendableDown && columnStack.size() > 0 && rowStack.size() > 0) {
            submatrix.setRightBorder(rowStack.peek());
            submatrix.setBottomBorder(columnStack.peek());
            biggestMatrix = returnBiggestMatrix(submatrix, biggestMatrix);
        }
        return biggestMatrix;
    }

    /**
     * Method compares two matrix by area. And returns bigger.
     *
     * @param firstMatrix  matrix.
     * @param secondMatrix matrix.
     * @return matrix with bigger area.
     */
    private Matrix returnBiggestMatrix(Matrix firstMatrix, Matrix secondMatrix) {
        if (firstMatrix.getArea() > secondMatrix.getArea()) {
            return firstMatrix;
        }
        return secondMatrix;
    }

    private void passThroughRow(int[][] matrix, Matrix submatrix, int i) {
        for (int j = submatrix.getLeftBorder(); j < submatrix.getRightBorder(); j++) {
            if (i < matrix.length - 1) {
                if (submatrix.getValue() != matrix[i + 1][j] && rowStack.size() > 0 && columnStack.size() > 0) {
                    isIntermediateFound = true;
                } else if (submatrix.getValue() != matrix[i + 1][j] && rowStack.size() == 0) {
                    isExtendableDown = false;
                }
            }
            rowStack.add(j);
            if (j < submatrix.getRightBorder() - 1
                    && submatrix.getValue() != matrix[i][j + 1]
                    && rowStack.size() > 0 && columnStack.size() > 0) {
                submatrix.setRightBorder(rowStack.peek() + 1);
            }
        }
    }
}