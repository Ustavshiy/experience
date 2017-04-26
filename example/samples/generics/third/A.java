package com.courses.apollo.generics.third;

/**
 * Sometimes it is possible to  nd some type information automatically from the arguments passed to methods or constructors.
 * This ability is known as type inference and may
 • Determine the types of the arguments.
 • Determine the type that the result is being assigned, or returned (if available).
 • Find the most speci c type that works with all of the arguments.
 */
public class A {

    /*Oracle doc
    Type inference is a Java compiler's ability to look at each method invocation and corresponding declaration to
    determine the type argument (or arguments) that make the invocation applicable.
    The inference algorithm determines the types of the arguments and, if available, the type that the result is
    being assigned, or returned. Finally, the inference algorithm tries to find the most specific type that works
    with all of the arguments.
     */
    static <T> void f(T t){};
}
