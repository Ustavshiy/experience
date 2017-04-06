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
    }

    /**
     * Default fly method.
     */
    default void flyDefault() {
    }

}
