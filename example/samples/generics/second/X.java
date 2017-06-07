package com.courses.apollo.generics.second;

/**
 * Unlike ordinary variables, type variables are named by single uppercase letters.
 * It helps us to differentiate type variables and ordinary class or interface name.
 * The most commonly used type parameter names are:
 * T - Type
 * S,U,V etc. - 2nd, 3rd, 4th types
 * V - Value
 * E - Element (used extensively by the Java Collections Framework) K - Key
 * N - Number
 * List<E> Generic Type, E is called formal parameter
 * List<Integer> Parameterized type, Integer is actual argument here
 * <T extends Comparable> Upper-bounded type parameter
 * List<?> Unbounded wildcard
 * <? extends T> Upper-bounded wildcard
 * <? super T> Down-Bounded wildcard
 * List Raw type
 * <T extends Comparable<T>> Recursive bounded type parameter
 */
public class X {


    static <T> void print(T t) {
        System.out.println(t.getClass().getName());
    }
}
