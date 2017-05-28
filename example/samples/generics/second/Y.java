package com.courses.apollo.generics.second;


public class Y<S> {

    <T> void print(S s, T t) {
        System.out.println(s.getClass().getName());
        System.out.println(t.getClass().getName());
    }
}
