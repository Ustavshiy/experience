package com.courses.apollo.generics.first;


public class MainWrapper {
    public static void main(String[] args) {
        /*This class represents a general-purpose wrapper class.
        Since, internally it maintains a reference of type Object, which is the super class
        of all other types, it can hold arbitrary Java object.
        So, the following statement is valid:*/

        Wrapper w = new Wrapper();
        w.set(new String("abc"));

        /*It creates a wrapper instance and stores a String object in it using its add()
        method.
        Since, any object may be added, and get() method returns it as an Object instance,
        it is necessary to type cast:*/

        String s = (String) w.get();

        /*Since, the wrapper indeed holds a String object, Object to String casting is correct.
        Compiler also remains silent as it observes that the statement is syntactically correct.
        However, the situation may not be as simple as above.
        A careless programmer (or by mistake), may write a statement as follows:*/

        Integer x = (Integer) w.get();

        /*Note that type of the object held is String.So, casting it to an Integer type is illegal. Although, Java can
        determine this anomaly at runtime and informs us by throwing a ClassCastException,
        there is no provision to determine it at compile time as there is no syntax error in the statement.
        Since, compiler only cares about syntax, it cannot restrict programmers from such incorrect type casting.
        Since, the above code still compiles, we wouldn’t know anything is wrong until runtime.
         It is also possible to keep different type of object at different time.*/

        w.set(new String("xyz"));
        w.set(new Integer(2));
    }
}
