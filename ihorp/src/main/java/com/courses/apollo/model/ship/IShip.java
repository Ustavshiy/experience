package com.courses.apollo.model.ship;

/**
 * Interface to all ships.
 */
public interface IShip {

    /**
     * The ship must be able to turn to the right.
     */
    void turnRight();

    /**
     * The ship must be able to turn to the left.
     */
    void turnLeft();

    /**
     * The ship must be able to sail forward.
     */
    void sailForward();

    /**
     * The ship must be able to sail back.
     */
    void sailBack();

    /**
     * Calculate a displacement of ship.
     */
    int displacement(int weight);
}
