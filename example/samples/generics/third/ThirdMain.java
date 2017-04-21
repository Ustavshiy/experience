package com.courses.apollo.generics.third;


public class ThirdMain {
    public static void main(String[] args) {

        /*The generic method f() de nes one type parameter named T.
        Java compiler can infer the type argument even if it is not explicitly speci ed during method call.*/
        A.f(2); //T is Integer
        /*However, we can also specify the type argument explicitly:*/
        A.<Integer>f(2); //Explicit type argument, T is Integer

        /*The method argument must be convertible to the explicit type argument. So, the following is correct:*/
        A.<Number>f(2); //OK, T is Number and Integer can be converted to Number However,the following is not correct as 2 cannot be cast to String.
        //A.<String>f(2); //Error, T is String, however Integer can’t be cast to String

        /*The class X takes a single type parameter T.
        The constructor for X itself takes another type parameter and uses class’s type parameter as well.
        Compiler can infer these type parameters from the constructor call:
         */
        new X<>("", 3);//T is String and S is Integer
        //We can also specify type argument for the class explicitly:
        new X<String>("", 3);
        new X<Object>("", 3);

        new <Integer>X<String>("", 3);// T is String and S is Integer
        new <Number>X<String>("", 3);// T is String and S is Number
        new <Integer>X<Object>("", 3);// T is Object and S is Integer
        new <Number>X<Object>("", 3);// T is Object and S is Number

        //--------------
        /*The generic classes or methods we have written may take any reference type arguments.
          For example, the Wrapper class can take arbitrary arguments:
         */
        GenericWrapper<Integer> gwi;
        GenericWrapper<Double> gwd;
        GenericWrapper<String> gws;
        GenericWrapper<Exception> gwe;
        GenericWrapper<Object> gwo;

        //--Bounded Type
        /*This tells that the type argument to Wrapper can only be either Number or anything that extends Number.
         Note that, the keyword extends is used in a general sense to mean either extends for classes or implements
         for interfaces.
         The generic type name is similar to unbounded generic type except that if we try to use any
         type that is not Number, it results in a compilation error.*/

        //Wrapper<String> ws;<--- compilation error
        //Wrapper<Exception> we;<--- compilation error
        //Wrapper<Object> wo;<--- compilation error

        /*The above types are now wrong as neither String nor Exception nor Object is a sub-type of Number.
         However, the following remains still valid:*/
        Wrapper<Integer> wi;
        Wrapper<Double> wd;
        //Bounded type parameters can be used with interfaces as well as methods.
        //interface MyIntf <T extends Number> {}
        //The interface MyIntf and the method printNumber() only take argument of type Number
        // or its sub-type whereas max() takes argument of type Comparable<T> or its sub-type.
    }

    /*However, if we want to restrict that Wrapper to only accept certain arguments, we specify it as bounded type
    parameter:
     */
    class Wrapper<T extends Number> {/*...*/
    }

    interface MyIntf<T extends Number> {
    }

    static <T extends Number> void printNumber(T t) {
    }

    static <T extends Comparable<T>> int max(T a, T b) {
        return a.compareTo(b);
    }
}










