package com.courses.apollo;

/**
 * Class added for findFirstNumberVariousDigits function.
 */
public class FindFirstNumberVariousDigits {

    /**
     * Method of determining the first number consisting of different digits from an array.
     *
     * @param inArray is the array of input values
     */
    public int findFirstNumberVariousDigits(String[] inArray) {

        int counter = 0;
        int length = inArray.length;
        int[] numVarDigArr = new int[length];
        for (int i = 0; i < inArray.length; i++) {
            String stringFromArray = inArray[i];
            boolean isNum = checkIsNumber(stringFromArray);
            if (isNum) {
                for (int k = 0; k < stringFromArray.length(); k++) {
                    char[] digitsOfNum = stringFromArray.toCharArray();
                    int difDigCounter = countDifDigits(digitsOfNum);
                    if (difDigCounter == stringFromArray.length()) {
                        int numVarDig = Integer.parseInt(stringFromArray);
                        numVarDigArr[counter] = numVarDig;
                        counter++;
                    }
                }
            }
        }
        return numVarDigArr[0];
    }

    /**
     *  Method that determines whether the number of String 06.03.2017.
     */
    private boolean checkIsNumber(String stringFromArray) {
        int digitsCounter = 0;
        boolean isNumber;
        for (int n = 0; n < stringFromArray.length(); n++) {
            if (Character.isDigit(stringFromArray.charAt(n))) {
                digitsCounter++;
            }
        }
        if (stringFromArray.length() == digitsCounter) {
            isNumber = true;
        } else {
            isNumber = false;
        }
        return isNumber;
    }

    /**
     * Method that count different digits in String(if it number) 06.03.2017.
     */
    private int countDifDigits(char[] digitsOfNum) {
        int difDigCounter = 1;
        boolean isDif = false;

        for (int l = 0; l < digitsOfNum.length; l++) {
            for (int v = l + 1; v < digitsOfNum.length; v++) {
                if (digitsOfNum[l] == digitsOfNum[v]) {
                    isDif = false;
                    break;
                }
                isDif = true;
            }
            if (isDif) {
                difDigCounter++;
            }
            isDif = false;
        }
        return difDigCounter;
    }
}