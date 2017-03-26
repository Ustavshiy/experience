package com.courses.apollo.model.ship;

/**
 * Interface to all ships.
 */
public interface IShip {
    /**
     * Calculate a displacement of ship.
     *
     * @return displacement.
     */
    int displacement(int weight);
}
