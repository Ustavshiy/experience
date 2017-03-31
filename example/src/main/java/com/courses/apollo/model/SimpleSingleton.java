package com.courses.apollo.model;

/**
 * Class for a Simple Singleton.
 */
public final class SimpleSingleton {

    /**
     * Class field for example.
     */
    private static SimpleSingleton instance;

    private SimpleSingleton() {

    }

    /**
     * Creates an instance of the class.
     * @return INSTANCE.
     */
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

    /**
     * doSomething displays the text.
     */
    public void doSomething() {
        System.out.println("Hello Class!!!!!");
    }

}
