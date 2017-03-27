package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public enum CurrencyEnum implements ICurrencyDemo {
    PENNY(1, new AbstractTeacher(1) {
        @Override
        public boolean excludeStudent(String name) {
            return false;
        }
    }) {
        @Override
        public void printValue() {
            System.out.println("Value of Penny");
        }

        @Override
        public void doSomethingIncredible() {

        }

    }, NICKLE(5, new AbstractTeacher(2) {
        @Override
        public boolean excludeStudent(String name) {
            return false;
        }
    }) {
        @Override
        public void doSomethingIncredible() {

        }

        @Override
        public void printValue() {

        }
    }, DIME(10, new AbstractTeacher(3) {
        @Override
        public boolean excludeStudent(String name) {
            return false;
        }
    }) {
        @Override
        public void doSomethingIncredible() {

        }

        @Override
        public void printValue() {

        }
    }, QUARTER(25, new AbstractTeacher(4) {
        @Override
        public boolean excludeStudent(String name) {
            return false;
        }
    }) {
        @Override
        public void doSomethingIncredible() {

        }

        @Override
        public void printValue() {

        }
    };

    public final int value;
    public final AbstractTeacher teacher;

    CurrencyEnum(int value, AbstractTeacher teacher) {
        this.value = value;
        this.teacher = teacher;
    }

    public abstract void printValue();
}
