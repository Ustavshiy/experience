package com.courses.apollo.model.race;

import java.util.Objects;

/**
 * Class Bolid for Race.
 */
public class Bolid {
    /**
     * Racing number of bolid.
     */
    private int number;
    /**
     * Start position in race.
     */
    private int position;
    /**
     * Distance at track.
     */
    private double distance;
    /**
     * Speed of bolid.
     */
    private double speed;

    public Bolid() {
    }

    public Bolid(int number, int position, double speed) {
        this.number = number;
        this.position = position;
        this.speed = speed;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bolid bolid = (Bolid) o;
        return position == bolid.position
                && Double.compare(bolid.distance, distance) == 0
                && Double.compare(bolid.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, distance, speed);
    }
}
