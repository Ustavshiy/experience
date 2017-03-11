package com.courses.apollo;

import com.courses.apollo.model.Fraction;
import com.courses.apollo.model.Line;
import com.courses.apollo.model.Point;

/**
 * Tested 2 parallel lines, 1 line vertical, 1 line horizontal.
 */
public class LineUtilsTestData {

    public static Line getLineA() {
        return new Line(new Fraction(
                new Point(-2, 1),
                new Point(-1, 3)));
    }

    public static Line getLineB() {
        return new Line(new Fraction(
                new Point(-2, -3),
                new Point( 4, -3)));
    }

    public static Line[] getLineArray() {
        return new Line[]{new Line(new Fraction(
                        new Point(-2, 1),
                        new Point(-1, 3))),
                new Line(new Fraction(
                        new Point(3, -1),
                        new Point(5, 3))),
                new Line(new Fraction(
                        new Point(2, -1),
                        new Point(2, 2))),
                new Line(new Fraction(
                        new Point(-2, -3),
                        new Point( 4, -3)))};
    }

    public static Line[] expectedResultParallelFinder() {
        return new Line[]{new Line(new Fraction(
                        new Point(-2, 1),
                        new Point(-1, 3))),
                new Line(new Fraction(
                        new Point(3, -1),
                        new Point(5, 3)))};
    }

    public static Fraction[] expectedResultAxisCrossFinderTest() {
        return new Fraction[]{new Fraction(
                        new Point(-2.5, 0),
                        new Point(0, 5)),
                new Fraction(
                        new Point(3.5, 0),
                        new Point(0, -7)),
                new Fraction(
                        new Point(2, 0),
                        new Point(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)),
                new Fraction(
                        new Point(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY),
                        new Point(0, -3))};
    }

    public static Point expectedCrossPointFinder(){
            return new Point(-4,-3);
    }
}