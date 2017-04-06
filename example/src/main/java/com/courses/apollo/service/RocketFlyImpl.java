package com.courses.apollo.service;

/**
 * Rocket fly impl.
 */
public class RocketFlyImpl implements IVerticalFly, IFly {

    @Override
    public void fly() {

        /**
         * Inner class.
         */
        class SomeFlyClass implements IFly {
            @Override
            public void fly() {
            }
        }

        SomeFlyClass someFlyClass = new SomeFlyClass();
        someFlyClass.fly();
    }

    @Override
    public void verticalFly() {
    }

    @Override
    public void flyDefault() {
        IVerticalFly.super.flyDefault();
    }
}
