package com.courses.apollo.main;

/**
 * This is class main.
 */
public final class Main {
    private Main() {
    }

    /**
     * Sort all numbers in ascending order.
     *
     * @param array strings array
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] >= array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * This method sorted quantity numbers.
     *
     * @param arrayUnique   int array
     * @param arrayQuantity int array
     */
    public static void sortByQuantityNumbers(int[] arrayUnique, int[] arrayQuantity) {
        for (int i = 0; i < arrayQuantity.length; i++) {
            for (int j = 0; j < arrayQuantity.length - 1; j++) {
                if (arrayQuantity[j] <= arrayQuantity[j + 1]) {
                    int temp = arrayQuantity[j];
                    arrayQuantity[j] = arrayQuantity[j + 1];
                    arrayQuantity[j + 1] = temp;
                    int tempTest = arrayUnique[j];
                    arrayUnique[j] = arrayUnique[j + 1];
                    arrayUnique[j + 1] = tempTest;
                }
            }
        }
    }

    /**
     * This method added unique and quantity numbers.
     *
     * @param arrayUnique   int array
     * @param arrayQuantity int array
     * @param array         int array
     */
    public static void addedUniqueAndQuantityNumbers(int[] arrayUnique, int[] arrayQuantity, int[] array) {
        int uniqueCard = 1;
        int curentUnic = 0;
        arrayUnique[curentUnic] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                uniqueCard++;
            } else {
                arrayQuantity[curentUnic] = uniqueCard;
                curentUnic++;
                arrayUnique[curentUnic] = array[i];
                uniqueCard = 1;
            }
        }
        arrayQuantity[curentUnic] = uniqueCard;
    }

    /**
     * This method main. Here task result is printed.
     *
     * @param args String array
     */
    public static void main(String[] args) {
        final int[] array = {2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3};
        sort(array);
        int tempOne = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempOne++;
            }
        }
        int[] arrayUnique = new int[tempOne];
        int[] arrayQuantity = new int[tempOne];

        addedUniqueAndQuantityNumbers(arrayUnique, arrayQuantity, array);
        sortByQuantityNumbers(arrayUnique, arrayQuantity);

    }
}



