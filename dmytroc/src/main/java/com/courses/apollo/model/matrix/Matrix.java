package com.courses.apollo.model.matrix;

import java.util.Objects;

/**
 * Class rectangular sub matrix contains all integer X in given matrix.
 */
public class Matrix {
    /**
     * Left index that sub matrix contains(int[][first index]) position in main matrix.
     */
    private int leftBorder;
    /**
     * Left index that sub matrix contains(int[][last index]) position in main matrix.
     */
    private int rightBorder;
    /**
     * Left index that sub matrix contains(int[first index][]) position in main matrix.
     */
    private int topBorder;
    /**
     * Left index that sub matrix contains(int[last index][]) position in main matrix.
     */
    private int bottomBorder;
    /**
     * Integer X value of every index.
     */
    private int value;
    /**
     * Area of sub matrix(count of indexes in sub matrix).
     */
    private int area;

    public Matrix(int leftBirder, int topBorder, int value) {
        this.leftBorder = leftBirder;
        this.topBorder = topBorder;
        this.value = value;
    }

    public int getLeftBorder() {
        return leftBorder;
    }

    public int getRightBorder() {
        return rightBorder;
    }

    public void setRightBorder(int rightBorder) {
        this.rightBorder = rightBorder;
    }

    public int getTopBorder() {
        return topBorder;
    }

    public int getBottomBorder() {
        return bottomBorder;
    }

    public void setBottomBorder(int bottomBorder) {
        this.bottomBorder = bottomBorder;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Method initialize and return area with multiply it`s dimensions.
     * @return area.
     */
    public int getArea() {
        area = (rightBorder - leftBorder + 1) * (bottomBorder - topBorder + 1);
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Matrix matrix = (Matrix) o;
        return leftBorder == matrix.leftBorder
                && rightBorder == matrix.rightBorder
                && topBorder == matrix.topBorder
                && bottomBorder == matrix.bottomBorder
                && value == matrix.value
                && area == matrix.area;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftBorder, rightBorder, topBorder, bottomBorder, value, area);
    }
}
