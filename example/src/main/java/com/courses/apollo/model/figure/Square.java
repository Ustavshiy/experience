package com.courses.apollo.model.figure;

/**
 * Square representation
 */
public class Square extends AngleShape {

    @Override
    public double getPerimeter() {
        return getSideA() * 4;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
