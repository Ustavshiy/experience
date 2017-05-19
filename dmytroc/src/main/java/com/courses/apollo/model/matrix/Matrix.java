package com.courses.apollo.model.matrix;

/**
 * Created by DIMA on 19.05.2017.
 */
public class Matrix {
private int leftBirder;
private int rightBorder;
private int topBorder;
private int bottomBorder;
private int value;
private int area;

    public Matrix(int leftBirder, int topBorder, int value) {
        this.leftBirder = leftBirder;
        this.topBorder = topBorder;
        this.value = value;
    }

    public int getLeftBirder() {
        return leftBirder;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
