package com.courses.apollo.generics.first;

/**
 * The <T> after class name indicates that the class is a generic one.
 *
 * @param <T> formal type parameter T
 */
public class GenericWrapper<T> {
    T o;

    public void set(T o) {
        this.o = o;
    }

    public T get() {
        return o;
    }
}
