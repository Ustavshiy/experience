package com.courses.apollo.util.math;

import com.courses.apollo.model.math.Line;
import com.courses.apollo.model.math.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for Straight Line logic.
 * Formula Ax + By + C = 0.
 */
public class LineUtils {
    /**
     * Slope(angle coefficient) == -A/B.
     *
     * @param line input Line.
     * @return slope coefficient.
     */
    public Double slopeFinder(Line line) {
        if (line.getYCoeff() == 0D) {
            return Double.POSITIVE_INFINITY;
        } else if (line.getXCoeff() == 0D) {
            return 0D;
        }
        return -line.getXCoeff() / line.getYCoeff();
    }

    /**
     * Method find where line cross Y axis (0,Y). Formula Ax + By + C = 0. And X = 0;
     * By = -C;
     * y = -C/B
     *
     * @param line input Line.
     * @return coordinate Y.
     */
    public double xCrossFinder(Line line) {
        if (line.getYCoeff() != 0) {
            return -line.getCValue() / line.getYCoeff();
        }
        return Double.POSITIVE_INFINITY;
    }

    /**
     * Method find where line cross X axis (X,0). Formula Ax+By+C = 0. And Y = 0;
     * Ax = -C;
     * x = -C/A
     *
     * @param line input Line.
     * @return coordinate X.
     */
    public double yCrossFinder(Line line) {
        if (line.getXCoeff() != 0) {
            return -line.getCValue() / line.getXCoeff();
        }
        return Double.POSITIVE_INFINITY;
    }

    /**
     * Formula of line Ax+By+C=0. if A1/A2 == B1/B2 - lines are parallel.
     * A1/B1 == A2/B2;
     * slope A = slope B;
     * Method return array with lines which parallel to input line.
     * If slope equals - lines are parallel.
     *
     * @param line       Main Line.
     * @param pretenders Array of Lines.
     * @return array of Lines which parallel to main Line.
     */
    public List<Line> parallelFinder(Line line, List<Line> pretenders) {
        Double lineSlope = slopeFinder(line);
        List<Line> parallelLines = new ArrayList<>();
        for (Line pretender : pretenders) {
            if (lineSlope.equals(slopeFinder(pretender))) {
                parallelLines.add(pretender);
            }
        }
        return parallelLines;
    }

    /**
     * Returns crossing point of two lines.
     * A1*x+B1*y+C1 = A2*x+B2*y+C2;
     *
     * @param lineA First Line
     * @param lineB Second Line.
     * @return crossing Point object A(X,Y).
     */
    public Point crossPointFinder(Line lineA, Line lineB) {
        double aAVal = lineA.getXCoeff();
        double aBVal = lineB.getXCoeff();
        double bAVal = lineA.getYCoeff();
        double bBVal = lineB.getYCoeff();
        double cAVal = lineA.getCValue();
        double cBVal = lineB.getCValue();
        double slopeA = slopeFinder(lineA);
        double slopeB = slopeFinder(lineB);
        if (slopeA == Double.POSITIVE_INFINITY || slopeA == 0) {
            double crossCoordX = -cBVal / aBVal;
            double crossCoordY = -(aAVal * crossCoordX + cAVal) / bAVal;
            return new Point(crossCoordX, crossCoordY);
        } else if (slopeB == Double.POSITIVE_INFINITY || slopeB == 0) {
            double crossCoordY = -cBVal / aBVal;
            double crossCoordX = -(aAVal * crossCoordY + cAVal) / bAVal;
            return new Point(crossCoordX, crossCoordY);
        } else if (slopeA != slopeB) {
            double crossCoordX = (bAVal * cBVal - bBVal * cAVal) / (bBVal * aAVal - bAVal * aBVal);
            double crossCoordY = -(aBVal * (crossCoordX) + cBVal) / bBVal;
            return new Point(crossCoordX, crossCoordY);
        }
        return new Point(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
}