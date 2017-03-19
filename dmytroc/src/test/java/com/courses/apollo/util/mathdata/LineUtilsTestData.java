package com.courses.apollo.util.mathdata;

import com.courses.apollo.model.math.RationalFraction;
import com.courses.apollo.model.math.Line;
import com.courses.apollo.model.math.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Tested 2 parallel lines, 1 line vertical, 1 line horizontal.
 */
public class LineUtilsTestData {

    public static Line getLineA() {
        return new Line(2D, -1D, 5D);
    }

    public static Line getLineC() {
        return new Line(1D, -4D, 17D);
    }

    public static Line getLineB() {
        return new Line(1D, 0D, 3D);
    }

    public static List<Line> getLineArray() {
        List<Line> lines = new ArrayList<>();
        lines.add(new Line(2D, -1D, 5D));
        lines.add(new Line(2D, -1D, -7D));
        lines.add(new Line(0D, 1D, -2D));
        lines.add(new Line(1D, 0D, 3D));
        return lines;
    }

    public static List<Line> expectedResultParallelFinder() {
        List<Line> lines = new ArrayList<>();
        lines.add(new Line(2D, -1D, 5D));
        lines.add(new Line(2D, -1D, -7D));
        return lines;
    }

    public static Double[] yCrossFinder() {
        return new Double[]{-2.5, 3.5, Double.POSITIVE_INFINITY, -3D};
    }

    public static Double[] xCrossFinder() {
        return new Double[]{5D, -7D, 2D, Double.POSITIVE_INFINITY};
    }

    public static Point expectedCrossPointFinder() {
        return new Point(-1, -3);
    }

    public static Point expectedCrossPointFinderC() {
        return new Point(-0.42857142857142855, 4.142857142857143);
    }
}