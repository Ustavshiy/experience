package com.courses.apollo.generics.fourth;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Upper-bound wildcard
public class WildcardExtendsExample {
    public static void main(String[] args) {
        //Clearly, given a collection of elements of type E, it is OK to add all members of another
        // collection with elements of type E. The quizzical phrase "? extends E"
        // means that it is also OK to add all members of a collection with elements of any type that is a subtype of E.
        // The question mark is called a wildcard, since it stands for some type that is a subtype of E.
        // Here is an example. We create an empty list of numbers, and add to it first a list of integers and then
        // a list of doubles:

        List<Number> nums = new ArrayList<Number>();
        List<Integer> ints = Arrays.asList(1, 2);
        List<Double> dbls = Arrays.asList(2.78, 3.14);
        nums.addAll(ints);
        nums.addAll(dbls);
        assert nums.toString().equals("[1, 2, 2.78, 3.14]");
        //The first call is permitted because nums has type List<Number>, which is a subtype of Collection<Number>,
        // and ints has type List<Integer>, which is a subtype of Collection<? extends Number>.
        // The second call is similarly permitted.In both calls,Eistaken to be Number.
        // If the method signature for addAll had been written without the wildcard,
        // then the calls to add lists of integers and doubles to a list of numbers would not have been permitted;
        // you would only have been able to add a list that was explicitly declared to be a list of numbers.

        //We can also use wildcards when declaring variables. Here is a variant of the example at the end of
        // the preceding section, changed by adding a wildcard to the second line:


        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        List<? extends Number> wints = integers;
        //wints.add(3.14); // compile-time error
        assert ints.toString().equals("[1, 2, 3.14]");

        /*Before, the fourth line caused a compile-time error (because List<Integer> is not a subtype of List<Number>),
        but the fifth line was fine (because a double is a number, so you can add a double to a List<Number>).
        Now, the fourth line is fine (because List<Integer> is a subtype of List<? extends Number>),
        but the fifth line causes a com- pile-time error(because you cannot add a double to a List<? extends Number>,
        since it might be a list of some other subtype of number).
        As before, the last line shows why one of the preceding lines is illegal!
        In general,if a structure contains element swith a type of the form ? extends E,we can
        get elements out of the structure, but we cannot put elements into the structure.
        To put elements into the structure we need another kind of wildcard, as explained in the next section.
         */

        List<Lion> lionCage = new ArrayList<Lion>();
        List<Butterfly> butterflyCage = new ArrayList<Butterfly>();
        //“List of some kind of animal” syntactically? This is represented as:
        List<? extends Animal> someAnimalCage;
        /*And is read as “List of unknown type which is either Animal or a sub-type of it”.
         So, for this type of cage, either a lion cage or a butter y cage may be provided.
         */
        someAnimalCage = lionCage;
        someAnimalCage = butterflyCage;

        /*Since, <? extends Animal> represents any type bounded by the type Animal,
        it is said to be bounded wildcard with the upper bound Animal.
<!Note that, the keyword extends is used in a general sense to mean either extends for classes or implements for interfaces!>
        However, we cannot add any lions or butter ies to this kind of cage.
        This is because, if someAnimalCage refers to a lion cage (bars are not so close) and if we put
        some butter ies there, they will  y away. Similarly,
        if someAnimalCage refers to a butter y cage (bars are not so strong) and if we put some lions there,
        they will break the cage and escape. So the following are incorrect:*/

        /*
        someAnimalCage.add(new Lion());
        someAnimalCage.add(new Butterfly());*/


//        What will the usage of this kind of cage be then?
//        Although, we cannot put anything (except null) there, we can still view its contents.
        for (Animal an : someAnimalCage) {
            an.free();
        }
        //ince, someAnimalCage contains Animal or any sub-type of Animal, it is safe to assign its elements to an
        // Animal type variable. A method may also use such upper-bounded wildcards.

        //static void f(List<? extends Animal> l) {/*...*/}

        //With this declaration, the method f() may be invoked supplying both lionCage as well as butter yCage:
        f(lionCage); //OK f(butterflyCage); //OK

        //The method f() can access the list elements as type Animal:
        //Similarly, if we want to write the method that works on List<Number>, List<Integer>, List<Double>, List<Float> etc., we specify it as:
        //In general, for an “in” parameter that serves up data to the function, an upper-bounded wildcard is used.*/

    }

    public static <T extends Number> List<? super T> copy(List<? super T> dst, List<? extends T> src) {
        dst.get(0);
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
        return dst;
    }

    interface Collection<E> {
        public boolean addAll(Collection<? extends E> c);
    }

    static void f(List<? extends Animal> l) {/*...*/}

    static void fTwo(List<? extends Animal> l) {
        for (Animal elem : l) {
        }
    }

    static void g(List<? extends Number> l) {/*...*/}
}
