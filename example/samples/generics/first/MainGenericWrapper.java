package com.courses.apollo.generics.first;


public class MainGenericWrapper {
    public static void main(String[] args) {
        /*To refer to this generic type, we supply a concrete type name as argument*/
        GenericWrapper<String> w;
        /*Specify the type argument (String in this case) within angular brackets.
        We might think that GenericWrapper<String> stands for a version of GenericWrapper
        where T has been uniformly replaced by String. However, it is misleading, because the declaration
        of a generic is never actually expanded in this way.
         In fact, during compilation, all generic information will be removed entirely using
         a process called type Erasure.
         -----------------------------------------------------------------------------------------
         Like any other variable declaration, the above line does not actually create a new object.
         It simply declares a reference to a Wrapper<String> (pronounced as “Wrapper of String”).
         To instantiate this class, the new keyword is used, as usual,
         along with the type name (may be omitted in some cases) within angular brackets between the class name and the
         parenthesis:*/
        w = new GenericWrapper<String>();// We can declare new GenericWrapper<>()<- it is called brilliant.
        /*We can also do these things in one line, such as:*/
        GenericWrapper<String> w1 = new GenericWrapper<String>();
        /*To understand the syntax of generic class declaration, you can compare it with method declaration.
        Remember that during a method declaration, we use <!formal parameters> to hold actual arguments passed during
        method call. For example,


       public static int add(int a, int b) { // int a, int b are formal parameters
            return a + b ;
       }
        During the invocation, the formal parameters are substituted by the actual arguments. For example,
       method call: formal parameters substituted by actual arguments int result = add(2, 3); // 2 and 3 are actual arguments
       Type parameters used in the class declaration have the same purpose as the formal parameters used in the
       method declaration. A class can use formal type parameters to receive type arguments.
       The type names used during instantiation are called actual type arguments. During instance creation,
       such as GenericWrapper<String>, all occurrences of the formal type parameter T are replaced
       by the actual type argument String.
       Anyway, with this additional type information, compiler can perform type check during
       compile- time and ensure that there will be no runtime class cast error.
       Since, w is a kind of ‘GenericWrapper of String’ now, only String objects can be stored in it.
       */
        w.set(new String("abc"));

        /*Note that even if w is a generic instance, this syntax is exactly same as the previous one.
        However, any attempt to store an object other than String will result in a compilation error: */

        //-------
        //w.set(new Integer(10)); //compilation error
        //-------

        /*This wrapper is now targeted at only String, meaning only String instances can be stored into this wrapper.
        Accordingly, if we try to keep something else in it, the compiler will complain.
        The stored element may also be retrieved directly without a type cast as follows:
         */
        String s = w.get();
        /*The compiler knows that this wrapper can only contain String instances, so casts are not necessary.An attempt
        to cast to a different type will also result in a compilation error alerting you to what previously would have
        been a runtime bug.*/
        //---------
        //Integer i = (Integer) w.get(); //compilation error
        //
        /*Instead of relying on the programmer to keep track of object types and performing casts, which could lead
        to failures at runtime dif cult to debug and solve, the compiler can help the programmer enforce a greater
        number of type checks and detect more failures at compile time.*/
    }
}
















