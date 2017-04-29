package com.courses.apollo.model;

import com.courses.apollo.model.figure.Shape;

import java.io.Serializable;

/**
 * Created by User on 27.04.2017.
 * @param <TT> generic.
 * @param <SS> generic.
 */
public class SimpleGenericClass<TT, SS extends Shape & Serializable> {

    public SimpleGenericClass(TT first, SS second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Field first type S.
     */
    private TT first;

    /**
     * Field second type S.
     */
    private SS second;

    /**
     * Method doSomething.
     * @param t  is object type T.
     * @param <T> type of object.
     * @return t.
     */
    public static <T> T doSomehting(T t) {
        return t;
    }

    /**
     * Setter to first.
     * @param jnrc is jeneric.
     * @param <G> is generic.
     * @return first.
     */
    public <G> TT setFirst(G jnrc) {
        return first;
    }

    public SS getSecond() {
        return second;
    }

    public void setSecond(SS second) {
        this.second = second;
    }

    /**
     * Method return shape.
     * @param t is object type T.
     * @param <T> extends Shape
     * @return t.
     */
    public <T extends Shape> T returnSomeShape(T t) {
        return t;
    }

    /**
     * Override method to return Shape.
     * @param t is object type T.
     * @param type is type.
     * @param <E> extends Shape & Comparable.
     * @return t.
     */
    public <E extends Shape & Comparable> E returnSomeShape(E t, E type) {
        t.compareTo(type);
        return t;
    }

}
