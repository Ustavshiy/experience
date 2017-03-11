package com.courses.apollo.model;

/**
 * Created by chopenkod on 10.03.17.
 */
public class LineModel {

    private Fraction line;
    private double slope;

    public LineModel(Fraction line) {
        this.line = line;
        try {
            slope = line.getDenominator() / line.getNumerator();
        } catch (IllegalArgumentException e) {
            slope = Double.POSITIVE_INFINITY;
        }
    }

    public Fraction getLine() {
        return line;
    }

    public void setLine(Fraction line) {
        this.line = line;
    }

    public double getSlope() {
        return slope;
    }

    @Override
    public String toString() {
        return "line: "
                + "PointA = [" + line.getCoordXA() + " + " + line.getCoordYA() + "]"
                + ", PointB= [" + line.getCoordXB() + " + " + line.getCoordYB() + "]";
    }
}

