package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public enum CurrencyEnum implements ICurrencyDemo {
    /**
     * enum PENNY.
     */
    PENNY(1) {
        @Override
        public void printValue() {

        }
    },
    /**
     * enum NICKLE.
     */
    NICKLE(5) {
        @Override
        public void printValue() {

        }
    },
    /**
     * enum DIME.
     */
    DIME(10) {
        @Override
        public void printValue() {

        }
    },
    /**
     * enum quarter.
     */
    QUARTER(25) {
        @Override
        public void printValue() {

        }
    };

    /**
     * Enum variable value.
     */
    private final int value;

    CurrencyEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /**
     * Method in enum. Prints value.
     */
    public abstract void printValue();

    @Override
    public void doSomethingIncredible() {

    }
}