package com.courses.apollo.generics.second;

/**
 * Created by User on 24.04.2017.
 */
public class A<T extends A<T>> {


    static {
        A<B> ex = new A<>();
    }
}
