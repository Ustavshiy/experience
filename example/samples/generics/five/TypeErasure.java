package com.courses.apollo.generics.five;


import com.courses.apollo.main.generics.first.GenericWrapper;

public class TypeErasure {
    public static void main(String[] args) {
//Note that generics was introduced for compile time type-checking and has no implication at run time.
// Accordingly, compiler uses a technique called type erasure where it takes the following steps:
//Replace all type parameters with their bounds or Object (for unbounded type parameters).
// Therefore, the resultant bytecode contains only ordinary classes, interfaces, and methods.
//Insert type casts if necessary to preserve type safety.
//Generate bridge methods to preserve polymorphism in extended generic types.
        /*For example, if we have a generic class like below:
        class Wrapper <T> {
        T o;
        void set(T o) { this.o = o; }
        T get() { return o; }
    }
         */
        /*
        The Java compiler replaces it with Object, since T is unbounded:
        class Wrapper {
            Object o;
            void set(Object o) { this.o = o; } Object get() { return o; }
        }*/

        //This class looks like an ordinary class. The compiler also inserts the required downcast operator in
        // the user codes. For example, consider the following user code:
        GenericWrapper<String> w = new GenericWrapper<String>();
        w.set(new String("abc"));
        String s = w.get();
        //It will be replaced by
        /*
        Wrapper w = new Wrapper();
        w.set(new String("abc"));
        String s = (String)w.get();
        */
        //upcast is type-safe
        // compiler inserts downcast operation
//        Similarly, consider the following class that uses a bounded type parameter:
//        class Wrapper <T extends Integer> {
//            T o;
//            void set(T o) { this.o = o; }
//            T get() { return o; }
//        }
//        The Java compiler replaces the bounded type parameter T with the bound Integer:
//        class Wrapper <T extends Integer> {
//            Integer o;
//            void set(Integer o) { this.o = o; }
//            Integer get() { return o; }
//        }
//        The Java compiler also erases type parameters in generic methods. Consider the following generic
//        method:
//        class X {
//            static <T> void print(T t) {/*...*/} }
//        Since, T is unbounded, the Java compiler replaces it with Object:
//        class X {
//            static void print(Object t) {/*...*/} }
//        The implication of type erasure is that the type argument is not available at runtime for use in casts or as the argument to the instanceof method.
//                Generics are often compared with templates in C++. However, unlike C++ templates, which creates a new type for each type argument, in Java generics there is just one class  le which is used to create instances for all the type arguments.
//        The full details of erasure are beyond the scope of this book. However, the simple description we just gave isn’t far from the truth. It is good to know a bit about this.
    }


}
