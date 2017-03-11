package com.courses.apollo.model;

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
    public String toString() {
        return "Point{" + "coordX=" + coordX + ", coordY=" + coordY + '}';
    }
}
