package com.courses.apollo.model.math;

import java.util.Objects;

/**
 * Class point. Includes coordinates X and Y. Expression point A(X,Y).
 */
public class Point {
    /**
     * Coordinate X of Point.
     */
    private double coordX;
    /**
     * Coordinate Y of Point.
     */
    private double coordY;

    public Point() {
    }

    public Point(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(point.coordX, coordX) == 0
                && Double.compare(point.coordY, coordY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordX, coordY);
    }

    @Override
    public String toString() {
        return "Point{" + "coordX=" + coordX + ", coordY=" + coordY + '}';
    }
}
