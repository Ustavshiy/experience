package com.courses.apollo.util;

/**
 * Created by Dmytro Chopenko.
 */
public class IntegerArrayUtility {

    public int minDifferentDigitsFinder(int[] array) {
        final int maxDigits = 11;
        int countedDigits = maxDigits;
        int integerWithMinimumDifferentDigits = 0;
        int differentDigitsCounter = 1;

        for (int i = 0; i < array.length; i++) {

            String string = Integer.toString(array[i]);
            char[] chars = string.toCharArray();
            differentDigitsCounter = differentDigitsCount(chars);

            if (differentDigitsCounter < countedDigits) {
                countedDigits = differentDigitsCounter;
                integerWithMinimumDifferentDigits = array[i];
            }
        }
        return integerWithMinimumDifferentDigits;
    }

    private static int differentDigitsCount(char[] chars) {
        int differentDigitsCounter = 1;

        boolean flag = false;

        for (int j = 0; j < chars.length; j++) {
            for (int k = j + 1; k < chars.length; k++) {
                if (chars[j] == chars[k]) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag) {
                differentDigitsCounter++;
            }
            flag = false;
        }
        return differentDigitsCounter;
    }
}