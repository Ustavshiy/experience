package com.courses.apollo.util.matrix;

import com.courses.apollo.model.matrix.Matrix;

import java.util.Stack;

/**
 * Class for finding sub matrix in integer matrix.
 */
public class SubmatrixUtil {
    /**
     * Initial method to find a rectangular sub matrix in matrix that contains same integer.
     * It simply iterates a matrix values and runs a method to find biggest.
     *
     * @param matrix incoming matrix.
     * @return object Matrix.
     */
    public Matrix findBiggestSubmatrix(int[][] matrix) {
        Matrix biggestMatrix = new Matrix(0, 0, 0);
        biggestMatrix.setArea(0);
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                biggestMatrix = findBiggerSubmatrix(matrix, new Matrix(j, i, matrix[i][j]), biggestMatrix);
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
    public Matrix findBiggerSubmatrix(int[][] matrix, Matrix submatrix, Matrix biggestMatrix) {
        Stack<Integer> rowStack = new Stack<>();
        Stack<Integer> columnStack = new Stack<>();
        boolean isExtendableDown = true;
        boolean isIntermediateFound = false;
        int rowSize = matrix.length;
        int columnSize = matrix[0].length;
        for (int i = submatrix.getTopBorder(); i < rowSize; i++) {
            if (!isExtendableDown) {
                break;
            } else {
                columnStack.add(i);
            }
            rowStack.clear();
            for (int j = submatrix.getLeftBorder(); j < columnSize; j++) {
                if (i < matrix.length - 1) {
                    if (submatrix.getValue() != matrix[i + 1][j] && rowStack.size() > 0 && columnStack.size() > 0) {
                        isIntermediateFound = true;
                    } else if (submatrix.getValue() != matrix[i + 1][j] && rowStack.size() == 0) {
                        isExtendableDown = false;
                    }
                }
                rowStack.add(j);
                if (j < matrix[0].length - 1) {
                    if (submatrix.getValue() != matrix[i][j + 1] && rowStack.size() > 0 && columnStack.size() > 0) {
                        columnSize = rowStack.peek() + 1;
                    }
                }
            }
            if (isIntermediateFound) {
                Matrix interMatrix = new Matrix(submatrix.getLeftBorder(), submatrix.getTopBorder(),
                        submatrix.getValue());
                interMatrix.setRightBorder(rowStack.peek());
                interMatrix.setBottomBorder(columnStack.peek());
                biggestMatrix = compareArea(interMatrix, biggestMatrix);
                isIntermediateFound = false;
            }
        }
        if (isExtendableDown && columnStack.size() > 0 && rowStack.size() > 0) {
            submatrix.setRightBorder(rowStack.peek());
            submatrix.setBottomBorder(columnStack.peek());
            biggestMatrix = compareArea(submatrix, biggestMatrix);
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
    public Matrix compareArea(Matrix firstMatrix, Matrix secondMatrix) {
        if (firstMatrix.getArea() > secondMatrix.getArea()) {
            return firstMatrix;
        }
        return secondMatrix;
    }
}
