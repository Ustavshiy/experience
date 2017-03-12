package com.courses.apollo;

/**
 * This is class main.
 */
public final class Main {
    private Main() {
    }

    /**
     * This is main method.
     * Search for the frequency of occurrence of numbers in descending order
     * @param args strings array
     */
    public static void main(String[] args) {
        final int[] array = {2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3};
        System.out.print("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] >= array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int tempOne = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempOne++;
            }
        }
        System.out.println();
        System.out.print("Quantity of unique numbers:" + tempOne + " ");
        System.out.println();

        int[] arrayUnique = new int[tempOne];
        int[] arrayQuantity = new int[tempOne];
        int uniqueCard = 1;
        int carentUnic = 0;
        arrayUnique[carentUnic] = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                uniqueCard++;
            } else {
                arrayQuantity[carentUnic] = uniqueCard;
                carentUnic++;
                arrayUnique[carentUnic] = array[i];
                uniqueCard = 1;
            }
        }

        arrayQuantity[carentUnic] = uniqueCard;

        System.out.print("Unique numbers:");
        for (int i = 0; i < arrayUnique.length; i++) {
            System.out.print(arrayUnique[i] + " ");
        }

        System.out.println();
        System.out.print("Quantity of numbers: ");

        for (int i = 0; i < arrayQuantity.length; i++) {
            System.out.print(arrayQuantity[i] + " ");
        }

        System.out.println();

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

        System.out.print("Result: ");
        for (int i = 0; i < arrayUnique.length; i++) {
            System.out.print(arrayUnique[i] + " ");
        }
    }


    // {1, 2, 3}
    // {5, 7, 2}

    // {2, 1 ,3}

}



