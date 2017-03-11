package com.courses.apollo.util;

import com.courses.apollo.model.Fraction;
import com.courses.apollo.model.Line;
import com.courses.apollo.model.Point;

import java.util.ArrayList;

/**
 * Class for Straight Line logic.
 */
public class LineUtils {
    /**
     * Metod find the slope parameter of Line.
     * @param line input Line.
     * @return slope coefficient.
     */
    public double slopeFinder(Line line) {
        double slope;
        try {
            slope = line.getFraction().getDenominator() / line.getFraction().getNumerator();
        } catch (IllegalArgumentException e) {
            slope = Double.POSITIVE_INFINITY;
        }
        return slope;
    }

    /**
     * Method find where line cross Y axis.
     * @param line input Line.
     * @return coordinate X.
     */
    public double yShiftFinder(Line line) {
        double yShift = line.getFraction().getPointA().getCoordY()
                - line.getFraction().getPointA().getCoordX() * slopeFinder(line);
        return yShift;
    }

    /**
     * Method find where line cross X axis.
     * @param line input Line.
     * @return coordinate X.
     */
    public double xShiftFinder(Line line) {
        double xShift = line.getFraction().getPointA().getCoordX()
                - line.getFraction().getPointA().getCoordY() / slopeFinder(line);
        return xShift;
    }

    /**
     * Method return array with lines which parallel to input line.
     * @param line Main Line.
     * @param pretenders Array of Lines.
     * @return array of Lines which parallel to main Line.
     */
    public Line[] parallelFinder(Line line, Line[] pretenders) {
        ArrayList<Line> parallelLinesArray = new ArrayList<>();
        for (Line pretender : pretenders) {
            if (slopeFinder(line) == slopeFinder(pretender)) {
                parallelLinesArray.add(pretender);
            }
        }
        Line[] result = new Line[parallelLinesArray.size()];
        parallelLinesArray.toArray(result);
        return result;
    }

    /**
     * Method returns array of Fraction defined with two points.
     * This points are coordinates where line cross X axis and where line cross Y axis.
     * @param lines input array of Lines.
     * @return array of Fractions.
     */
    public Fraction[] axisCrossFinder(Line[] lines) {
        Fraction[] axisCrossing = new Fraction[lines.length];

        for (int i = 0; i < lines.length; i++) {
            double slope = slopeFinder(lines[i]);
            if (slope == Double.POSITIVE_INFINITY
                    || slope == -1 * Double.POSITIVE_INFINITY) {
                axisCrossing[i] = new Fraction(
                        new Point(lines[i].getFraction().getPointA().getCoordX(), 0.0),
                        new Point(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
            } else if (slope == 0) {
                axisCrossing[i] = new Fraction(
                        new Point(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY),
                        new Point(0.0, lines[i].getFraction().getPointA().getCoordY()));
            } else {
                axisCrossing[i] = new Fraction(
                        new Point(xShiftFinder(lines[i]), 0.0),
                        new Point(0.0, yShiftFinder(lines[i])));
            }
        }
        return axisCrossing;
    }

    /**
     * Returns crossing point of two lines.
     * @param lineA First Line
     * @param lineB Second Line.
     * @return crossing Point object.
     */
    public Point crossPointFinder(Line lineA, Line lineB) {
        double crossCoordX;
        double crossCoordY;
        double slopeA = slopeFinder(lineA);
        double slopeB = slopeFinder(lineB);
        double yShiftA = yShiftFinder(lineA);
        double yShiftB = yShiftFinder(lineB);
        crossCoordX = (yShiftB - yShiftA) / (slopeA - slopeB);
        crossCoordY = slopeA * crossCoordX + yShiftA;
        return new Point(crossCoordX, crossCoordY);
    }
}
