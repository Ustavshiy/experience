package com.courses.apollo;

/**
 * Created by User on 20.02.2017.
 */
public final class Main {

    private Main() {
    }

    /**
     * This is main method.
     *
     * @param args strings array
     */
    public static void main(String[] args) {

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
