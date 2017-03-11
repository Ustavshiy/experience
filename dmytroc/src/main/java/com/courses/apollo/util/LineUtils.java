package com.courses.apollo.util;

import com.courses.apollo.model.Fraction;
import com.courses.apollo.model.Line;
import com.courses.apollo.model.Point;

import java.util.ArrayList;

/**
 * Class for Straight Line logic.
 * y = m*x + b
 * Here: x = Xa or Xb, y = Ya or Yb.
 * m = slope(angle coefficient) b = yShift (intersection with Y axis).
 */
public class LineUtils {
    /**
     * Method find the slope parameter of Line. Formula m = (x1-x2)/(y1-y2).
     * Line A(Xa,Ya)(Xb,Yb) slope = (Xa-Xb)/(Ya-Yb).
     *
     * @param line input Line.
     * @return slope coefficient.
     */
    public double slopeFinder(Line line) {
        double slope;
        if (line.getFraction().getNumerator() != 0) {
            slope = line.getFraction().getDenominator() / line.getFraction().getNumerator();
        } else {
            slope = Double.POSITIVE_INFINITY;
        }
        return slope;
    }

    /**
     * Method find where line cross Y axis (0,Y). Formula y = mx + b.
     * Ya = slope * Xa + yShift.
     * yShift = Ya - Xa*slope
     *
     * @param line input Line.
     * @return coordinate Y.
     */
    public double yShiftFinder(Line line) {
        double yShift = line.getFraction().getPointA().getCoordY()
                - line.getFraction().getPointA().getCoordX() * slopeFinder(line);
        return yShift;
    }

    /**
     * Method find where line cross X axis (X,0). Formula y = m*(x-shift).
     * Ya = slope*(Xa-xShift).
     * xShift = Xa - Ya / slope.
     *
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
     * If slope equals - lines are parallel.
     *
     * @param line       Main Line.
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
     * (0,yShift) - is coordinate where line intersects Y axis.
     * (xShift,0) - is coordinate where line intersects X axis.
     * If line is vertical - slope = Infinity. Intersection with X - (Xa,O), with Y - none.
     * If line is horizontal - slope = 0. Intersection with X - none, with Y - (0,Ya).
     *
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
     * Returns crossing point of two lines. Both must be true true y = m1*x + b1 and y=m2*x + b2.
     * Where A(x,y) - interception point, m1 and m2 slopes of 2 lines, b1 and b2 - yShift(interception with Y axis)
     * of two lines.
     * Y = slopeA * X + yShiftA and Y = slopeB * X + yShiftB.
     * => slopeA*X + yShiftA = slopeB * X + yShiftB.
     * => X = (yShiftB - yShiftA)/(slopeA - slopeB).
     * => Y = slopeA * X + yShiftA.
     *
     * @param lineA First Line
     * @param lineB Second Line.
     * @return crossing Point object A(X,Y).
     */
    public Point crossPointFinder(Line lineA, Line lineB) {
        double crossCoordX;
        double crossCoordY;
        double slopeA = slopeFinder(lineA);
        double slopeB = slopeFinder(lineB);
        double yShiftA = yShiftFinder(lineA);
        double yShiftB = yShiftFinder(lineB);
        if (slopeA != slopeB) {
            crossCoordX = (yShiftB - yShiftA) / (slopeA - slopeB);
            crossCoordY = slopeA * crossCoordX + yShiftA;
            return new Point(crossCoordX, crossCoordY);
        } else {
            return new Point(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        }
    }
}
