package com.courses.apollo.model.figure;

/**
 * Created by Dell on 15.05.2017.
 */
public class Pixel {
    private int xValue;
    private int yValue;

    public Pixel(int xValue, int yValue) {
        this.xValue = xValue;
        this.yValue = yValue;
    }

    public int getxValue() {
        return xValue;
    }

    public void setxValue(int xValue) {
        this.xValue = xValue;
    }

    public int getyValue() {
        return yValue;
    }

    public void setyValue(int yValue) {
        this.yValue = yValue;
    }
}
