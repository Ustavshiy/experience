package com.courses.apollo.service.collections;

import java.util.Queue;

/**
 * Class for finding network resistance from a set of measurements of amperage and voltage by least squares.
 */
public class FndResistncByLeastSqrs {

    /**
     * Method for finding network resistance from a set of measurements of amperage and voltage by least squares.
     */
    public Double fndResistncByLeastSqrs(Queue<Double> amperage, Queue<Double> voltage) {
        double sumNumerator = 0.0;
        double sumDenominator = 0.0;
        if (!amperage.isEmpty() && amperage.size() == voltage.size()) {
            while (!amperage.isEmpty()) {
                double amp = amperage.poll();
                double volt = voltage.poll();
                sumNumerator += amp * volt;
                sumDenominator += amp * amp;
            }
        }
        return sumNumerator / sumDenominator;
    }
}