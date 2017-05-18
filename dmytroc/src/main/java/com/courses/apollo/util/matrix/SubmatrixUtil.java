package com.courses.apollo.util.matrix;

import java.util.Stack;

/**
 * Created by DIMA on 18.05.2017.
 */
public class SubmatrixUtil {



    public void find(int[][] matrix, int x) {
        for (int i = 0; i < matrix.length; i++) {

            Stack<Integer> lineTop = new Stack<Integer>();
            Stack<Integer> lineLow = new Stack<Integer>();
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && matrix[i][j] == x) {
                    lineTop.push(j);
                }
            }

            for (int j = 0; j < matrix[i+1].length; j++) {
                if (i == 0 && matrix[i][j] == x) {
                    lineLow.push(j);
                }
            }

            for (int k = matrix[i].length - 1; k >= 0; k--) {

                if (lineTop.peek() == lineLow.peek() ) {
                    lineTop.push(i);
                }
            }

        }
    }
}
