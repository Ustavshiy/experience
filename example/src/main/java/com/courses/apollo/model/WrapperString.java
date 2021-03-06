package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public class WrapperString {

    /**
     * String variable.
     */
    private String str;

    public WrapperString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    /**
     * Some method.
     *
     * @param oldChar char.
     * @param newChar char.
     * @return String.
     */
    public String replace(char oldChar, char newChar) { // замена первого символа
        char[] array = new char[str.length()];
        str.getChars(0, str.length(), array, 0);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldChar) {
                array[i] = newChar;
                break;
            }
        }
        return new String(array);
    }
}