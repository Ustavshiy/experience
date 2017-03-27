package com.courses.apollo.service;

/**
 * Vertical Fly for Falcon.
 */
public interface IVerticalFly {
    /**
     * Vertical fly method.
     */
    void verticalFly();

    /**
     * Default method.
     */
    default void flyDefault() {
        System.out.println("Fly default in vertical Fly");
    }

}
