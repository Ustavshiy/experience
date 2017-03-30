package com.courses.apollo.model;


public class SimpleSingleton {
    private static SimpleSingleton INSTANCE;

    private SimpleSingleton() {

    }

    public static SimpleSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SimpleSingleton();
        }
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("Hello Class!@!!!!");
    }


}
