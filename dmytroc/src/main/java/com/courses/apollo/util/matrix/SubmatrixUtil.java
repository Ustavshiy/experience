package com.courses.apollo.util.matrix;

import com.courses.apollo.model.matrix.Matrix;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

/**
 * Created by DIMA on 18.05.2017.
 */
public class SubmatrixUtil {

    @Test
    public void test() {
        int[][] matrix = new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
        };
        System.out.println(findBiggestSubmatrix(matrix).getArea());

    }

    public Matrix findBiggestSubmatrix(int[][] matrix) {
        Matrix biggestMatrix = new Matrix(0,0,0);
        biggestMatrix.setArea(0);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                biggestMatrix = find(matrix, new Matrix(j, i, matrix[i][j]), biggestMatrix, matrix.length, matrix[0].length);
            }
        }

        return biggestMatrix;
    }
// && rowIndex.size() > 1 && columnIndex.size() > 1
    public Matrix find(int[][] matrix, Matrix subMatrix, Matrix biggestMatrix, int rowSize, int columnSize) {

        Stack<Integer> rowIndex = new Stack<>();
        Stack<Integer> columnIndex = new Stack<>();

        for (int i = subMatrix.getTopBorder(); i < rowSize-1; i++) {
            boolean isSubMatrixFound = false;
            rowIndex.clear();
            for (int j = subMatrix.getLeftBirder(); j < columnSize-1; j++) {
                if (subMatrix.getValue() != matrix[i + 1][j]&&rowIndex.size() > 1 && columnIndex.size() > 1) {
                    isSubMatrixFound = true;
                }

                if (subMatrix.getValue() != matrix[i][j + 1]&& rowIndex.size() > 1 && columnIndex.size() > 1) {
                    columnSize = rowIndex.peek()+1;
                }
                rowIndex.add(j);
            }
            if (isSubMatrixFound){
                Matrix matrix1 = new Matrix(subMatrix.getLeftBirder(), subMatrix.getTopBorder(), subMatrix.getValue());
                matrix1.setBottomBorder(columnIndex.peek());
                matrix1.setRightBorder(rowIndex.peek());
                if (matrix1.getArea() > biggestMatrix.getArea()) {
                    biggestMatrix = matrix1;
                }
            }
            columnIndex.add(i);
        }


        subMatrix.setRightBorder(rowIndex.peek());
        subMatrix.setBottomBorder(columnIndex.peek());
        subMatrix.setArea(rowIndex.size() * columnIndex.size());
        if (biggestMatrix.getArea() < subMatrix.getArea()) {
            biggestMatrix = subMatrix;
        }

//        for (int i = subMatrix.getTopBorder(); i < height; i++) {
//            columnIndex.add(i);
//            int counterLenght = 0;
//            for (int j = subMatrix.getLeftBirder(); j < length; j++) {
//                if (matrix[i][j] != subMatrix.getValue()) {
//                    counterLenght++;
//                    break;
//                }
//                rowIndex.add(j);
//            }
//            if (maxLength < rowIndex.size()) {
//                maxLength = rowIndex.size();
//            }
//
//            if (matrix[i - 1][rowIndex.peek()] != subMatrix.getValue()) {
//
//
//                if (biggestMatrix.getArea() < counterLenght * (i - subMatrix.getTopBorder()) && biggestMatrix != null) {
//                    Matrix subMatrix1 = new Matrix(subMatrix.getLeftBirder(), subMatrix.getTopBorder(), subMatrix.getValue());
//                    subMatrix1.setRightBorder(rowIndex.peek());
//                    subMatrix1.setBottomBorder(i);
//                    biggestMatrix = subMatrix1;
//                }
//            }
//            if (matrix[i - 1][subMatrix.getLeftBirder()] != subMatrix.getValue()) {
//                maxHeight = i - subMatrix.getTopBorder();
//                break;
//            }
//        }
//
//        subMatrix.setRightBorder(subMatrix.getLeftBirder() + maxLength);
//        subMatrix.setBottomBorder(subMatrix.getTopBorder() + maxHeight);
//        subMatrix.setArea(maxHeight * maxLength);
//        if (biggestMatrix.getArea() < subMatrix.getArea()) {
//            biggestMatrix = subMatrix;
//        }
        return biggestMatrix;
    }


}
