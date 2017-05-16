package com.courses.apollo.model.figure;

/**
 * Class contains coordinates of point.
 */
public class Pixel {
    /**
     * X value of Pixel.
     */
    private int xValue;
    /**
     * Y value of Pixel.
     */
    private int yValue;

    public Pixel(int yValue, int xValue) {
        this.xValue = xValue;
        this.yValue = yValue;
    }

    public int getXValue() {
        return xValue;
    }

    public void setXValue(int xValue) {
        this.xValue = xValue;
    }

    public int getYValue() {
        return yValue;
    }

    public void setYValue(int yValue) {
        this.yValue = yValue;
    }
}
