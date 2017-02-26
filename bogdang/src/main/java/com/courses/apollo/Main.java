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
        final int[] mass = {5, -32, 2, 23, 4, 299, 3, 0, 33, -126, -6, 1};

        sort(mass);

    }

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
        for (Integer n : mass) {
            System.out.print(n + ",");
        }
        return mass;
    }
}