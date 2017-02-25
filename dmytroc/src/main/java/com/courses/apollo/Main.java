package com.courses.apollo;

import java.util.Set;

/**
 * Created by User on 20.02.2017.
 */
public final class Main {

    /**
     * Test constant array "ARRAY" declared and initialized.
     * Declared and initialized constant MODULO_ONE and MODULO_TWO.
     */
    private static final Integer[] ARRAY = {140, 3, 35, 14, 35, 87, 70, 57, 105, 106, 10};

    /**
     * Declared and initialized constant MODULO_ONE.
     */
    public static final int MODULO_ONE = 5;

    /**
     * Declared and initialized constant MODULO_TWO.
     */
    public static final int MODULO_TWO = 7;

    private Main() {}

    /**
     * This is main method.
     *
     * @param args strings array
     */
    public static void main(String[] args) {

        /**
         * Achieve numbers to Set.
         */
        Set<Integer> approvedNumbers = ModuloUtils.printModuloByTwoNumbers(ARRAY, MODULO_ONE, MODULO_TWO);

        /**
         * Print numbers to console.
          */
        for (Integer e: approvedNumbers) {
            System.out.print(e + " ");
        }
    }
}