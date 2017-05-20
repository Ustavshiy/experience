package com.courses.apollo.generics.first;


import java.util.ArrayList;
import java.util.List;

public class GenericsInList {
    public static void main(String[] args) {
        /**
         * the bytecode compiled from the two sources above will be identical.
         * We say that generics are implemented by erasure because the types List<Integer>,
         * List<String>, and List<List<String>> are all represented at run-time by the same type, List.
         * We also use erasure to describe the process that converts the first program to the second.
         * The term erasure is a slight misnomer, since the process erases type parameters but adds casts.
         Generics implicitly perform the same cast that is explicitly performed without generics.
         If such casts could fail, it might be hard to debug code written with generics.
         This is why it is reassuring that generics come with the following guarantee:
         Cast-iron guarantee: the implicit casts added by the compilation of generics never fail.
         There is also some fine print on this guarantee: it applies only when no unchecked warnings
         have been issued by the compiler.
         Later, we will discuss at some length what causes unchecked warnings to be issued and how to
         minimize their effect.
         */


        List<String> words = new ArrayList<>();
        words.add("Hello ");
        words.add("world!");
        String str = words.get(0) + words.get(1);
        assert str.equals("Hello world!");


        List wordsNonGeneric = new ArrayList();
        wordsNonGeneric.add("Hello ");
        wordsNonGeneric.add("world!");
        wordsNonGeneric.add("world!");
        String str2 = ((String) wordsNonGeneric.get(0)) + ((String) wordsNonGeneric.get(1));
        assert str2.equals("Hello world!");
        /*
        This last point is worth some elaboration. It means that you don’t get nasty problems due to maintaining two
        versions of the libraries: a nongeneric legacy version that works with Java 1.4 or earlier,
        and a generic version that works with Java 5 and 6.
        At the bytecode level, code that doesn’t use generics looks just like code that does.
        There is no need to switch to generics all at once—you can evolve your code by updating just one package,
        class, or method at a time to start using generics.
        We even explain how you may declare generic types for legacy code.
        (Of course, the cast-iron guarantee mentioned above holds only if you add generic types that match
        the legacy code.)
         */
        //Diff between C++ and Java generics
        /*
        Generics Versus Templates Generics in Java resemble templates in C++.
        There are just two important things to bear in mind about the relationship between
        Java generics and C++ templates: syntax and semantics.
        The syntax is deliberately similar and the semantics are deliberately different.
        Syntactically, angle brackets were chosen because they are familiar to C++ users,
        and because square brackets would be hard to parse.
        However, there is one difference in syntax.
        In C++, nested parameters require extra spaces, so you see things like this:
        List< List<String> >
        In Java, no spaces are required, and it’s fine to write this:
        List<List<String>>
        You may use extra spaces if you prefer,
        but they’re not required. (In C++, a problem arises because >> without the space denotes the right-shift
        operator. Java fixes the problem by a trick in the grammar.)
        Semantically, Java generics are defined by erasure, whereas C++ templates are defined by expansion.
        In C++ templates, each instance of a template at a new type is compiled separately.
        If you use a list of integers, a list of strings, and a list of lists of string,
        there will be three versions of the code. If you use lists of a hundred different types,
        there will be a hundred versions of the code—a problem known as code bloat.
        In Java, no matter how many types of lists you use, there is always one version of the code,
        so bloat does not occur.
         */
    }

}
