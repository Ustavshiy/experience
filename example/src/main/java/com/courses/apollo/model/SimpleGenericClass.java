package com.courses.apollo.model;

import com.courses.apollo.model.figure.Shape;

import java.io.Serializable;

/**
 * Created by User on 27.04.2017.
 */
public class SimpleGenericClass<T, S extends Shape & Serializable> {
    T first;
    S second;

    public <U, V> SimpleGenericClass(U u, V v) {
        setSomething(u);
        System.out.println(v.toString());
    }

    public static <T> T doSomehting(T t) {
        return t;
    }

    public <Jeneric> T setFirst(Jeneric jeneric) {
        return first;
    }

    public <U> void setSomething(U u) {
        System.out.println(u.toString());
    }

    public <T extends Shape> T returnSomeShape(T t) {
        return t;
    }

    public <E extends Shape & Comparable> E returnSomeShape(E t, E type) {
        t.compareTo(type);
        return t;
    }

}
