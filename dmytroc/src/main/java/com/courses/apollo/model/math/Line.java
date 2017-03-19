package com.courses.apollo.model.math;

import java.util.Objects;

/**
 * Class line. Defined by Ax+Bx+C=0.
 */
public class Line {
    /**
     * Coefficient A.
     */
    private Double xCoeff;
    /**
     * Coefficient B.
     */
    private Double yCoeff;
    /**
     * Variable C.
     */
    private Double cValue;

    public Line() {
    }

    public Line(Double xCoeff, Double yCoeff, Double cValue) {
        this.xCoeff = xCoeff;
        this.yCoeff = yCoeff;
        this.cValue = cValue;
    }

    public Double getXCoeff() {
        return xCoeff;
    }

    public void setXCoeff(Double xCoeff) {
        this.xCoeff = xCoeff;
    }

    public Double getYCoeff() {
        return yCoeff;
    }

    public void setYCoeff(Double yCoeff) {
        this.yCoeff = yCoeff;
    }

    public Double getCValue() {
        return cValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Line line = (Line) o;
        return Objects.equals(xCoeff, line.xCoeff)
                && Objects.equals(yCoeff, line.yCoeff)
                && Objects.equals(cValue, line.cValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoeff, yCoeff, cValue);
    }

    public void setCValue(Double cValue) {
        this.cValue = cValue;
    }
}