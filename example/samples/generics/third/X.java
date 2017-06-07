package com.courses.apollo.generics.third;

/**
 * Created by roman.andrianov on 9/1/16.
 */
public class X<T> {
    T t;

    <S> X( S s, T t) {
    }

    static <T extends Number, S extends Number> T doSomething(S s) {
        return (T)s;
    }
}
