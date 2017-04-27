package com.courses.apollo.generics.fourth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by roman.andrianov on 9/1/16.
 */
public class WildcardSupperExample {
    public static void main(String[] args) {
        //It may be good practice to insert wildcards whenever possible, but how do you decide which wildcard to use?
        // Where should you use extends, where should you use super, and where is it inappropriate to use a wildcard at all?
        //Fortunately, a simple principle determines which is appropriate.
        //The Get and Put Principle: use an extends wildcard when you only get values out of a structure,
        // use a super wildcard when you only put values into a structure, and don’t use a wildcard when
        // you both get and put.
        //We already saw this principle at work in the signature of the copy method:
        //public static <T> void copy(List<? super T> dest, List<? extends T> src)
        //The method gets values out of the source src, so it is declared with an extends wildcard,
        // and it puts values into the destination dst, so it is declared with a super wildcard.
        // Whenever you use an iterator, you get values out of a structure, so use an extends wildcard.
        // Here is a method that takes a collection of numbers, converts each to a dou- ble, and sums them up:

        /*
        public static double sum(Collection<? extends Number> nums) { double s = 0.0;
            for (Number num : nums) s += num.doubleValue();
            return s;
        }*/
        //Since this uses extends, all of the following calls are legal:
        List<Integer> ints = Arrays.asList(1, 2, 3);
        assert sum(ints) == 6.0;
        List<Double> doubles = Arrays.asList(2.78, 3.14);
        assert sum(doubles) == 5.92;
        List<Number> nums = Arrays.<Number>asList(1, 2, 2.78, 3.14);
        assert sum(nums) == 8.92;
        //The first two calls would not be legal if extends was not used.
        //Whenever you use the add method, you put values into a structure, so use a super wildcard.
        // Here is a method that takes a collection of numbers and an integer n, and puts the first n integers,
        // starting from zero, into the collection:

        //Since this uses super, all of the following calls are legal:
        List<Integer> intsT = new ArrayList<Integer>();
        count(intsT, 5);
        assert intsT.toString().equals("[0, 1, 2, 3, 4]");
        List<Number> numsT = new ArrayList<Number>();
        count(numsT, 5);
        nums.add(5.0);
        assert numsT.toString().equals("[0, 1, 2, 3, 4, 5.0]");
        List<Object> objs = new ArrayList<Object>();
        count(objs, 5);
        objs.add("five");
        assert objs.toString().equals("[0, 1, 2, 3, 4, five]");

        //The last two calls would not be legal if super was not used.
        //Whenever you both put values into and get values out of the same structure, you should not use a wildcard.
        //The collection is passed to both sum and count, so its element type must both extend Number(as sum requires)
        //and be super to Integer (as count requires).The only two classes that satisfy both of these constraints
        //are Number and Integer, and we have picked the first of these.Here is a sample call:

        List<Number> numsThree = new ArrayList<Number>();
        double sum = sumCount(numsThree,5);
        assert sum == 10;
        //Since there is no wildcard, the argument must be a collection of Number.
        //If you don’t like having to choose between Number and Integer,
        // it might occur to you that if Java let you write a wildcard with both extends and super,
        // you would not need to choose. For instance, we could write the following:

        /*
        double sumCount(Collection<? extends Number super Integer> coll, int n) // not legal Java!
        */
        //Then we could call sumCount on either a collection of numbers or a collection of integers.
        // But Java doesn’t permit this. The only reason for outlawing it is simplicity, and con- ceivably
        // Java might support such notation in the future. But, for now, if you need to both get and put then
        // don’t use wildcards.
        //The Get and Put Principle also works the other way around.
        // If an extends wildcard is present, pretty much all you will be able to do is get but not put
        // values of that type; and if a super wildcard is present, pretty much all you will be able to
        // do is put but not get values of that type.
        //For example, consider the following code fragment, which uses a list declared with an extends wildcard:

        List<Integer> intsFour = new ArrayList<Integer>(); intsFour.add(1);
        intsFour.add(2);
        List<? extends Number> numsFour = intsFour;
        double dbl = sum(numsFour); // ok
        //numsFour.add(3.14); // compile-time error

        //The call to sum is fine, because it gets values from the list, but the call to add is not, because it puts
        // a value into the list. This is just as well, since otherwise we could add a double to a list of integers!
        //Conversely, consider the following code fragment, which uses a list declared with a super wildcard:

        List<Object> objects = new ArrayList<Object>(); objs.add(1);
        objects.add("two");
        List<? super Integer> intsFive = objects; ints.add(3); // ok
        //double dblTwo = sum(intsFive); // compile-time error
        //Now the call to add is fine, because it puts a value into the list, but the call to sum is not,
        // because it gets a value from the list. This is just as well,
        // because the sum of a list containing a string makes no sense!
        //The exception proves the rule, and each of these rules has one exception.
        // You cannot put anything into a type declared with an extends wildcard—except for the value null,
        // which belongs to every reference type:
        List<Integer> intsSix = new ArrayList<Integer>();
        intsSix.add(1);
        intsSix.add(2);
        List<? extends Number> numsSix = intsSix;
        numsSix.add(null); // ok
        assert intsSix.toString().equals("[1, 2, null]");
        //Similarly, you cannot get anything out from a type declared with a super wildcard—except for a value
        // of type Object, which is a supertype of every reference type:
        List<Object> objsTwo = Arrays.<Object>asList(1,"two");
        List<? super Number> intsSeven = objsTwo;
        intsSeven.add(1);
        intsSeven.get(0);
        intsSeven.add(0.0);
        String str = "";
        for (Object obj : ints) str += obj.toString(); assert str.equals("1two");
        //You may find it helpful to think of ? extends T as containing every type in an interval bounded
        // by the type of null below and by T above (where the type of null is a subtype of every reference type).
        // Similarly,you may think of ? super T as containing every type in an interval bounded by T below and by Object
        // above.
        //It is tempting to think that an extends wildcard ensures immutability, but it does not. As we saw earlier,
        // given a list of type List<? extends Number>, you may still add null values to the list. You may also remove list elements (using remove, removeAll, or retai nAll) or permute the list (using swap, sort, or shuffle in the convenience class Collec tions; see Section 17.1.1). If you want to ensure that a list cannot be changed, use the method unmodifiableList in the class Collections; similar methods exist for other col- lection classes (see Section 17.3.2). If you want to ensure that list elements cannot be changed, consider following the rules for making a class immutable given by Joshua Bloch in his book Effective Java (Addison-Wesley) in Chapter 4 (item “Minimize mu- tability”/“Favor immutability”); for example, in Part II, the classes CodingTask and PhoneTask in Section 12.1 are immutable, as is the class PriorityTask in Section 13.2.
        //Because String is final and can have no subtypes, you might expect that List<String> is the same type
        // as List<? extends String>. But in fact the former is a subtype of the latter,
        // but not the same type, as can be seen by an application of our principles.
        // The Substitution Principle tells us it is a subtype, because it is fine to pass a value of the former
        // type where the latter is expected. The Get and Put Principle tells us that it is not the same type,
        // because we can add a string to a value of the former type but not the latter.

    }

    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums) s += num.doubleValue();
        return s;
    }

    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) ints.add(i);
    }

    public static double sumCount(Collection<Number> nums, int n) {
        count(nums, n);
        return sum(nums);
    }
}
