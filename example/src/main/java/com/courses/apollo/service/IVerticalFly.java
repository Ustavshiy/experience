package com.courses.apollo.service;

/**
 * Vertical Fly for Falcon.
 */
public interface IVerticalFly {

    void verticalFly();

    public default void flyDefault() {
        System.out.println("Fly default in vertical Fly");
    }

}
