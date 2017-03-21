package com.courses.apollo.model.figure;

/**
 * Square representation.
 */
public class Square extends AngleShape {

    /**
     * Four sides in square.
     */
    private static final int SQUARE_SIDES = 4;

    /**
     * Find Square perimeter.
     * @return perimeter
     */
    public double getPerimeter() {
        return getSideA() * SQUARE_SIDES;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
