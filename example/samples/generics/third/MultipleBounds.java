package com.courses.apollo.generics.third;

/**
 * Multiple Bounds And Substitution Principle
 * Subtyping is a key feature of object-oriented languages such as Java.
 * In Java, one type is a subtype of another if they are related by an extends or implements
 * clause.
 Subtyping is transitive, meaning that if one type is a subtype of a second, and the second
 is a subtype of a third,
 then the first is a subtype of the third. So, from the last two lines in the preceding list,
 it follows that
 List<E> is a subtype of Iterable<E>.
 If one type is a subtype of another, we also say that the second is a supertype of the first.
 Every reference type is a subtype of Object, and Object is a supertype of every reference type.
 We also say, trivially, that every type is a subtype of itself.
 The Substitution Principle tells us that wherever a value of one type is expected, one may
 provide a value of any
 subtype of that type:
 Substitution Principle: a variable of a given type may be assigned a value of any subtype of
 that type, and a method
 with a parameter of a given type may be invoked with an argument of any subtype of that type.

 Integer is subtype of Number
 Double is subtype of Number
 ArrayList<E> is subtype of List<E>
 List<E> is subtype of Collection<E>
 Collection<E> is subtype of Iterable<E>
 */
public class MultipleBounds {
    public static void main(String[] args) {
//         A type parameter may have more than one bound and is written as:
//        <T extends C & I1 & I2>

//        It means T must be a subtype of C, I1 and I2.
//      In general if multiple bounds are speci ed, the type variable
//        must be a subtype of all listed bound types.
//      If one of the bounds is a class, it must be speci ed  rst.
//        Given the following types:
//        class C { /* ... */ }
//        interface I { /* ... */ }
//        The following bound speci cation is wrong as the class name is not speci ed  rst in the bound list.
//           <T extends I & C>
//                The correct one is:
//           <T extends C & I>
//                We can’t have more than one class in multiple bounds. The following are some other examples:
//<T extends C>//T has bound C
//<T extends I>//T has bound I
//<T extends C & I>//T has bound C and I
//<T, S extends C>//T is unbounded, S has bound C
//<T, S extends I>//T is unbounded, S has bound I
//<T, S extends C & I>//T is unbounded, S has bound C and I
//<T extends C, S>//T has bound C, S is unbounded
//<T extends I, S>//T has bound C and I, S is unbounded
//<T extends C & I, S>//T has bound C and I, S is unbounded
//<T extends C, S extends C>//Both T and S have bound C
//<T extends C, S extends I>//T has bound C, S has bound I
//<T extends I, S extends C>//T has bound I, S has bound C
//<T extends C & I, S extends C & I>//Both T and S have bound C &

    }
}
