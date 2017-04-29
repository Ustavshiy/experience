package com.courses.apollo.model.figure;

import java.io.Serializable;

/**
 * Square representation.
 */
public class Square extends AngleShape implements Serializable, Comparable, AutoCloseable {

    /**
     * Four sides in square.
     */
    private static final int SQUARE_SIDES = 4;

    public Square(double sideA) {
        super(sideA);
    }

    /**
     * Find Square perimeter.
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return getSideA() * SQUARE_SIDES;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
