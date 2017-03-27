package com.courses.apollo.service;

/**
 * Test interface.
 */
@FunctionalInterface
public interface IFly {

    public String test = "Test";

    void fly();

    public class IFlyClass {

    }

    public static void testInFly() {
        System.out.println("Test");
    }

    public default void flyDefault() {
        System.out.println("Fly default");
    }

    public default void flyDefault(String test) {
        System.out.println("Fly default");
    }

}
