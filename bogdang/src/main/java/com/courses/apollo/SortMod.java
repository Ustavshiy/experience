package com.courses.apollo;

   /**
     * Created class that sorts the massive according to modules.
     */
   public class SortMod {

    /**
     * Sorts the array by comparing modules his elements.
     *
     * @param mass is input array.
     * @return sorted array.
     */

    public int[] sort(int[] mass) {
        for (int i = mass.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(mass[j]) < Math.abs(mass[j + 1])) {
                    int variable = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = variable;
                }
            }
        }
        return mass;
    }
}
