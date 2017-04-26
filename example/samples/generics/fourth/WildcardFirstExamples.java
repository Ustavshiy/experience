package com.courses.apollo.generics.fourth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roman.andrianov on 9/1/16.
 */
public class WildcardFirstExamples {
    public static void main(String[] args) {
        //According to the Substitution Principle, if we have a collection of numbers, we may add an integer or a
        // double to it, because Integer and Double are subtypes of Number.

        List<Number> nums = new ArrayList<Number>(); nums.add(2);
        nums.add(3.14);
        assert nums.toString().equals("[2, 3.14]");

        //Here, subtyping is used in two ways for each method call.
        // The first call is permitted because nums has type List<Number>,
        // which is a subtype of Collection<Number>, and 2 has type Integer (thanks to boxing),
        // which is a subtype of Number. The second call is similarly permitted.
        // In both calls, the E in List<E> is taken to be Number.
        //It may seem reasonable to expect that since Integer is a subtype of Number,
        // it follows that List<Integer> is a subtype of List<Number>.
        // But this is not the case, because the Substitution Principle would rapidly get us into trouble.
        // It is not always safe to assign a value of type List<Integer> to a variable of type List<Number>.
        // Consider the following code fragment:

        /*
        List<Integer> ints = new ArrayList<Integer>(); ints.add(1);
        ints.add(2);
        List<Number> numsTwo = ints; // compile-time error nums.add(3.14);
        assert numsTwo.toString().equals("[1, 2, 3.14]");*/

        //This code assigns variable ints to point at a list of integers, and then assigns nums to point
        // at the same list of integers; hence the call in the fifth line adds a double to this list,
        // as shown in the last line. This must not be allowed!
        // The problem is prevented by observing that here the Substitution Principle does not apply:
        // the assignment on the fourth line is not allowed because List<Integer> is not a subtype of List<Number>,
        // and the compiler reports that the fourth line is in error.
        //What about the reverse? Can we take List<Number> to be a subtype of List<Integer>?
        // No, that doesn’t work either, as shown by the following code:

        /*
        List<Number> numsThree = new ArrayList<Number>(); nums.add(2.78);
        nums.add(3.14);
        List<Integer> numsThree = nums; // compile-time error
        assert numsThree.toString().equals("[2.78, 3.14]"); */

        /*The problem is prevented by observing that here the Substitution Principle does not apply:
          the assignment on the fourth line is not allowed because List<Number> is not a subtype of List<Integer>,
          and the compiler reports that the fourth line is in error.
         So List<Integer> is not a subtype of List<Number>, nor is List<Number> a subtype of List<Integer>;
         all we have is the trivial case, where List<Integer> is a subtype of itself,
         and we also have that List<Integer> is a subtype of Collection<Integer>.
        Arrays behave quite differently; with them, Integer[] is a subtype of Number[].
        Sometimes we would like lists to behave more like arrays,
        in that we want to accept not only a list with elements of a given type, but also a
        list with elements of any subtype of a given type. For this purpose, we use wildcards.*/


    }

    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }
}
