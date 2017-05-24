package com.courses.apollo.util.race;

import com.courses.apollo.model.race.Bolid;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Class for RaceUtil.
 */
public class RaceUtil {
    /**
     * Starting grid step in km.
     */
    private final Double startingGrigStep = 0.01;
    /**
     * Seconds in hour.
     */
    private final int secondsInHour = 3600;
    /**
     * Overtakes in race ascending by time.
     */
    private Map overtakes = new TreeMap<Double, Overtake>();

    /**
     * Move bolid at theirs start positions according to qualification. Bolids places every 10 meters.
     *
     * @param bolids set of bolids.
     */
    private void onStart(Set<Bolid> bolids) {
        for (Bolid b : bolids) {
            b.setDistance(0.0 + startingGrigStep * (bolids.size() - b.getPosition()));
        }
    }

    /**
     * Method start the race.
     *
     * @param bolids Set of Bolids in race.
     */
    public void startRace(Set<Bolid> bolids) {
        onStart(bolids);
        overtakingStat(bolids);
    }

    /**
     * Method returns count overtakes in race.
     *
     * @return overtakes Integer.
     */
    public Integer overtakeCount() {
        return overtakes.entrySet().size();
    }

    /**
     * Method returns detailed statistics of overtakes.
     *
     * @param overtakesCount number of first overtakes.
     * @return String statistics.
     */
    public String getOvertakesDetails(int overtakesCount) {
        StringBuffer overtakesStat = new StringBuffer();
        Set<Overtake> overtake = this.overtakes.entrySet();
        Iterator iterator = overtake.iterator();
        for (int i = 0; i < overtakesCount; i++) {
            overtakesStat.append(iterator.next().toString() + "\n");
        }
        return overtakesStat.toString();
    }

    /**
     * Method add overtakes to treeMap sorted by time.
     *
     * @param bolids set of bolids in race.
     */
    private void overtakingStat(Set<Bolid> bolids) {
        for (Bolid overtakingCar : bolids) {
            for (Bolid overtakenCar : bolids) {
                if (overtakingCar.getSpeed() > overtakenCar.getSpeed()
                        && overtakingCar.getPosition() > overtakenCar.getPosition()) {
                    double time = ((overtakenCar.getDistance() - overtakingCar.getDistance())
                            / (overtakingCar.getSpeed() - overtakenCar.getSpeed())) * secondsInHour;
                    overtakes.put(time, new Overtake(overtakingCar, overtakenCar, time));
                }
            }
        }
    }

    /**
     * Class for overtakes statistics.
     */
    private class Overtake {
        /**
         * Overtaking bolid.
         */
        private Bolid overtaking;
        /**
         * Overtaken bolid.
         */
        private Bolid overtaken;
        /**
         * Time in seconds from start race.
         */
        private Double timeFromStart;

        Overtake(Bolid overtaking, Bolid overtaked, Double timeFromStart) {
            this.overtaking = overtaking;
            this.overtaken = overtaked;
            this.timeFromStart = timeFromStart;
        }

        @Override
        public String toString() {
            return "Number " + overtaking.getNumber()
                    + ", overtakes number " + overtaken.getNumber()
                    + " at " + timeFromStart + " seconds";
        }
    }
}