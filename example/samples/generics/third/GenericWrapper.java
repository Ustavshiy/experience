package com.courses.apollo.generics.third;

/**
 * The <T> after class name indicates that the class is a generic one.
 *
 * @param <T> formal type parameter T
 */
public class GenericWrapper<T> {
    T o;

    void set(T o) {
        this.o = o;
    }

    T get() {
        return o;
    }
}
