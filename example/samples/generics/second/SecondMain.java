package com.courses.apollo.generics.second;


import com.courses.apollo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class SecondMain<T> {

    public static void main(String[] args) {

        /*This takes a single type parameter which appears before the return type.
        It prints the type information of the object passed to it.
        The type parameter’s scope is limited to the method in which it’s declared.
        We call this method like a normal method except that we specify the type parameter before the method name:*/
        X.<Integer>print(new Integer(2));
        X.<String>print(new String("aa"));


        /*The type of object must be same or a subtype of type argument.
        The value of type parameter may be inferred from method parameter and may be omitted:*/
        X.print(new Integer(2));
        X.print(new String("aa"));


        //The complete syntax for invoking this method would be:
        Y<Integer> y = new Y<Integer>();
        y.print(1, new String("aa"));
        //However, since the type parameters may be inferred from method parameter, we may omit them:
        y.print(new Integer(2), new String("aa"));
    }
}
