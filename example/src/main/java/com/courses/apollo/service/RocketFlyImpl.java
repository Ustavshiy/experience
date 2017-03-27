package com.courses.apollo.service;

/**
 * Rocket fly impl.
 */
public class RocketFlyImpl implements IVerticalFly, IFly {

    @Override
    public void fly() {
        class SomeFlyClass implements IFly {
            @Override
            public void fly() {

            }
        }
        System.out.println("Rocket fly");
    }

    @Override
    public void verticalFly() {
        System.out.println("Vertical Fly");
    }

    @Override
    public void flyDefault() {
        IVerticalFly.super.flyDefault();
    }
}
