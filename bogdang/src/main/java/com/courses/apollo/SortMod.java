package com.courses.apollo;

/**
 * Created by Богдан on 03.03.2017.
 */
    public class SortMod {

    private SortMod() {
    }

    /**
     * This method sorts the array by comparing modules his elements.
     *
     * @param mass is input array.
     * @return sorted array.
     */

    static int[] sort(int[] mass) {
        for (int i = mass.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(mass[j]) < Math.abs(mass[j + 1])) {
                    int t = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = t;
                }
            }
        }
        return mass;
    }
}
