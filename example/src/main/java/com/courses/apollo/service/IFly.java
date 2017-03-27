package com.courses.apollo.service;

/**
 * Test interface.
 */
@FunctionalInterface
public interface IFly {
    /**
     * Just string to test.
     */
    String TEST = "Test";

    /**
     * Fly method.
     */
    void fly();

    /**
     * Inner class.
     */
    class IFlyClass {

    }

    /**
     * Static method in interface.
     */
    static void testInFly() {
        System.out.println("Test");
    }

    /**
     * Default fly method.
     */
    default void flyDefault() {
        System.out.println("Fly default");
    }

    /**
     * Default fly overloaded method.
     *
     * @param test input String.
     */
    default void flyDefault(String test) {
        System.out.println("Fly default");
    }

}
